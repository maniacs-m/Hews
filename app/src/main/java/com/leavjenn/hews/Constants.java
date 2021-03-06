package com.leavjenn.hews;

public final class Constants {
    public static final String KEY_POST_PARCEL = "post";
    public static final String KEY_IS_BOOKMARKED = "is_bookmarked";
    public static final String YCOMBINATOR_ITEM_URL = "https://news.ycombinator.com/item?id=";
    public static final String TYPE_SEARCH = "search";
    public static final String TYPE_BOOKMARK = "type_bookmark";
    public static final String TYPE_STORY = "type_story";
    public static final String KEY_API_URL = "https://hacker-news.firebaseio.com/v0";
    public static final String KEY_ITEM_URL = "https://hacker-news.firebaseio.com/v0/item/";
    public static final String STORY_TYPE_TOP_PATH = "topstories";
    public static final String STORY_TYPE_NEW_PATH = "newstories";
    public static final String STORY_TYPE_ASK_HN_PATH = "askstories";
    public static final String STORY_TYPE_SHOW_HN_PATH = "showstories";

    public static final String SEARCH_BASE_URL = "https://hn.algolia.com/api/v1/";

    public final static int NUM_LOADING_ITEMS = 25;
    public final static int NUM_LOADING_ITEMS_SPLIT = 7;

    public final static int LOADING_IDLE = 0;
    public final static int LOADING_IN_PROGRESS = 1;
    public final static int LOADING_FINISH = 2;
    public final static int LOADING_ERROR = 3;
    public final static int LOADING_PROMPT_NO_CONTENT = 4;

    public static final boolean LOGIN_STATE_IN = true;
    public static final boolean LOGIN_STATE_OUT = false;

    public static final int OPERATE_SUCCESS = 0;
    public static final int OPERATE_ERROR_NO_COOKIE = 1;
    public static final int OPERATE_ERROR_COOKIE_EXPIRED = 2;
    public static final int OPERATE_ERROR_HAVE_VOTED = 3;
    public static final int OPERATE_ERROR_NOT_ENOUGH_KARMA = 4;
    public static final int OPERATE_ERROR_UNKNOWN = 64;

    public static final int VOTE_UP = 1;
    public static final int VOTE_DOWN = 2;

    public static final String FRAGMENT_TAG_COMMENT = "comment_fragment";
}
