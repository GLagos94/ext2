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
public class fileSystem {
    public inode inode;
    public String filesystem_path;
    public int filesystem_buffer, datablock_size = 4096, 
            datablock_max_elements = 65536, datablock_bitmap_size, 
            datablock_bitmap_offset = 0, datablock_region_size, inode_size,
            inode_max_elements = 1024, inode_bitmap_size, inode_bitmap_offset, 
            inode_table_size, inode_table_offset;

    public fileSystem() {
        this.datablock_bitmap_size = this.datablock_max_elements / 8;
        this.datablock_region_size = this.inode_max_elements * this.inode_size;
        this.inode_size = inode.size; //Not sure of this one
        this.inode_bitmap_size = this.inode_max_elements / 8;
        this.inode_bitmap_offset = this.datablock_bitmap_size -1;
        this.inode_table_size = this.inode_max_elements * this.inode_size;
        this.inode_table_offset = this.inode_bitmap_offset + this.inode_bitmap_size;
    }
    
    
}
