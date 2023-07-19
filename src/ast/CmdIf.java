package ast;

import java.util.List;

import expressions.AbstractExpression;

public class CmdIf extends AbstractCommand{

	private AbstractExpression expr;
	private List<AbstractCommand> listaTrue;
	private List<AbstractCommand> listaFalse;
	
	public CmdIf() {
		super();
	}

	public CmdIf(AbstractExpression expr) {
		super();
		this.expr = expr;
	}

	public AbstractExpression getExpr() {
		return expr;
	}

	public void setExpr(AbstractExpression expr) {
		this.expr = expr;
	}

	public List<AbstractCommand> getListaTrue() {
		return listaTrue;
	}

	public void setListaTrue(List<AbstractCommand> listaTrue) {
		this.listaTrue = listaTrue;
	}

	@Override
	public String generateCode() {
		// TODO Auto-generated method stub
		StringBuilder str = new StringBuilder();
		StringBuilder str2 = new StringBuilder();
		for (AbstractCommand cmd: listaTrue) {
			str.append(cmd.generateCode());
		}
		if (!listaFalse.isEmpty()) {
			str2.append("else {\n");
			for (AbstractCommand cmd: listaFalse) {
				str2.append(cmd.generateCode());
			}
			str2.append("}\n");
		}
		return "if (" + expr.toString()+ ") {\n "+ str.toString() + "}\n"+str2.toString();
	}
	
	

	public List<AbstractCommand> getListaFalse() {
		return listaFalse;
	}

	public void setListaFalse(List<AbstractCommand> listaFalse) {
		this.listaFalse = listaFalse;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
