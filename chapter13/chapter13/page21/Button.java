package chapter13.page21;

class Button {
	onClickListener ocl;
	void setOnClickListener(onClickListener ocl) {
		this.ocl = ocl;
	}
	interface onClickListener{
		public abstract void onClick();
	}
	void click() {
		ocl.onClick();
	}
}
