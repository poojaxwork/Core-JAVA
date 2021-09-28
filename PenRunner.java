class PenRunner
{
public static void main(String[] read)
{
Pen obj=new Pen();
obj.write();//invoked instance method by ref
obj.drawing();//invoked static method by ref
Pen.drawing();//invoked static method by class name
Pen.Scratch();//invoked static method by class name
obj.toy();//acessing instance method by ref
}
}