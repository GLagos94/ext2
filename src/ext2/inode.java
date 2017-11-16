/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ext2;

/**
 *
 * @author Gisselle Lagos
 */
public class inode {
    public int mode, size;
    public long cdate, adate, mdate, ddate;
    public short[] blocks = new short[15];
    
    
}
