/*
 * MAE - Multi-purpose Annotation Environment
 *
 * Copyright Keigh Rim (krim@brandeis.edu)
 * Department of Computer Science, Brandeis University
 * Original program by Amber Stubbs (astubbs@cs.brandeis.edu)
 *
 * MAE is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, @see <a href="http://www.gnu.org/licenses">http://www.gnu.org/licenses</a>.
 *
 * For feedback, reporting bugs, use the project repo on github
 * @see <a href="https://github.com/keighrim/mae-annotation">https://github.com/keighrim/mae-annotation</a>
 */

package edu.brandeis.cs.nlp.mae.model;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.ForeignCollectionField;
import com.j256.ormlite.table.DatabaseTable;

/**
 * Created by krim on 12/9/2015.
 */

@DatabaseTable(tableName = ModelStrings.TAB_ART)
public class ArgumentType implements IModel {

    @DatabaseField(generatedId = true, columnName = ModelStrings.TAB_ART_COL_ID)
    private int id;

    @DatabaseField(foreign = true, canBeNull = false,
            columnName = ModelStrings.TAB_ART_FCOL_TT)
    private TagType tagType;

    @ForeignCollectionField(eager = true)
    private ForeignCollection<Argument> arguments;

    @DatabaseField(canBeNull =false, columnName = ModelStrings.TAB_ART_COL_NAME)
    private String name;

    @DatabaseField(canBeNull = false, columnName = ModelStrings.TAB_ART_COL_REQ)
    private boolean isRequired;

    public ArgumentType() {

    }

    public ArgumentType(TagType tagType, String name) {
        this.tagType = tagType;
        this.name = name;
        this.setRequired(false);
    }

    public String getId() {
        return Integer.toString(id);
    }

    public TagType getTagType() {
        return tagType;
    }

    public void setTagType(TagType tagType) {
        this.tagType = tagType;
    }

    public ForeignCollection<Argument> getArguments() {
        return arguments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isRequired() {
        return isRequired;
    }

    public void setRequired(boolean required) {
        isRequired = required;
    }
}
