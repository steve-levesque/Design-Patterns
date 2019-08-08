package Behavioral.Momento;

abstract class Originator {
	protected String title, text;
	protected int version;
	
	public void setVariable(String title, String text, int version) {
		this.title = title;
		this.text = text;
		this.version = version;
	}
	
	public void content() {
		System.out.println("Title : " +title+ " - Content : " +text+ " - Version : " +version);
	}
	
	abstract Momento createVersion();
}

class DraftReport extends Originator {

	@Override
	public DraftVersion createVersion() {
		return new DraftVersion(this, title, text, version);
	}
	
}

class ProductionReport extends Originator {
	
	@Override
	public ProductionVersion createVersion() {
		return new ProductionVersion(this, title, text, version);
	}
}

abstract class Momento {
	protected String title, text;
	protected int version;
	
	Momento(String title, String text, int version) {
		this.title = title;
		this.text = text;
		this.version = version;
	}
	
	public void content() {
		System.out.println("Title : " +title+ " - Content : " +text+ " - Version : " +version);
	}
	
	abstract void restore();
}

class DraftVersion extends Momento {
	private DraftReport originator;
	
	DraftVersion(DraftReport originator, String title, String text, int version) {
		super(title, text, version);
		this.originator = originator;
	}

	@Override
	void restore() {
		originator.setVariable(title, text, version);
	}
}

class ProductionVersion extends Momento {
	private ProductionReport originator;
	
	ProductionVersion(ProductionReport originator, String title, String text, int version) {
		super(title, text, version);
		this.originator = originator;
	}
	
	@Override
	void restore() {
		originator.setVariable(title, text, version);
	}
}

class Secretary {
	private Momento version;
	
	public void backup(Originator report) {
		version = report.createVersion();
		System.out.println("Report backed up.");
	}
	
	public void undo() {
		if (version != null) {
			version.restore();
			System.out.println("Report restored from version.");
		}
	}
	
	public void versionContent() {
		System.out.println("Content from version managed by secretary.");
		version.content();
	}
}
