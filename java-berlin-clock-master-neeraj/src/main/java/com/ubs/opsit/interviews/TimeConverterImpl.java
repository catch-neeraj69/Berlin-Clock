package com.ubs.opsit.interviews;

public class TimeConverterImpl implements TimeConverter {

	@Override
	public String convertTime(String aTime) {
		String [] times= aTime.split(":");
		int hours=Integer.valueOf(times[0]);
		String topFirstRow="";
		String topSecondRow="";
		int yesCount=hours/5;
		for(int i=0;i<4;i++){
			if(yesCount>0){
				yesCount--;
			topFirstRow+="R";
			}
			else{
			topFirstRow+="O";
			}
		}
		yesCount=hours%5;
		for(int i=0;i<4;i++){
			if(yesCount>0){
				yesCount--;
				topSecondRow+="Y";
			}
			else{
				topSecondRow+="O";
			}
		}
		
		String middleFirstRow="";
		String middleSecondRow="";
		
		int minutes=Integer.valueOf(times[1]);
		
		yesCount=minutes/5;
		
		for(int i=0;i<11;i++){
			if(yesCount>0){
				if(i==2||i==5||i==8){
					middleFirstRow+="R";
				}
				else{
					middleFirstRow+="Y";
				}
				yesCount--;
			}
			else{
				middleFirstRow+="O";
			}
		}
		
		yesCount=minutes%5;
		
		for(int i=0;i<4;i++){
			if(yesCount>0){				
				middleSecondRow+="Y";
				yesCount--;
			}
			else{
				middleSecondRow+="O";
			}
		}
		
		int seconds=Integer.valueOf(times[2]);
		String secondRow="";
		if(seconds%2==0){
			secondRow="Y";
		}
		else{
			secondRow="O";
		}
		
		return secondRow+"\n"+topFirstRow+"\n"+topSecondRow+
				"\n"+middleFirstRow+"\n"+middleSecondRow;
	}

}
