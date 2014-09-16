package sms

class Phone
{
	double weight;

	public boolean sendSMS(String phNum, String msg)
	{
		boolean msgSentStatus = false;
		
		if(send(phNum, msg))
		{
			msgSentStatus = trus;
		}
		return msgSentStatus;
	}
	
	void setWeight(double val)
	{
		if(val < -1)
		{
			return;
		}
		
		weight = val;
	}
	
	double getWeight()
	{
		return weight;
	}
	
}
	
