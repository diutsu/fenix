/**
 * Copyright © 2002 Instituto Superior Técnico
 *
 * This file is part of FenixEdu Academic.
 *
 * FenixEdu Academic is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * FenixEdu Academic is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with FenixEdu Academic.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.fenixedu.academic.domain.documents;

import org.fenixedu.academic.domain.Person;
import org.fenixedu.academic.domain.exceptions.DomainException;
import org.fenixedu.academic.domain.organizationalStructure.Party;

import pt.ist.fenixframework.Atomic;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Pedro Santos (pmrsa)
 */
public class GeneratedDocumentWithoutSource extends GeneratedDocumentWithoutSource_Base {
    public GeneratedDocumentWithoutSource(GeneratedDocumentType type, Party addressee, Person operator, String filename,
            InputStream content) throws IOException {
        super();
        init(type, addressee, operator, filename, content);
    }

    @Atomic
    public static void createDocument(GeneratedDocumentType type, Party addressee, Person operator, String filename,
            InputStream content) {
        try {
            new GeneratedDocumentWithoutSource(type, addressee, operator, filename, content);
        } catch (IOException e) {
            throw new DomainException("error.file");
        }
    }
}
