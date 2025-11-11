
package exam01;

public class Button {
	onClickListener listener;
	public void SetOnClickListener(onClickListener listener) {
		this.listener = listener;
		
	}	
	
	public void Touch() {
		if(listener != null) {
			listener.onClick();
		}
	}
}
