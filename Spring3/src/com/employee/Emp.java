package com.employee;

import com.address.Address;

public class Emp {
private int eno;
private String ename;
private int esal;
private Address eadd;

public int getEno()
{
	return eno;
}
public void setEno(int eno)
{
	this.eno=eno;
}

public String getEname()
{
	return ename;
}
public void setEname(String ename)
{
	this.ename=ename;
}

public int getEsal()
{
	return esal;
}
public void setEsal(int eno)
{
	this.esal=esal;
}

public Address getEadd()
{
	return eadd;
}
public void setEdd(Address eadd)
{
	this.eadd=eadd;
}
@Override
public String toString() {
	return "Emp [eno=" + eno + ", ename=" + ename + ", esal=" + esal + ", eadd=" + eadd + "]";
}
}
