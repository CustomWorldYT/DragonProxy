/*
 * GNU LESSER GENERAL PUBLIC LICENSE
 *                       Version 3, 29 June 2007
 *
 * Copyright (C) 2007 Free Software Foundation, Inc. <http://fsf.org/>
 * Everyone is permitted to copy and distribute verbatim copies
 * of this license document, but changing it is not allowed.
 *
 * You can view LICENCE file for details. 
 *
 * @author The Dragonet Team
 */
package org.dragonet.common.data.entity.meta.type;

import org.dragonet.common.data.entity.meta.EntityMetaData;
import org.dragonet.common.data.entity.meta.IEntityMetaDataObject;
import org.dragonet.common.utilities.BinaryStream;

public class LongMeta implements IEntityMetaDataObject {

    public long data;

    public LongMeta(long data) {
        this.data = data;
    }

    public int type() {
        return EntityMetaData.Constants.DATA_TYPE_LONG;
    }

    public void encode(BinaryStream out) {
        out.putVarLong(data);
    }

    @Override
    public String toString() {
        return "LongMeta{" + data + "}";
    }

}
