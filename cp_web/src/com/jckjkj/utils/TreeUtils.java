package com.jckjkj.utils;

import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.util.ArrayList;
import java.util.List;

import com.jckjkj.mybatis.model.Station;

/**
 * 将查询数据解析成easyui tree结构
 * @author Martin
 */
public class TreeUtils 
{	
	static List<Station> slist;
	static ArrayList<TreeUtils.Node> rootlist;
	public static String collection2tree(List<Station> list,Boolean iftree)
	{
		slist=list;
		TreeUtils tu=new TreeUtils();
		rootlist=new ArrayList<TreeUtils.Node>();	
		if(iftree)
		{
			Node node=tu.copyData(list.get(0));
			rootlist.add(node);
			System.out.println("#root id"+node.getId()+"  text:"+node.getText());
			tu.createTree();
		}else {
			tu.convert2Nodes();
		}
		return nodesListToJson(rootlist);
	}
	//----------function---------
	private  void convert2Nodes()
	{
		for(int i=0;i<slist.size();i++)
		{
			rootlist.add(copyData(slist.get(i)));
		}
	}
	/**
	 * rootlist必须有一个节点
	 */
	private void createTree()
	{
		Node pNode= rootlist.get(0);
		int pid=slist.get(0).getId();
		addNode(1,pid,pNode,rootlist);
	}
	/**
	 * 
	 */
	private void addNode(int index,int pid,Node pNode,List<TreeUtils.Node> pplist)
	{
		Station station=slist.get(index);
		Node node=copyData(station);
		System.out.println("# id"+node.getId()+"  text:"+node.getText());
		if(station.getPid()==pNode.getId())//子孙
		{
			System.out.println(" @子 ");
			pNode.childrenList.add(node);
			pplist=pNode.childrenList;
			pid=pNode.id;
		}else if(station.getPid()==pid)
		{
			System.out.println("@同胞");
			pplist.add(node);//同胞
		}else{
			//长辈 
			//递归查询
			System.out.println("@长辈");
			pid=station.getPid();
			Node ppnodeNode=findNode(pid,rootlist);
			if(ppnodeNode==null)
			{
				rootlist.add(node);
				pplist=rootlist;
			}else{
				pplist=ppnodeNode.childrenList;
				pplist.add(node);
			}
		}
		if(++index==slist.size())
			return;
		addNode(index,pid,node,pplist);
	}
	/**
	 * 根据id从根节点查找node
	 * @param pid
	 */
	private Node findNode(int pid,List<TreeUtils.Node> nodechildrenlist)
	{
		for(int i=0;i<nodechildrenlist.size();i++)
		{
			Node node=nodechildrenlist.get(i);
			if(node.id==pid)
			{
				return node;
			}else{
				return findNode(pid,node.getChildrenList());
			}
		}
		return null;
	}
	/**
	 * 根据一个station对象生成一个对应的节点
	 * @param s
	 */
	private Node copyData(Station s)
	{
		Node n=getNode();
		n.text=s.getName();
		n.id=s.getId();
		return n;
	}
	/**
	 * 获取一个节点
	 * @return
	 */
	public Node getNode()
	{
		return new Node();
	}	
	/**
	 * 节点内部类
	 * @author Martin
	 *
	 */
	public class Node{
	   public	int id;
	   public String text;
	   public String state="closed";
	   public Boolean checked=true;
	   public List<Node> childrenList ;
	   
	   public Node()
	   {
		   id=0;
		   text="";
		   childrenList=new ArrayList<TreeUtils.Node>();
	   }
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getText() {
			return text;
		}
		public void setText(String text) {
			this.text = text;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public Boolean getChecked() {
			return checked;
		}
		public void setChecked(Boolean checked) {
			this.checked = checked;
		}
		public List<Node> getChildrenList() {
			return childrenList;
		}
		public void setChildrenList(List<Node> childrenList) {
			this.childrenList = childrenList;
		}
		   
	}
	public static String nodesListToJson(List<Node> list)
	{
		 StringBuilder json = new StringBuilder();
	        json.append("[");
	        if (list != null && list.size() > 0) {
	            for (Node n : list) {
	                json.append(nodeToJson(n));
	                json.append(",");
	            }
	            json.setCharAt(json.length() - 1, ']');
	        } else {
	            json.append("]");
	        }
	        return json.toString();
	}

	public static String nodeToJson(Node node)
	{
		StringBuilder json = new StringBuilder();
		if (node == null) {
            json.append("\"\"");
        } else {
        	 json.append("{");
             json.append("\"id\":");
             json.append(node.getId());
             json.append(",\"text\":\"");
             json.append(node.getText());
             json.append("\",\"state\":\"");
             json.append(node.getState());
             json.append("\",\"checked\":");
             json.append(node.getChecked());
             json.append(",\"children\":");
             json.append(nodesListToJson(node.getChildrenList()));
             json.append("}");
        }
		return json.toString();
	}

}
