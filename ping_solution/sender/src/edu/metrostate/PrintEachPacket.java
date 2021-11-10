package edu.metrostate;

public class PrintEachPacket {
    public static final String SENDING = "SENDing";
    public static final String SENT = "SENT";
    public static final String DROP = "DROP";
    public static final String ERRR = "ERRR";
    public static final String ReSend = "ReSend";
    public static final String MoveWnd = "MoveWnd";
    public static final String ErrAck = "ErrAck";
    public static final String DuplAck = "DuplAck";

    public static void datagramSendPrint(String packetStatus, int seqNum, int startByteOffset, int endByteOffset,
            String status) {
        long time = System.currentTimeMillis();
        String str = String.format("%s %3d %5d:%-5d %13d %s", packetStatus, seqNum, startByteOffset, endByteOffset,
                time, status);
        System.out.println(str);
    }

    public static void ackReceivedPrint(int seqNum, String status) {

        String str = String.format("AckRcvd %3d %s", seqNum, status);
        System.out.println(str);
    }

    public static void timeOutPrint(int seqNum) {

        String str = String.format("TimeOut %3d", seqNum);
        System.out.println(str);
    }
}