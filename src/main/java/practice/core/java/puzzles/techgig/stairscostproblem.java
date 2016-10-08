package practice.core.java.puzzles.techgig;

/**
 * Created by gojha on 4/2/2015.
 */
public class stairscostproblem {
    int cost,temp,currentStep,stepsRemaining,jFactor,tempStepsLeft;
    int[] input={1,3,5,1,1,2,6,7,6,8,9};
    public static void main(String args[])
    {
        stairscostproblem stairscostproblem = new stairscostproblem();
        System.out.println("stairs cost is" + stairscostproblem.findMinPosCost(stairscostproblem.input));
    }

    public int findMinPosCost(int[] input1)
    {
        currentStep=0;
        cost=1;
        int step=0;
        jFactor=input1[currentStep];
        stepsRemaining=input1.length;
        int actualStepsRemaining=input1.length;
        tempStepsLeft=1000;
        int tempStep;
        boolean flag=false;
        boolean stepSet=false;

        while(stepsRemaining>0)
        {
            if(input[step]==0)
            {
                return -1;
            }
            else if(input1[step]==1)
            {
                cost++;
                stepsRemaining--;
                actualStepsRemaining=stepsRemaining;
                step++;
                if(step<=input1.length)
                {
                    currentStep=step;
                }

                continue;
            }
            else if(input1[step]>1)
            {

                cost++;
                jFactor=input1[currentStep];
                for(int i=1;i<=jFactor;i++)
                {
                    step++;
                    stepsRemaining--;
                    actualStepsRemaining=stepsRemaining;
                    if(step<=input1.length && stepsRemaining<actualStepsRemaining-input1[step])
                    {
                        stepsRemaining=actualStepsRemaining-(input1[step]);
                        //stepsRemaining=tempStepsLeft;
                        cost++;
                //        step++;
                        stepSet=true;
                        currentStep=step;
                    }
                    else
                    {
                  //      step++;
                    }
                    actualStepsRemaining--;

                    if(stepsRemaining<0)
                    {
                        flag = true;
                        break;
                    }
                }
                actualStepsRemaining=stepsRemaining;
                step=currentStep;
            }

            if(flag)
            {
                cost++;
                break;
            }
            stepsRemaining=stepsRemaining-temp;
            cost++;
            temp=-100;
            if(!stepSet)
            {
                currentStep++;
                cost++;
            }

//            System.out.println("currentStep"+currentStep + " jFactor"+jFactor +" stepsRemaining"+stepsRemaining);

        }
        return cost;
    }
}


