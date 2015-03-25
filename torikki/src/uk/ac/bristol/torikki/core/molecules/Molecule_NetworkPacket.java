package uk.ac.bristol.torikki.core.molecules;

public class Molecule_NetworkPacket {
   private long ipSrcAddress;
   
   public void setIpSrcAddress(long value) {
      this.ipSrcAddress = value;
   }
   
   public long getIpSrcAddress() {
      return this.ipSrcAddress;
   }
   
   private long ipDestAddress;
   
   public void setIpDestAddress(long value) {
      this.ipDestAddress = value;
   }
   
   public long getIpDestAddress() {
      return this.ipDestAddress;
   }
   
   private String ipProtocol;
   
   public void setIpProtocol(String value) {
      this.ipProtocol = value;
   }
   
   public String getIpProtocol() {
      return this.ipProtocol;
   }
   
   private long ipPacketNumber;
   
   public void setIpPacketNumber(long value) {
      this.ipPacketNumber = value;
   }
   
   public long getIpPacketNumber() {
      return this.ipPacketNumber;
   }
   
   }
