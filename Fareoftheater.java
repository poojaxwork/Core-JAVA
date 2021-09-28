enum Fareoftheater
{
BALCONY(150,18.3f),MIDDLE(100,10.3f),FIRSTCLASS(80,8.3f),BOX(250,28.3f);
 int fare;
 float GST;
 Fareoftheater(int fare,float GST)
 {
 this.fare=fare;
 this.GST=GST;
 }
}