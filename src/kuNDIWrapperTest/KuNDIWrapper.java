package kuNDIWrapperTest;

public class KuNDIWrapper {
	static {
		System.loadLibrary("Math_Module");
		System.loadLibrary("SerialPort_Module");
		System.loadLibrary("XML_Module");
		System.loadLibrary("kuNDIWrapperCpp");
	}
	
	public KuNDIWrapper() {
		// TODO Auto-generated constructor stub
		
	}
	
	public native void 	  kuWrapperHelloWorld();
	public native int  	  kuWrapperAddTest(int a, int b);
	public native boolean kuStartNDI();
	public native int 	  kuReturnCnt();
	public native boolean kuReturnProtocolFlag();
	public native boolean kuReturnPolarisFlag();
	public native boolean kuReturnToolsFlag();
	public native boolean kuReturnXmlLoadFlag();
	public native boolean kuReturnProtocolCheckFlag();
	public native boolean kuReturnInitFlag();
	public native boolean kuReturnStartFlag();
	public native boolean kuReturnDataFailFlag();
	public native boolean kuReturnLoadFailFlag();
}
