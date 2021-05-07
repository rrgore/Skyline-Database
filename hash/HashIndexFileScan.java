package hash;

import java.io.IOException;

/**
 * Base class for a index file scan
 */
public abstract class HashIndexFileScan {
    /**
     * Get the next record.
     *
     * @return the KeyDataEntry, which contains the key and data
     * @throws ScanIteratorException error when iterating through the records
     */
    abstract public KeyDataEntry get_next()
            throws ScanIteratorException;

    /**
     * Delete the current record.
     *
     * @throws ScanDeleteException delete current record failed
     */
    abstract public void delete_current()
            throws IOException;

    /**
     * Returns the size of the key
     *
     * @return the keysize
     */
    abstract public int keysize();
}
