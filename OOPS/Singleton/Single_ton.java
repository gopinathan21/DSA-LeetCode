package Singleton;

public class Single_ton {
    
    private Single_ton()
    {

    }


    static Single_ton s;
    static Single_ton get_instance()
    {
        if(s ==null)
        {
            s = new Single_ton();
        }
        // else{
        //     throw new IllegalStateException("Singleton instance already exists");
        // }
        return s;
    }
}
