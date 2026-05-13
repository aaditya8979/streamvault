package bo;

import java.util.Iterator;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;

/* JADX INFO: compiled from: Regex.kt */
/* JADX INFO: loaded from: classes.dex */
public final class p {
    public static final l f(Matcher matcher, int i10, CharSequence charSequence) {
        if (matcher.find(i10)) {
            return new m(matcher, charSequence);
        }
        return null;
    }

    public static final l g(Matcher matcher, CharSequence charSequence) {
        if (matcher.matches()) {
            return new m(matcher, charSequence);
        }
        return null;
    }

    public static final zn.i h(MatchResult matchResult) {
        return zn.n.v(matchResult.start(), matchResult.end());
    }

    public static final zn.i i(MatchResult matchResult, int i10) {
        return zn.n.v(matchResult.start(i10), matchResult.end(i10));
    }

    public static final int j(Iterable<? extends e> iterable) {
        Iterator<? extends e> it = iterable.iterator();
        int value = 0;
        while (it.hasNext()) {
            value |= it.next().getValue();
        }
        return value;
    }
}
