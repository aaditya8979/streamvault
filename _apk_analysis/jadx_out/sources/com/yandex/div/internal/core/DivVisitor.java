package com.yandex.div.internal.core;

import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DivVisitor.kt */
/* JADX INFO: loaded from: classes10.dex */
public abstract class DivVisitor<T> {
    public abstract T defaultVisit(@NotNull Div div, @NotNull ExpressionResolver expressionResolver);

    public T visit(@NotNull Div.b bVar, @NotNull ExpressionResolver expressionResolver) {
        return defaultVisit(bVar, expressionResolver);
    }

    public T visit(@NotNull Div.c cVar, @NotNull ExpressionResolver expressionResolver) {
        return defaultVisit(cVar, expressionResolver);
    }

    public T visit(@NotNull Div.d dVar, @NotNull ExpressionResolver expressionResolver) {
        return defaultVisit(dVar, expressionResolver);
    }

    public T visit(@NotNull Div.e eVar, @NotNull ExpressionResolver expressionResolver) {
        return defaultVisit(eVar, expressionResolver);
    }

    public T visit(@NotNull Div.f fVar, @NotNull ExpressionResolver expressionResolver) {
        return defaultVisit(fVar, expressionResolver);
    }

    public T visit(@NotNull Div.g gVar, @NotNull ExpressionResolver expressionResolver) {
        return defaultVisit(gVar, expressionResolver);
    }

    public T visit(@NotNull Div.h hVar, @NotNull ExpressionResolver expressionResolver) {
        return defaultVisit(hVar, expressionResolver);
    }

    public T visit(@NotNull Div.i iVar, @NotNull ExpressionResolver expressionResolver) {
        return defaultVisit(iVar, expressionResolver);
    }

    public T visit(@NotNull Div.j jVar, @NotNull ExpressionResolver expressionResolver) {
        return defaultVisit(jVar, expressionResolver);
    }

    public T visit(@NotNull Div.k kVar, @NotNull ExpressionResolver expressionResolver) {
        return defaultVisit(kVar, expressionResolver);
    }

    public T visit(@NotNull Div.l lVar, @NotNull ExpressionResolver expressionResolver) {
        return defaultVisit(lVar, expressionResolver);
    }

    public T visit(@NotNull Div.m mVar, @NotNull ExpressionResolver expressionResolver) {
        return defaultVisit(mVar, expressionResolver);
    }

    public T visit(@NotNull Div.n nVar, @NotNull ExpressionResolver expressionResolver) {
        return defaultVisit(nVar, expressionResolver);
    }

    public T visit(@NotNull Div.o oVar, @NotNull ExpressionResolver expressionResolver) {
        return defaultVisit(oVar, expressionResolver);
    }

    public T visit(@NotNull Div.p pVar, @NotNull ExpressionResolver expressionResolver) {
        return defaultVisit(pVar, expressionResolver);
    }

    public T visit(@NotNull Div.q qVar, @NotNull ExpressionResolver expressionResolver) {
        return defaultVisit(qVar, expressionResolver);
    }

    public T visit(@NotNull Div.r rVar, @NotNull ExpressionResolver expressionResolver) {
        return defaultVisit(rVar, expressionResolver);
    }

    public final T visit(@NotNull Div div, @NotNull ExpressionResolver expressionResolver) {
        if (div instanceof Div.q) {
            return visit((Div.q) div, expressionResolver);
        }
        if (div instanceof Div.g) {
            return visit((Div.g) div, expressionResolver);
        }
        if (div instanceof Div.e) {
            return visit((Div.e) div, expressionResolver);
        }
        if (div instanceof Div.l) {
            return visit((Div.l) div, expressionResolver);
        }
        if (div instanceof Div.b) {
            return visit((Div.b) div, expressionResolver);
        }
        if (div instanceof Div.f) {
            return visit((Div.f) div, expressionResolver);
        }
        if (div instanceof Div.d) {
            return visit((Div.d) div, expressionResolver);
        }
        if (div instanceof Div.j) {
            return visit((Div.j) div, expressionResolver);
        }
        if (div instanceof Div.p) {
            return visit((Div.p) div, expressionResolver);
        }
        if (div instanceof Div.n) {
            return visit((Div.n) div, expressionResolver);
        }
        if (div instanceof Div.c) {
            return visit((Div.c) div, expressionResolver);
        }
        if (div instanceof Div.h) {
            return visit((Div.h) div, expressionResolver);
        }
        if (div instanceof Div.m) {
            return visit((Div.m) div, expressionResolver);
        }
        if (div instanceof Div.i) {
            return visit((Div.i) div, expressionResolver);
        }
        if (div instanceof Div.k) {
            return visit((Div.k) div, expressionResolver);
        }
        if (div instanceof Div.r) {
            return visit((Div.r) div, expressionResolver);
        }
        if (div instanceof Div.o) {
            return visit((Div.o) div, expressionResolver);
        }
        throw new NoWhenBranchMatchedException();
    }
}
