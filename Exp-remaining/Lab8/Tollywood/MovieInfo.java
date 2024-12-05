class MovieInfo{
	String mName,hName,dName;
	int releaseDate;
	double grossCollections;
	MovieInfo next;
	MovieInfo(String mn,String hn,String dn,int rd,double gc){
		this.mName=mn;
		this.hName=hn;
		this.dName=dn;
		this.releaseDate=rd;
		this.grossCollections=gc;
		this.next=null;
	}
	public String toString(){
		return mName+" "+hName+" "+dName+" "+releaseDate+" "+grossCollections;
	}
}
