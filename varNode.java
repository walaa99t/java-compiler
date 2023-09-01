package ass;

public class varNode extends AbstractTreeNode 
{
	String operator;
	public String getOperator() {
	return operator;
	}
	public void setOperator(String operator) {
	this.operator = operator;
	}
	@Override
	public Object execute(Context context) {
	double d1 = (Double)children.get(0).execute(context);
	double d2 = (Double)children.get(1).execute(context);
	switch(operator) {
	case ">":
	return d1 > d2;
	case "<":
	return d1 < d2;
	case "==":
	return d1 == d2;
	}
	return null;
	}}
