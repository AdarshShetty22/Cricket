package com.game.cricket;

import java.util.Random;

public class Dime {
	static Random random=new Random();
	public static void main(String[] args){
	
		String[] players={"KL Rahul","RohitSharma","Virat Kohli","Aginkya Rahane","Suresh Raina","MS Dhoni","Ravindra Jadeja","R Ashwin","B kumar","A Nehra","M Shami"};
     	String[] StrikeAndNonStrike=new String[2];
     	String[] temp=new String[1];
     	int[] scoresofBatsman=new int[11];
     	int strike=0;
     	int nonstrike=1;
     	int currentbatsman=0;
     	int nonStrikerBatsman=1;
     	int bastmancount=1;
     	int overscount=0;
     	int run;
     	int score=0;
     	int balls=6;
     	int scoreofStrikeBatsman=0;
     	StrikeAndNonStrike[strike]=players[currentbatsman];
     	StrikeAndNonStrike[nonstrike]=players[nonStrikerBatsman];
     	scoresofBatsman[currentbatsman]=0;
     	scoresofBatsman[nonStrikerBatsman]=0;
       for(int i=0;i<balls;i++){
    	   overscount++;
    	   run=random.nextInt(8)+1;
    	   //if 5 then consider it a wide and bowl one extra ball
    	   if(run==5){
    		   System.out.print("BALL "+(i+1)+"------------>");
    		   System.out.print("WIDE!!!");
    		   System.out.print("            WIDE BALL");
    		   System.out.println();
    		   balls+=1;
    		   score+=1;
    	   }
    	   if(run==1||run==3){
    		   System.out.print("BALL "+(i+1)+"------------>");
    		   score+=run;
    		   scoreofStrikeBatsman+=run;
    		   System.out.print("runs "+run);
    		   System.out.print("                BATTING "+StrikeAndNonStrike[strike]);
    		   if(StrikeAndNonStrike[strike].equalsIgnoreCase(players[currentbatsman])){
    			   scoresofBatsman[currentbatsman]+=scoreofStrikeBatsman;
    			   System.out.print("----------->  takes "+run);
    			   System.out.println();
    			  
    		   }
    		   if(StrikeAndNonStrike[strike].equalsIgnoreCase(players[nonStrikerBatsman])){
    			   scoresofBatsman[nonStrikerBatsman]+=scoreofStrikeBatsman;
    			   System.out.print("----------->  takes "+run);
    			   System.out.println();
    			  
    		   }
    		   scoreofStrikeBatsman=0;
    		   
    		   temp[0]=StrikeAndNonStrike[strike];
    		   StrikeAndNonStrike[strike]=StrikeAndNonStrike[nonstrike];
    		   StrikeAndNonStrike[nonstrike]=temp[0];
    		   
    		   
    		 
    	   }
    	   if(run==7||run==8){
    		   System.out.print("BALL "+(i+1)+"------------>");
    		   System.out.print("OUT!!!!");
    		   System.out.print("            "+StrikeAndNonStrike[strike]+"(OUT)");
    		   bastmancount++;
    		   if(bastmancount>10){
    			   System.out.println("all out!!!!!");
    			   break;
    			   		
    		   }
    		   StrikeAndNonStrike[strike]=players[bastmancount];
    		   currentbatsman=bastmancount;
    		   System.out.print("       NEXT BATSMAN-->"+StrikeAndNonStrike[strike]);
    		   System.out.println();
    	   }
    	   if(run==4||run==6||run==2){
    		   System.out.print("BALL "+(i+1)+"------------>");
    		   score+=run;
    		   scoreofStrikeBatsman+=run;
    		   System.out.print("runs "+run);
    		   System.out.print("                 BATTING "+StrikeAndNonStrike[strike]);
    		   if(StrikeAndNonStrike[strike].equalsIgnoreCase(players[currentbatsman])){
    			   scoresofBatsman[currentbatsman]+=scoreofStrikeBatsman;
    			   System.out.print("----------->Hits a "+run);
    			   System.out.println();
    			  
    		   }
    		   if(StrikeAndNonStrike[strike].equalsIgnoreCase(players[nonStrikerBatsman])){
    			   scoresofBatsman[nonStrikerBatsman]+=scoreofStrikeBatsman;
    			   System.out.print("----------->Hits a "+run);
    			   System.out.println();
    			  
    		   }
    		   
    		   scoreofStrikeBatsman=0;
    		  
    	   }
    	   
    	   
    		   
    	   
       }
       System.out.println();
       System.out.println("----->SCORE CARD<----- ");
       System.out.print("BATSMAN"+"          "+"SCORE");
       System.out.println(" ");
       System.out.println(" ");
       for(int j=0;j<players.length;j++){
       System.out.print(players[j]+"---------->"+scoresofBatsman[j]);
       System.out.println();
       }
       System.out.println();
       System.out.println();
       System.out.println("TOTAL SCORE IS  "+score);
       
	}
	

}
