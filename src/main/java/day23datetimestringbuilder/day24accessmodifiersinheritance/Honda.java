package day23datetimestringbuilder.day24accessmodifiersinheritance;

import lombok.ToString;

@ToString
public class Honda extends Car{
    public  String renk;
    public Honda(){

        super("White",50000);
    }
    public Honda(String renk){

        this.renk=renk;
    }

    public Honda(String renk, String type){
        this.renk = renk;
        super.type=type;
    };
}