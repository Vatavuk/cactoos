/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2017-2018 Yegor Bugayenko
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NON-INFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package org.cactoos.iterable;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Iterable of long values.
 *
 * @since 1.0
 * @todo #802:30min Introduce IteratorOfLongs and IteratorOfShorts which will
 *  take array of their related primitive types (long, short) and
 *  produce iterator of reference type (Long, Short).
 *  Refactor appropriate IterableOf* classes by using those newly created
 *  iterators to avoid unnecessary copying elements to a new array.
 */
public final class IterableOfLongs extends IterableEnvelope<Long> {

    /**
     * Ctor.
     * @param values Long values
     */
    public IterableOfLongs(final long... values) {
        super(() -> {
            final Collection<Long> iterable =
                new ArrayList<>(values.length);
            for (final long value: values) {
                iterable.add(value);
            }
            return iterable;
        });
    }
}
