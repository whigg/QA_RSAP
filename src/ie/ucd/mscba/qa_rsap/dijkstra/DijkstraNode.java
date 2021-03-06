/**
 * Created on 22 Jul 2012
 *
 * @author Michael Flynn
 * @version 1.0
 *
 * File: DijkstraNode.java
 * Package ie.ucd.mscba.qa_rsap.dijkstra
 * Project QA_RSAP
 */
package ie.ucd.mscba.qa_rsap.dijkstra;

import ie.ucd.mscba.qa_rsap.valueobjects.AdjNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class DijkstraNode implements Comparable<DijkstraNode> 
{

    String nodeName;
    double distanceToRoot;
    List<String> pathFromRoot;
    List<AdjNode> adjList;
    
    public int compareTo(DijkstraNode o) 
    {
        int returnVal = 0; 
        if (this.getDistanceToRoot( ) < o.getDistanceToRoot( )) 
        {
            returnVal = -1;
        } 
        else if (this.getDistanceToRoot() > o.getDistanceToRoot()) 
        {
            returnVal = 1;
        } 
        return returnVal;
      }
    
    /**
     * @return the adjList
     */
    public List<AdjNode> getAdjList()
    {
        if(adjList == null)
            adjList = new ArrayList<AdjNode>( );
        return adjList;
    }
    /**
     * @param adjList the adjList to set
     */
    public void setAdjList(List<AdjNode> adjList)
    {
        this.adjList = adjList;
    }

    /**
     * @return the nodeName
     */
    public String getNodeName()
    {
        return nodeName;
    }
    /**
     * @param nodeName the nodeName to set
     */
    public void setNodeName(String nodeName)
    {
        this.nodeName = nodeName;
    }
    /**
     * @return the distanceToRoot
     */
    public double getDistanceToRoot()
    {
        return distanceToRoot;
    }
    /**
     * @param distanceToRoot the distanceToRoot to set
     */
    public void setDistanceToRoot(double distanceToRoot)
    {
        this.distanceToRoot = distanceToRoot;
    }
    /**
     * @return the pathToRoot
     */
    public List<String> getPathFromRoot()
    {
        if(pathFromRoot == null)
            pathFromRoot = new ArrayList<String>( );
        
        return pathFromRoot;
    }
    /**
     * @param pathToRoot the pathToRoot to set
     */
    public void setPathFromRoot(List<String> pathToRoot)
    {
        this.pathFromRoot = pathToRoot;
    }
    
}
