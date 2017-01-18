package chemicalexpansion.common.block.counter;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;

/********************************
 Copyright (C) Xangrim, 2016
 All rights reserved

 Class: 
 Created: 18/01/2017, 20:31:36
 Project: ChemicalExpansion
 Description: 
 ********************************/

public class TileEntityCounter extends TileEntity {

    private int count;

    @Override
    public NBTTagCompound writeToNBT(NBTTagCompound compound) {
        compound.setInteger("count", count);
        return super.writeToNBT(compound);
    }

    @Override
    public void readFromNBT(NBTTagCompound compound) {
        count = compound.getInteger("count");
        super.readFromNBT(compound);
    }

    public int getCount() {
        return count;
    }

    public void incrementCount() {
        count++;
        markDirty();
    }

    public void decrementCount() {
        count--;
        markDirty();
    }

}