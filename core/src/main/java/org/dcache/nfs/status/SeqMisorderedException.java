/*
 * Copyright (c) 2009 - 2014 Deutsches Elektronen-Synchroton,
 * Member of the Helmholtz Association, (DESY), HAMBURG, GERMANY
 *
 * This library is free software; you can redistribute it and/or modify
 * it under the terms of the GNU Library General Public License as
 * published by the Free Software Foundation; either version 2 of the
 * License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Library General Public License for more details.
 *
 * You should have received a copy of the GNU Library General Public
 * License along with this program (see the file COPYING.LIB for more
 * details); if not, write to the Free Software Foundation, Inc.,
 * 675 Mass Ave, Cambridge, MA 02139, USA.
 */
package org.dcache.nfs.status;

import org.dcache.nfs.ChimeraNFSException;
import static org.dcache.nfs.nfsstat.*;

public class SeqMisorderedException extends ChimeraNFSException {

    private static final long serialVersionUID = -7655427892690245299L;

    public SeqMisorderedException() {
        super(NFSERR_SEQ_MISORDERED);
    }

    public SeqMisorderedException(String msg) {
        super(NFSERR_SEQ_MISORDERED, msg);
    }
}
