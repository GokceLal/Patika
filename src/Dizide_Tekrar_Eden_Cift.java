public class Dizide_Tekrar_Eden_Cift {

    static boolean isFind(int arr[],int value)
    {
        for (int i:arr) {
        if (i==value)
        {
            return true;
        }
        }
        return false;
    }
    public static void main(String[] args) {
        int dizi[]={3,5,7,3,6,4,3,6,10,4};
        int [] dublicate = new int[dizi.length];
        int startIndex = 0;

        for(int i=0;i< dizi.length;i++)
        {

                for (int j=0; j< dizi.length;j++)
                { if(dizi[i]%2==0){
                    if((dizi[i]==dizi[j])&&(i!=j)){
                        if ((!isFind(dublicate,dizi[i])))
                        {
                            dublicate[startIndex]=dizi[i];
                        }
                        break;

                    }
                }
                }

        }
        for (int valeu:dublicate)

        {
            if(valeu!=0)

            {
                System.out.println("Tekrar eden sayı(lar) :"+valeu);
            }
        }
    }
}
