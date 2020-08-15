package practice.core.java;

import java.util.Random;
import java.util.UUID;

public class Test {

    public static void main(String[] args) {
        int arr[][] = {
                {1 ,1 ,1 ,0 ,0 ,0},
                {0 ,1 ,0 ,0 ,0 ,0},
                {1 ,1 ,1 ,0 ,0 ,0},
                {0 ,0 ,2 ,4 ,4 ,0},
                {0 ,0 ,0 ,2 ,0 ,0},
                {0 ,0 ,1 ,2 ,4 ,0}

        };
        //System.out.println(hourglassSum(arr));
        //String s = "mgf_123213~1231";
        //System.out.println(s.split("_")[1]);
        System.out.println("test-bld-test".contains("-bld-"));
        String response ="{\"CustomerId\":\"%s\",\"status\":\"CUSTOMER_STATUS_ACTIVE\",\"identifiers\":[],\"customer_details\":{\"title\":\"CUSTOMER_TITLE_UNKNOWN\",\"first_name\":\"\",\"middle_name\":\"\",\"last_name\":\"\",\"dob\":\"\",\"gender\":\"CUSTOMER_GENDER_UNKNOWN\",\"nationality\":\"\",\"email_address\":\"\",\"mobile_phone_number\":\"\",\"home_phone_number\":\"\",\"business_phone_number\":\"\",\"contact_method\":\"CUSTOMER_CONTACT_METHOD_UNKNOWN\",\"country_of_residence\":\"\",\"country_of_taxation\":\"\",\"accessibility\":\"CUSTOMER_ACCESSIBILITY_UNKNOWN\",\"external_customer_id\":\"af4b59ef-1012-4dc1-b7d5-0d350e2e5bac\"},\"additional_details\":{}}\n";
        System.out.println(String.format(response,UUID.randomUUID().toString()));

    }


    static int hourglassSum(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        int sum = -999999;
        for(int i =0 ; i < rows-2 ; i++){
            for(int j = 0 ; j < cols-2 ; j++){

                int hourGlassTotal = arr[i][j] + arr[i][j+1] + arr[i][j+2]
                        +arr[i+1][j+1]+
                        arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2] ;
                if(hourGlassTotal > sum)
                    sum = hourGlassTotal;
            }

        }
        return sum;


    }
}
