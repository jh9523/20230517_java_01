package kh.lclass.oop.sample;

import java.awt.AWTEvent;
import java.awt.Rectangle;
import java.awt.im.spi.InputMethodContext;
import java.io.Serializable;
import java.lang.Character.Subset;
import java.util.Locale;


public class Kh implements TestInterface, Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 4332607456787281223L;

//	static final long serialVersionUID = 1L;
	
	
	public void khSpecial() {
		String str = "111122222";
		try {
			Car[] carArr = new Car[3];
//			carArr[0] = new Car();
			carArr[0].setPrice(5000);	// NullPointerException
			carArr[4].setPrice(3000);
			
			int a = Integer.parseInt(str);	// NumberFormatException
			int c = 10 / 0;		// 허수 ArithmeticException 	
			c = 0 / 10;				
		} catch(NumberFormatException e) {
			System.out.println(Integer.MAX_VALUE+"까지의 정수만 입력해주세요");
			e.printStackTrace();	// 오류 나면 문구 보여줌
		} catch(ArithmeticException e) {
			System.out.println("0으로 나눈 수는 나타낼 수 없습니다.");
			e.printStackTrace();
		} catch(NullPointerException e ) {
			System.out.println("예기치 못한 오류 발생하였습니다. 잠시 후 다시 시도해주세요.");
			e.printStackTrace();
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("데이터 범위를 벗어났습니다.");
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println("== 여기가 마지막 ==");
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String method2() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int method3(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setInputMethodContext(InputMethodContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean setLocale(Locale locale) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Locale getLocale() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setCharacterSubsets(Subset[] subsets) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setCompositionEnabled(boolean enable) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isCompositionEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void reconvert() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispatchEvent(AWTEvent event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void notifyClientWindowChange(Rectangle bounds) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void activate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deactivate(boolean isTemporary) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hideWindows() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeNotify() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void endComposition() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object getControlObject() {
		// TODO Auto-generated method stub
		return null;
	}
}
