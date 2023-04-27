object class003
{
    def script001(): Unit = {
        println("Hello Scala2");
    }

    def sayHello(toWhom: String): Unit = {
        println(s"hello $toWhom")
    }

    def main(args:Array[String]): Unit = {  
        println ("Hello Scala");
        sayHello("Martin");
        script001()
    }  
}