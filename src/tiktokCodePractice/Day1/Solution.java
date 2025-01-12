package tiktokCodePractice.Day1;

import java.lang.classfile.components.ClassPrinter;

public class Solution {

    public ListNode reverseLsit(ListNode head){

        // ** THIS CODE WORKS (https://leetcode.com/problems/reverse-linked-list/?envType=study-plan-v2&envId=top-100-liked)**


        // reversal linkedList
        // reversing list using Nodes, Head, Null
        // using traversal(loop)



        // Question
        //     1->2->3->4->5->Null
        //     5->4->3->2->1->Null

        
        /**
            * Definition for singly-linked list.
            * public class ListNode {
            *     int val;
            *     ListNode next;

            *     ListNode() {}
            *     ListNode(int val) { this.val = val; }
            *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
        * }
        */

        //     1->2->3->4->5->Null
        // you pass in 1 as the head
        // head.next = 2 (1.next= 2)
        
        ListNode prev = null;

        while (head != null) { 
            //            =  2
            ListNode next = head.next;
            // this makes 1.next = null
            // 1.next = 2 = Null
            // 1-> Null 2->3->4->5->
            head.next = prev;
            // prev = head
            // null = 1
            prev = head;

            head = next;
        }

        System.out.println(prev);
        return prev;

    }

    
}
