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
 * For feedback, reporting bugs, use the project on Github
 * @see <a href="https://github.com/keighrim/mae-annotation">https://github.com/keighrim/mae-annotation</a>.
 */

package edu.brandeis.llc.mae;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Calendar;
import java.util.Properties;

/**
 * Contains string resources for MAE
 *
 */
public class MaeStrings {

    public static String getVersion()
    {
        String path = "/version.properties";
        InputStream stream = MaeStrings.class.getResourceAsStream(path);
        if (stream == null)
            return "vUNKNOWN";
        Properties props = new Properties();
        try {
            props.load(stream);
            stream.close();
            return (String) props.get("version");
        } catch (IOException e) {
            return "vUNKNOWN";
        }
    }

    /* External information */
    public final static String PROJECT_WEBPAGE = "https://github.com/keighrim/mae-annotation";
    public final static String IAA_HELP_WEBPAGE = "https://github.com/keighrim/mae-annotation/wiki/iaacalc";
    public final static String CUR_YEAR = String.valueOf(Calendar.getInstance().get(Calendar.YEAR));
    public final static String VERSION = getVersion();
    public final static String TITLE_PREFIX = "MAE " + VERSION;
    public final static String DB_DRIVER = "jdbc:sqlite:";
    public static String newTempTestDBFile() throws IOException {
        return File.createTempFile("mae-test-db", ".db").getAbsolutePath();
    }
    public final static String DEF_GS_FILE = "goldstandard.xml";

    /* Internal data structures and actionEvents */
    public final static String COMBO_DELIMITER = " - ";
    public final static String SPANRANGE = "~";
    public final static String SPANDELIMITER = ",";
    public final static int NC_START = -1;
    public final static int NC_END = -1;
    public final static String NC_TEXT = "";
    public final static String NCSPAN_PLACEHOLDER = String.format("%d%s%d",
            MaeStrings.NC_START, MaeStrings.SPANRANGE, MaeStrings.NC_END);

    public final static String ATT_VALUESET_SEPARATOR = ":::";
    // these two might be too much hard-coded
    public final static String SPANTEXTTRUNC = " ... ";
    public final static String LONGTEXTTRUNC = " … ";
    public final static String ADD_NC_COMMAND = "ADDNC:";
    public final static String ADD_LINK_COMMAND = "ADDLINK:";
    public final static String ADD_LINK_WITH_ARGS_COMMAND = "ADDLINKARGS:";
    public final static String ALL_TABLE_TAB_BACK_NAME = new Object().toString();
    public final static String ALL_TABLE_TAB_PREFIX = "@ALL@";
    public final static String ALL_TABLE_TAB_FRONT_NAME = "All Extents";
    public final static String SRC_COL_NAME = "@source";
    public final static String ID_COL_NAME = "id";
    public final static String SPANS_COL_NAME = "spans";
    public final static String TEXT_COL_NAME = "text";
    public final static String SEP = "@#";
    public final static String ARG_IDCOL_SUF = "ID";
    public final static String ARG_TEXTCOL_SUF = "Text";

    /* Status bar messages */
    public static final String WAIT_MESSAGE = "Processing...";
    public final static String SB_NODTD = "No DTD loaded.";
    public final static String SB_NOFILE = "No file loaded.";
    public final static String SB_TEXT = "Selected: ";
    public final static String SB_NOTEXT = "No Text Selected";
    public final static String SB_TAG= " %d Tags Selected: %s";
    public final static String SB_NOTAG = "No Tags Selected";
    public final static String SB_MSPAN_MODE_NOTI = "Now in discontiguous span selection mode! Click anywhere to continue.";
    public final static String SB_ARGSEL_MODE_NOTI = "Now in arguments selection mode! Click anywhere to continue.";
    public final static String SB_NORM_MODE_NOTI = "Now in normal mode! Click anywhere to continue.";
    public final static String SB_FILEOPEN = "New document is successfully open! Click anywhere to continue.";
    public final static String SB_NEWTASK = "New task is successfully loaded! Open a document to annotate.";
    public final static String SB_MSPAN_MODE_PREFIX = "Multi-span";
    public final static String SB_MSPAN_TEXT = SB_TEXT;
    public final static String SB_MSPAN_NOTEXT = SB_NOTEXT;
    public final static String SB_MARGS_MODE_PREFIX = "Arguments select";
    public final static String SB_MARGS_TAG = SB_TAG;
    public final static String SB_MARGS_NOTAG = SB_NOTAG;
    public final static String SB_ADJUD_PREFIX = "ADJUDICATING!";
    public final static String SB_ADJUD_TAG = " %d %s Tags Selected.";
    public final static String SB_BG_WIPING = "Closing: %1$10s";

    /* main menus */
    public final static String MENU_FILE = "File";
    public final static String MENUITEM_LOADTASK = "New Task Definition";
    public final static String MENUITEM_OPENFILE = "Open Document";
    public final static String MENUITEM_ADDFILE = "Add Document";
    public final static String MENUITEM_SAVEXML = "Save Annotation As XML";
    public final static String MENU_FILE_ITEM_SAVERTF = "Export Annotation as RTF";
    public final static String MENU_FILE_ITEM_LOADGS = "Load Gold Standard File";
    public final static String MENUITEM_CLOSEFILE = "Close Document";
    public final static String MENUITEM_START_ADJUD = "Start Adjudication";
    public final static String MENUITEM_END_ADJUD = "End Adjudication";
    public final static String MENU_TAGS = "Tags";
    public final static String MENU_MODE = "Mode";
    public final static String MENUITEM_MSPAN_MODE = "Switch to discontiguous span selection mode";
    public final static String MENUITEM_ARGSEL_MODE = "Switch to argument selection mode";
    public final static String MENUITEM_NORMAL_MODE = "Return to normal mode";
    public final static String MENUITEM_IAA_MODE = "Start IAA calculator";
    public final static String MENU_DISPLAY = "Display";
    public final static String MENUITEM_ZOOMIN = "Increase font size";
    public final static String MENUITEM_ZOOMOUT = "Decrease font size";
    public final static String MENUITEM_RESET_ZOOM = "Reset font size";
    public final static String MENUITEM_BIGFONT = "Huge Font";
    public final static String MENU_PREFS = "Preferences";
    public final static String MENUITEM_SAVE_SUFFIX = "Set annotator suffix";
    public final static String MENUITEM_SAVE_DIR = "Set save location";
    public final static String MENUITEM_RETURN_TO_NORMAL_MODE = "Return to the normal mode after an action";
    public final static String MENUITEM_DONT_WARN_TXT2XML = "Suppress \"New XML created\" popup";
    public final static String MENU_EDIT = "Edit";
    public final static String MENUITEM_SEARCH = "Search";

    public final static String MENU_HELP = "Help";
    public final static String MENUITEM_ABOUT = "About";
    public final static String MENUITEM_WEB = "Project website";

    /* popup menus */
    public final static String MENUITEM_NOTEXT = SB_NOTEXT;
    public final static String MENUITEM_UNDOSELECTION = "Undo last selection";
    public final static String MENUITEM_STARTOVER = "Wipe all selections";
    public final static String MENU_DELETE_TAG = "Delete ...";
    public final static String MENUITEM_DELETE_TAG_SINGLE = "Delete %s"; // tid
    public final static String MENUITEM_DELETE_TAG_PLURAL = "Delete all %d tags"; // numbers, list of tids
    public final static String MENU_SETARG = "Set ...";
    public final static String MENUITEM_SETARG_SINGLE = "Set %s as argument of link tag"; // tid
    public final static String MENUITEM_CREATE_ETAG = "Create Extent Tag with selected text";
    public final static String MENUITEM_CREATE_CURTYPE_ETAG = "Create %s Tag with selected text";
    public final static String MENUITEM_CREATE_CURTYPE_NC_ETAG = "Create %s Tag as non-consuming";
    public final static String MENUITEM_CREATE_CURTYPE_LTAG = "Create %s Tag with selected arguments";
    public final static String MENUITEM_CREATE_CURTYPE_EMP_LTAG = "Create %s Tag with no arguments associated";
    public final static String MENUITEM_CREATE_NCTAG = "Create NC Extent Tag with no text associated";
    public final static String MENUITEM_CREATE_LTAG_EMPTY = "Create Link Tag with no arguments associated";
    public final static String MENUITEM_CREATE_LTAG_FROM_SEL = "Create Link tag with selected arguments";
    public final static String MENUITEM_COPY_TAG_SINGLE = "Copy %s from %s to gold standard";
    public final static String MENU_COPY = "Copy ...";

    /* for dialogs */
    public final static String SETARG_SEL_TAGTYPE = "Select Link Type";
    public final static String SETARG_SEL_ARGTYPE = "Select Argument Type";
    public final static String SETARG_SEL_TAG = "Select Link Tag";
    public final static String ADJUD_DIALOG_TITLE = "Start Adjudication";
    public final static String START_ADJUD_MSG = "This will start an adjudication.";
    public final static String START_ADJUD_NEW_GS_OPTION = "Start with an empty gold-standard";
    public final static String START_ADJUD_LOAD_GS_OPTION = "Load a gold-standard file";
    public final static String UNDERSPEC_TITLE = "Missing Something";
    public final static String UNDERSPEC_MSG = "<html><p align=\"center\">You have %d underspecified %s! <br/> Continue?</p></html>";

    /* general messages */
    public final static String NO_TASK_IND = "No DTD";
    public final static String NO_FILE_IND = "No File";
    public final static String NO_TASK_GUIDE = "Start a new task by loading a DTD.";
    public final static String NO_FILE_GUIDE = "Start a new annotation by opening a file. \n\nFile can be a plain text file that contains the primary document, or an XML document with stand-alone annotations.";
    public static final String UNSAVED_INDICATOR = "*";
    public static final String CANCEL = "Cancel";

    /* popup messages */
    public static final String INFO_POPUP_TITLE = "You need to know...";
    public static final String WARN_POPUP_TITLE = "Attention, Please";
    public static final String ERROR_POPUP_TITLE = "This is embarrassing ...";

    /* error messages */
    public static final String FILE_NOT_XML_AND_DELETE_ERR = "File is not an XML!\n" +
            "Tried to generate a new XML file, but failed due to the following:\n";
    public static final String FILE_NOT_XML_ERR = "File is not an XML!\n" +
            "Reading as the primary text, a new XML file will be generated: \n";
    public static final String XML_NOT_MATCH_ERR = "\"%s\" is not a \"%s\" task!\n" +
            "Make sure you load annotation file that matches the DTD loaded.";
    public static String getFileNotXmlErr(String filename) {
        return FILE_NOT_XML_ERR + filename;
    }
    public static String getXmlNotMatchErr(String filename, String taskName) {
        return String.format(XML_NOT_MATCH_ERR, filename, taskName);
    }

    /* XML strings */

    public static String maeXMLHeader = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n<%s>\n<TEXT><![CDATA[";
    public static String maeXMLFooter = "]]></TEXT>\n</%s>";


    /* help messages */
    public static final String ABOUT_TITLE = String.format("MAE %s", VERSION);
    public static final String ABOUT_MESSAGE = String.format(
            "<html>" +
            "<h1>MAE: <br/> Multi-purpose Annotation Editor</h1>" +
            "<h4>Version %s<h4>" +
            "<p style='width: 400px;'>" +
            "Developed in Lab for Linguistics and Computation,<br/> " +
            "Brandeis University 2010-%s.<br/><br/>" +
            "MAE is a free software.<br/> " +
            "This distribution of MAE (the software and the source code) is " +
                    "covered under the GNU General Public License version 3. " +
                    "Visit course website for user guide and components license."
            , VERSION, CUR_YEAR);

    public static final Font UNICODE_FONT = new Font("DejaVu Sans", Font.PLAIN, 12);
}
