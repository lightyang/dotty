
/*
 * Copyright (C) 2012-2014 Typesafe Inc. <http://www.typesafe.com>
 */

package scala.compat.java8;

@FunctionalInterface
public interface JFunction2$mcJID$sp extends JFunction2 {
    abstract long apply$mcJID$sp(int v1, double v2);

    default Object apply(Object v1, Object v2) { return (Long) apply$mcJID$sp((Integer) v1, (Double) v2); }
}
