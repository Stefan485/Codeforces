package difficulty1200;

import java.util.Scanner;

public class BerSUBall {
    public static void main(String[] args) throws Exception {

        class List{

            class Element{
                int skill;
                Element next;
        
                public Element(int skill, Element next){
                    this.skill = skill;
                    this.next = next;
                }
                
                public Element(int skill){
                    this(skill, null);
                }
            }
        
            private Element first;
            public List(){
                this.first = null;
            }
        
            public void add(int skill){
                if(this.first == null || this.first.skill > skill){
                    Element added = new Element(skill);
                    added.next = first;
                    first = added;
                }
                else{
                    Element curr = this.first;
                    while(curr.next != null && curr.next.skill < skill){
                        curr = curr.next;
                    }
                    Element added = new Element(skill);
                    added.next = curr.next;
                    curr.next = added;
                }
            }
        
            public void delete(int skill){
                if(first.skill == skill){
                    first = first.next;
                }
                else{
                    Element curr = first;
                    Element last = null;
                    while(curr != null && curr.skill != skill){
                        last = curr;
                        curr = curr.next;
                    }
                    if(curr.skill == skill){
                        last.next = curr.next;
                    }
                }
            }
        
            public String toString(){
                String res = "List [";
                Element curr = first;
                while(curr != null){
                    res += curr.skill;
                    if(curr.next != null){
                        res += ", ";
                    }
                    else{
                        res += "]";
                    }
                    curr = curr.next;
                }
                return res;
            }
        }

        Scanner input = new Scanner(System.in);
        List boys = new List();
        int numberOfBoys = input.nextInt();
        for(int i = 0; i < numberOfBoys; i++){
            boys.add(input.nextInt());
        }
        List girls = new List();
        int numberOfGirls = input.nextInt();
        for(int i = 0; i < numberOfGirls; i++){
            girls.add(input.nextInt());
        }

        int pairs = 0;
        if(numberOfBoys < numberOfGirls){
            while(boys.first != null){
                List.Element curr = girls.first;
                while(curr != null && !(boys.first.skill == curr.skill || boys.first.skill + 1 == curr.skill || boys.first.skill - 1 == curr.skill)){
                    curr = curr.next;
                }
                if(curr != null){
                    pairs++;
                    boys.delete(boys.first.skill);
                    girls.delete(curr.skill);
                }
                else{
                    boys.delete(boys.first.skill);
                }
            }
        }
        else{
            while(girls.first != null){
                List.Element curr = boys.first;
                while(curr != null && !(girls.first.skill == curr.skill || girls.first.skill + 1 == curr.skill || girls.first.skill - 1 == curr.skill)){
                    curr = curr.next;
                }
                if(curr != null){
                    pairs++;
                    girls.delete(girls.first.skill);
                    boys.delete(curr.skill);
                }
                else{
                    girls.delete(girls.first.skill);
                }
            }
        }

        System.out.println(pairs);
        input.close();
    }
}


