public class ConversaoUnidadePeso {
    
    public static double kgToG(double kgs)
    {
        return kgs * 1000;
    }

    public static double kgToLb(double kgs){
        return kgs * 2.2046226218488;
    }

    public static double kgToOz(double kgs){
        return kgs * 35.27396194958;
    }
//////////////////////////////////////////////////////////////////////////////////

    public static double gToKg(double g){
        return g / 1000;
    }

    public static double gToLb(double g){
        return g * 0.0022046226218488;
    }

    public static double gToOz(double g){
        return g * 0.03527396194958;
    }
//////////////////////////////////////////////////////////////////////////////////

    public static double lbToG(double lb){
        return lb * 453.59237;
    }

    public static double lbToKg(double lb){
        return lb * 0.45359237;
    }

    public static double lbToOz(double lb){
        return lb * 16;
    }

//////////////////////////////////////////////////////////////////////////////////

    public static double ozToG(double oz){
        return oz * 28.349523125;
    }

    public static double ozToKg(double oz){
        return oz *  0.028349523125;
    }

    public static double ozToLb(double oz){
        return oz / 16;
    }
}