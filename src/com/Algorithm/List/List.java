package com.Algorithm.List;

public class List {
    //头结点
    private Note head;

    //结点
    static class Note {
        private int val;
        private Note next;

        public Note (int val, Note next) {
            this.val = val;
            this.next = next;
        }
    }

    //头插法
    public void addHead(int val) {
        Note newNote = new Note(val, head);
        head = newNote;
    }

    //尾插法
    public void addLast(int val) {
        if(head == null) {
            addHead(val);
            return;
        }
        Note last = getLast();
        last.next = new Note(val, last.next);
    }

    //删除结点
    public void delete(int index) {

    }




    public Note getIndexNote(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("索引越界");
        }

        Note temp = head;
        for (int i = 0; i < index - 1; i++) {
            if (temp == null) {
                return null;  // 如果索引超出链表长度，返回null
            }
            temp = temp.next;
        }

        if (temp == null) {
            throw new IndexOutOfBoundsException("索引超出范围");
        }

        System.out.println("该结点的值 " + temp.val);
        return temp;
    }

    //获取尾结点
    public Note getLast() {
        if(head == null) {
            return null;
        } else {
            Note temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            return temp;
        }
    }

    //遍历链表
    public void loop(){
        //1.while循环
//        Note temp = head;
//        while (temp != null) {
//            System.out.println(temp.val);
//            temp = temp.next;
//        }

        //2.for循环
        for(Note temp = head; temp != null; temp = temp.next ){
            System.out.println(temp.val);
        }
    }



}
