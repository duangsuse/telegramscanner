package org.duangsuse.telegramscanner.sourcemanager;

import org.jetbrains.annotations.Contract;

import java.util.HashMap;

/**
 * Source line manager
 *
 * @see SimpleMapDelegate api class
 */
public class SourceManager extends SimpleMapDelegate<Identifiable, SourceLocation> {
    @SuppressWarnings("WeakerAccess") /* should be shared api */
    public SourceManager() {
        super(new HashMap<>());
    }

    /**
     * Lazy source manager singleton instance
     */
    private static final class LazyHolder {
        /** Initialized in &lt;clinit&gt; */static final SourceManager INSTANCE;
        static { INSTANCE = new SourceManager(); }
    }

    @Contract(pure = true)
    public static SourceManager getInstance() { return LazyHolder.INSTANCE; }
}
