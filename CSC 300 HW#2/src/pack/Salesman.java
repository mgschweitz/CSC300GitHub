package pack;

public class Salesman {
    public String name;
    public float salesTotal;

    public Salesman(String name, float salesTotal) {
        this.name = name;
        this.salesTotal = salesTotal;
    }

    public static Salesman[] topFive(Salesman[] list) {
        Salesman top5[] = new Salesman[5];
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            Salesman currentSales = list[i];
            if (count < 5) {
                top5[count] = list[i];
                count++;
            } else {
                int smallest = 0;
                for (int j = 1; j < 5; j++ ) {
                    if (top5[j].salesTotal < top5[smallest].salesTotal) {
                        smallest = j;
                    }
                }
                if (top5[smallest].salesTotal < currentSales.salesTotal) {
                    top5[smallest] =  currentSales;
                }
            }
        }

//
        Salesman orderedTop5[] = new Salesman[5];
        
        
        
        for(int i = 0; i < top5.length; i++) 
        {
        	int highest = 0;
        	for (int j = 1; j < 5; j++ ) 
        	{
        		if (top5[j].salesTotal > top5[highest].salesTotal) 
        		{
        			highest = j;
        		}
        		
        	}
        	orderedTop5[i] = top5[highest];
        	top5[highest].salesTotal = -1;
        }
    
        return orderedTop5;
//        return top5;
    
    
    }
}