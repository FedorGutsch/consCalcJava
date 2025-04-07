public class NumSystemTransformer implements IRadix{

    @Override
    public String transformTo(int num, int radix) throws Exception {
        switch (radix){
            case 2:{

                String binary = Integer.toBinaryString(num);


                int padding = (4 - (binary.length() % 4)) % 4;


                return "0".repeat(padding) + binary;


            }
            case 8:{
                return Integer.toOctalString(num);
            }
            case 10:{
                return Integer.toString(num);
            }
            case 16:{
                return Integer.toHexString(num);
            }
            default:{
                throw new Exception("NumSystemTransformException");
            }
        }
    }
}
