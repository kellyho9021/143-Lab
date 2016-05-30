/** FCFSSchedulingAlgorithm.java
 * 
 * A first-come first-served scheduling algorithm.
 *
 * @author: Charles Zhu
 * Spring 2016
 *
 */
package com.jimweller.cpuscheduler;

import java.util.*;

public class FCFSSchedulingAlgorithm extends BaseSchedulingAlgorithm {

	private PriorityQueue<Process> pQueue;
    FCFSSchedulingAlgorithm(){
        // Fill in this method
        /*------------------------------------------------------------*/
		pQueue = new PriorityQueue<Process>();


        /*------------------------------------------------------------*/
    }

    /** Add the new job to the correct queue.*/
    public void addJob(Process p){
        // Fill in this method
        /*------------------------------------------------------------*/
		pQueue.add(p);


        /*------------------------------------------------------------*/
    }
    
    /** Returns true if the job was present and was removed. */
    public boolean removeJob(Process p){
        // Fill in this method
        /*------------------------------------------------------------*/
		return pQueue.remove(p);


        /*------------------------------------------------------------*/
    }

    /** Transfer all the jobs in the queue of a SchedulingAlgorithm to another, such as
    when switching to another algorithm in the GUI */
    public void transferJobsTo(SchedulingAlgorithm otherAlg) {
        Iterator<Process> i = pQueue.iterator();
		while(i.hasNext())
		{
			otherAlg.addJob(i.next());
			i.remove();
		}
    }

    /** Returns the next process that should be run by the CPU, null if none available.*/
    public Process getNextJob(long currentTime){
        // Fill in this method
        /*------------------------------------------------------------*/
		return pQueue.peek();


        /*------------------------------------------------------------*/
    }

    public String getName(){
        return "First-Come First-Served";
    }
    
}