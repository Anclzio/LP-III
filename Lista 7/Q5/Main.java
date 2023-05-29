public class Main {

    public static void main(String[] args) {
        double g, kg, oz, lb;


        g = 200;
        System.out.println(ConversaoUnidadePeso.gToKg(g));
        System.out.println(ConversaoUnidadePeso.gToLb(g));
        System.out.println(ConversaoUnidadePeso.gToOz(g));
        System.out.println();
///////////////////////////////////////////////////////////////////////////////////////////////////////////
        kg = 200;
        System.out.println(ConversaoUnidadePeso.kgToG(kg));
        System.out.println(ConversaoUnidadePeso.kgToLb(kg));
        System.out.println(ConversaoUnidadePeso.kgToOz(kg));
        System.out.println();

///////////////////////////////////////////////////////////////////////////////////////////////////////////
        oz = 200;
        System.out.println(ConversaoUnidadePeso.ozToG(oz));
        System.out.println(ConversaoUnidadePeso.ozToKg(oz));
        System.out.println(ConversaoUnidadePeso.ozToLb(oz));
        System.out.println();

///////////////////////////////////////////////////////////////////////////////////////////////////////////
        lb = 200;
        System.out.println(ConversaoUnidadePeso.lbToG(lb));
        System.out.println(ConversaoUnidadePeso.lbToKg(lb));
        System.out.println(ConversaoUnidadePeso.lbToOz(lb));
        System.out.println();
    }
    
}
