package Bai3;

public class TamGiac {
	private double ma = 0;
	private double mb = 0;
	private double mc = 0;
	
	public TamGiac() {
		
	}
	
	public boolean laTamGiac() {
		if(((this.ma + this.mb > this.mc) && (this.mb + this.mc > this.ma) && (this.mc + this.ma > this.mb))) {
			return true;
		}else {
			return false;
		}
	}
	public TamGiac(double ma, double mb, double mc) {
		this.setMa(ma);
		this.setMb(mb);
		this.setMc(mc);
		 
		if(!laTamGiac()) {
			this.ma = this.mb = this.mc = 0;
		}
	}
	public void setMa(double ma) {
		if(ma > 0) {
			this.ma = ma;
		}
	}
	
	public void setMb(double mb) {
		if(mb > 0) {
			this.mb = mb;
		}
	}
	
	public void setMc(double mc) {
		if(mc > 0) {
			this.mc = mc;
		}
	}
	
	public double getMa() {
		return ma;
	}
	
	public double getMb() {
		return mb;
	}
	
	public double getMc() {
		return mc;
	}
	
	public double getChuVi() {
		// TODO Auto-generated method stub
		return ma+mb+mc;
	}
	
	public double getDienTich() {
		double P = this.getChuVi()/2;
		
		return Math.sqrt(P*(P-ma)*(P-mb)*(P-mc));
	}
	
	public String getType() {
		// TODO Auto-generated method stub
		if(this.laTamGiac()) {
			if(ma == mb && mb == mc) {
				return "Tam giac deu";
			}else if (2*mb*mb == ma*ma || 2*mc*mc == mb*mb || 2*ma*ma == mc*mc) {
				return "Tam giac vuong can";
			}else if((mb*mb + mc*mc == ma*ma) || (ma*ma + mc*mc == mb*mb) || (ma*ma + mb*mb == mc*mc)) {
				return "Tam giac vuong";
			}else if((ma == mb) || (mb == mc) || (mc == ma)) {
				return "Tam giac can";
			}else {
				return "Tam giac thuong";
			}
		}else {
			return "Khong phai tam giac";
		}
	}
}
