// $ANTLR 3.5.2 org/apache/hadoop/hive/ql/parse/HiveLexer.g 2020-05-20 18:31:02

package org.apache.hadoop.hive.ql.parse;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hive.conf.HiveConf;
import org.apache.commons.lang3.StringUtils;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

/**
   Licensed to the Apache Software Foundation (ASF) under one or more 
   contributor license agreements.  See the NOTICE file distributed with 
   this work for additional information regarding copyright ownership.
   The ASF licenses this file to You under the Apache License, Version 2.0
   (the "License"); you may not use this file except in compliance with 
   the License.  You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/
@SuppressWarnings("all")
public class HiveLexer extends Lexer {
	public static final int EOF=-1;
	public static final int AMPERSAND=4;
	public static final int BITWISEOR=5;
	public static final int BITWISEXOR=6;
	public static final int ByteLengthLiteral=7;
	public static final int COLON=8;
	public static final int COMMA=9;
	public static final int CONCATENATE=10;
	public static final int CharSetLiteral=11;
	public static final int CharSetName=12;
	public static final int DIV=13;
	public static final int DIVIDE=14;
	public static final int DOLLAR=15;
	public static final int DOT=16;
	public static final int Digit=17;
	public static final int EQUAL=18;
	public static final int EQUAL_NS=19;
	public static final int Exponent=20;
	public static final int GREATERTHAN=21;
	public static final int GREATERTHANOREQUALTO=22;
	public static final int HexDigit=23;
	public static final int Identifier=24;
	public static final int IntegralLiteral=25;
	public static final int KW_ABORT=26;
	public static final int KW_ACTIVATE=27;
	public static final int KW_ACTIVE=28;
	public static final int KW_ADD=29;
	public static final int KW_ADMIN=30;
	public static final int KW_AFTER=31;
	public static final int KW_ALL=32;
	public static final int KW_ALLOC_FRACTION=33;
	public static final int KW_ALTER=34;
	public static final int KW_ANALYZE=35;
	public static final int KW_AND=36;
	public static final int KW_ANY=37;
	public static final int KW_APPLICATION=38;
	public static final int KW_ARCHIVE=39;
	public static final int KW_ARRAY=40;
	public static final int KW_AS=41;
	public static final int KW_ASC=42;
	public static final int KW_AT=43;
	public static final int KW_AUTHORIZATION=44;
	public static final int KW_AUTOCOMMIT=45;
	public static final int KW_BEFORE=46;
	public static final int KW_BETWEEN=47;
	public static final int KW_BIGINT=48;
	public static final int KW_BINARY=49;
	public static final int KW_BOOLEAN=50;
	public static final int KW_BOTH=51;
	public static final int KW_BUCKET=52;
	public static final int KW_BUCKETS=53;
	public static final int KW_BY=54;
	public static final int KW_CACHE=55;
	public static final int KW_CASCADE=56;
	public static final int KW_CASE=57;
	public static final int KW_CAST=58;
	public static final int KW_CBO=59;
	public static final int KW_CHANGE=60;
	public static final int KW_CHAR=61;
	public static final int KW_CHECK=62;
	public static final int KW_CLUSTER=63;
	public static final int KW_CLUSTERED=64;
	public static final int KW_CLUSTERSTATUS=65;
	public static final int KW_COLLECTION=66;
	public static final int KW_COLUMN=67;
	public static final int KW_COLUMNS=68;
	public static final int KW_COMMENT=69;
	public static final int KW_COMMIT=70;
	public static final int KW_COMPACT=71;
	public static final int KW_COMPACTIONS=72;
	public static final int KW_COMPUTE=73;
	public static final int KW_CONCATENATE=74;
	public static final int KW_CONF=75;
	public static final int KW_CONSTRAINT=76;
	public static final int KW_CONTINUE=77;
	public static final int KW_COST=78;
	public static final int KW_CREATE=79;
	public static final int KW_CRON=80;
	public static final int KW_CROSS=81;
	public static final int KW_CUBE=82;
	public static final int KW_CURRENT=83;
	public static final int KW_CURRENT_DATE=84;
	public static final int KW_CURRENT_TIMESTAMP=85;
	public static final int KW_CURSOR=86;
	public static final int KW_DATA=87;
	public static final int KW_DATABASE=88;
	public static final int KW_DATABASES=89;
	public static final int KW_DATE=90;
	public static final int KW_DATETIME=91;
	public static final int KW_DAY=92;
	public static final int KW_DBPROPERTIES=93;
	public static final int KW_DEBUG=94;
	public static final int KW_DECIMAL=95;
	public static final int KW_DEFAULT=96;
	public static final int KW_DEFERRED=97;
	public static final int KW_DEFINED=98;
	public static final int KW_DELETE=99;
	public static final int KW_DELIMITED=100;
	public static final int KW_DEPENDENCY=101;
	public static final int KW_DESC=102;
	public static final int KW_DESCRIBE=103;
	public static final int KW_DETAIL=104;
	public static final int KW_DIRECTORIES=105;
	public static final int KW_DIRECTORY=106;
	public static final int KW_DISABLE=107;
	public static final int KW_DISTINCT=108;
	public static final int KW_DISTRIBUTE=109;
	public static final int KW_DISTRIBUTED=110;
	public static final int KW_DO=111;
	public static final int KW_DOUBLE=112;
	public static final int KW_DOW=113;
	public static final int KW_DROP=114;
	public static final int KW_DUMP=115;
	public static final int KW_ELEM_TYPE=116;
	public static final int KW_ELSE=117;
	public static final int KW_ENABLE=118;
	public static final int KW_END=119;
	public static final int KW_ENFORCED=120;
	public static final int KW_ESCAPED=121;
	public static final int KW_EVERY=122;
	public static final int KW_EXCEPT=123;
	public static final int KW_EXCHANGE=124;
	public static final int KW_EXCLUSIVE=125;
	public static final int KW_EXECUTE=126;
	public static final int KW_EXECUTED=127;
	public static final int KW_EXISTS=128;
	public static final int KW_EXPLAIN=129;
	public static final int KW_EXPORT=130;
	public static final int KW_EXPRESSION=131;
	public static final int KW_EXTENDED=132;
	public static final int KW_EXTERNAL=133;
	public static final int KW_EXTRACT=134;
	public static final int KW_FALSE=135;
	public static final int KW_FETCH=136;
	public static final int KW_FIELDS=137;
	public static final int KW_FILE=138;
	public static final int KW_FILEFORMAT=139;
	public static final int KW_FIRST=140;
	public static final int KW_FLOAT=141;
	public static final int KW_FLOOR=142;
	public static final int KW_FOLLOWING=143;
	public static final int KW_FOR=144;
	public static final int KW_FORCE=145;
	public static final int KW_FOREIGN=146;
	public static final int KW_FORMAT=147;
	public static final int KW_FORMATTED=148;
	public static final int KW_FROM=149;
	public static final int KW_FULL=150;
	public static final int KW_FUNCTION=151;
	public static final int KW_FUNCTIONS=152;
	public static final int KW_GRANT=153;
	public static final int KW_GROUP=154;
	public static final int KW_GROUPING=155;
	public static final int KW_HAVING=156;
	public static final int KW_HOUR=157;
	public static final int KW_IDXPROPERTIES=158;
	public static final int KW_IF=159;
	public static final int KW_IMPORT=160;
	public static final int KW_IN=161;
	public static final int KW_INDEX=162;
	public static final int KW_INDEXES=163;
	public static final int KW_INNER=164;
	public static final int KW_INPATH=165;
	public static final int KW_INPUTDRIVER=166;
	public static final int KW_INPUTFORMAT=167;
	public static final int KW_INSERT=168;
	public static final int KW_INT=169;
	public static final int KW_INTERSECT=170;
	public static final int KW_INTERVAL=171;
	public static final int KW_INTO=172;
	public static final int KW_IS=173;
	public static final int KW_ISOLATION=174;
	public static final int KW_ITEMS=175;
	public static final int KW_JAR=176;
	public static final int KW_JOIN=177;
	public static final int KW_JOINCOST=178;
	public static final int KW_KEY=179;
	public static final int KW_KEYS=180;
	public static final int KW_KEY_TYPE=181;
	public static final int KW_KILL=182;
	public static final int KW_LAST=183;
	public static final int KW_LATERAL=184;
	public static final int KW_LEFT=185;
	public static final int KW_LESS=186;
	public static final int KW_LEVEL=187;
	public static final int KW_LIKE=188;
	public static final int KW_LIMIT=189;
	public static final int KW_LINES=190;
	public static final int KW_LOAD=191;
	public static final int KW_LOCAL=192;
	public static final int KW_LOCATION=193;
	public static final int KW_LOCK=194;
	public static final int KW_LOCKS=195;
	public static final int KW_LOGICAL=196;
	public static final int KW_LONG=197;
	public static final int KW_MACRO=198;
	public static final int KW_MANAGEDLOCATION=199;
	public static final int KW_MANAGEMENT=200;
	public static final int KW_MAP=201;
	public static final int KW_MAPJOIN=202;
	public static final int KW_MAPPING=203;
	public static final int KW_MATCHED=204;
	public static final int KW_MATERIALIZED=205;
	public static final int KW_MERGE=206;
	public static final int KW_METADATA=207;
	public static final int KW_MINUS=208;
	public static final int KW_MINUTE=209;
	public static final int KW_MONTH=210;
	public static final int KW_MORE=211;
	public static final int KW_MOVE=212;
	public static final int KW_MSCK=213;
	public static final int KW_NONE=214;
	public static final int KW_NORELY=215;
	public static final int KW_NOSCAN=216;
	public static final int KW_NOT=217;
	public static final int KW_NOVALIDATE=218;
	public static final int KW_NULL=219;
	public static final int KW_NULLS=220;
	public static final int KW_OF=221;
	public static final int KW_OFFSET=222;
	public static final int KW_ON=223;
	public static final int KW_ONLY=224;
	public static final int KW_OPERATOR=225;
	public static final int KW_OPTION=226;
	public static final int KW_OR=227;
	public static final int KW_ORDER=228;
	public static final int KW_OUT=229;
	public static final int KW_OUTER=230;
	public static final int KW_OUTPUTDRIVER=231;
	public static final int KW_OUTPUTFORMAT=232;
	public static final int KW_OVER=233;
	public static final int KW_OVERWRITE=234;
	public static final int KW_OWNER=235;
	public static final int KW_PARTITION=236;
	public static final int KW_PARTITIONED=237;
	public static final int KW_PARTITIONS=238;
	public static final int KW_PATH=239;
	public static final int KW_PERCENT=240;
	public static final int KW_PLAN=241;
	public static final int KW_PLANS=242;
	public static final int KW_PLUS=243;
	public static final int KW_POOL=244;
	public static final int KW_PRECEDING=245;
	public static final int KW_PRECISION=246;
	public static final int KW_PRESERVE=247;
	public static final int KW_PRIMARY=248;
	public static final int KW_PRINCIPALS=249;
	public static final int KW_PROCEDURE=250;
	public static final int KW_PURGE=251;
	public static final int KW_QUARTER=252;
	public static final int KW_QUERY=253;
	public static final int KW_QUERY_PARALLELISM=254;
	public static final int KW_RANGE=255;
	public static final int KW_READ=256;
	public static final int KW_READS=257;
	public static final int KW_REBUILD=258;
	public static final int KW_RECORDREADER=259;
	public static final int KW_RECORDWRITER=260;
	public static final int KW_REDUCE=261;
	public static final int KW_REFERENCES=262;
	public static final int KW_REGEXP=263;
	public static final int KW_RELOAD=264;
	public static final int KW_RELY=265;
	public static final int KW_RENAME=266;
	public static final int KW_REOPTIMIZATION=267;
	public static final int KW_REPAIR=268;
	public static final int KW_REPL=269;
	public static final int KW_REPLACE=270;
	public static final int KW_REPLICATION=271;
	public static final int KW_RESOURCE=272;
	public static final int KW_RESTRICT=273;
	public static final int KW_REVOKE=274;
	public static final int KW_REWRITE=275;
	public static final int KW_RIGHT=276;
	public static final int KW_RLIKE=277;
	public static final int KW_ROLE=278;
	public static final int KW_ROLES=279;
	public static final int KW_ROLLBACK=280;
	public static final int KW_ROLLUP=281;
	public static final int KW_ROW=282;
	public static final int KW_ROWS=283;
	public static final int KW_SCHEDULED=284;
	public static final int KW_SCHEDULING_POLICY=285;
	public static final int KW_SCHEMA=286;
	public static final int KW_SCHEMAS=287;
	public static final int KW_SECOND=288;
	public static final int KW_SELECT=289;
	public static final int KW_SEMI=290;
	public static final int KW_SERDE=291;
	public static final int KW_SERDEPROPERTIES=292;
	public static final int KW_SERVER=293;
	public static final int KW_SET=294;
	public static final int KW_SETS=295;
	public static final int KW_SHARED=296;
	public static final int KW_SHOW=297;
	public static final int KW_SHOW_DATABASE=298;
	public static final int KW_SKEWED=299;
	public static final int KW_SMALLINT=300;
	public static final int KW_SNAPSHOT=301;
	public static final int KW_SORT=302;
	public static final int KW_SORTED=303;
	public static final int KW_SSL=304;
	public static final int KW_START=305;
	public static final int KW_STATISTICS=306;
	public static final int KW_STATUS=307;
	public static final int KW_STORED=308;
	public static final int KW_STREAMTABLE=309;
	public static final int KW_STRING=310;
	public static final int KW_STRUCT=311;
	public static final int KW_SUMMARY=312;
	public static final int KW_SYNC=313;
	public static final int KW_TABLE=314;
	public static final int KW_TABLES=315;
	public static final int KW_TABLESAMPLE=316;
	public static final int KW_TBLPROPERTIES=317;
	public static final int KW_TEMPORARY=318;
	public static final int KW_TERMINATED=319;
	public static final int KW_THEN=320;
	public static final int KW_TIME=321;
	public static final int KW_TIMESTAMP=322;
	public static final int KW_TIMESTAMPLOCALTZ=323;
	public static final int KW_TINYINT=324;
	public static final int KW_TO=325;
	public static final int KW_TOUCH=326;
	public static final int KW_TRANSACTION=327;
	public static final int KW_TRANSACTIONAL=328;
	public static final int KW_TRANSACTIONS=329;
	public static final int KW_TRANSFORM=330;
	public static final int KW_TRIGGER=331;
	public static final int KW_TRUE=332;
	public static final int KW_TRUNCATE=333;
	public static final int KW_UNARCHIVE=334;
	public static final int KW_UNBOUNDED=335;
	public static final int KW_UNDO=336;
	public static final int KW_UNION=337;
	public static final int KW_UNIONTYPE=338;
	public static final int KW_UNIQUE=339;
	public static final int KW_UNIQUEJOIN=340;
	public static final int KW_UNLOCK=341;
	public static final int KW_UNMANAGED=342;
	public static final int KW_UNSET=343;
	public static final int KW_UNSIGNED=344;
	public static final int KW_UPDATE=345;
	public static final int KW_URI=346;
	public static final int KW_USE=347;
	public static final int KW_USER=348;
	public static final int KW_USING=349;
	public static final int KW_UTC=350;
	public static final int KW_UTCTIMESTAMP=351;
	public static final int KW_VALIDATE=352;
	public static final int KW_VALUES=353;
	public static final int KW_VALUE_TYPE=354;
	public static final int KW_VARCHAR=355;
	public static final int KW_VECTORIZATION=356;
	public static final int KW_VIEW=357;
	public static final int KW_VIEWS=358;
	public static final int KW_WAIT=359;
	public static final int KW_WEEK=360;
	public static final int KW_WHEN=361;
	public static final int KW_WHERE=362;
	public static final int KW_WHILE=363;
	public static final int KW_WINDOW=364;
	public static final int KW_WITH=365;
	public static final int KW_WORK=366;
	public static final int KW_WORKLOAD=367;
	public static final int KW_WRITE=368;
	public static final int KW_YEAR=369;
	public static final int KW_ZONE=370;
	public static final int LCURLY=371;
	public static final int LESSTHAN=372;
	public static final int LESSTHANOREQUALTO=373;
	public static final int LINE_COMMENT=374;
	public static final int LPAREN=375;
	public static final int LSQUARE=376;
	public static final int Letter=377;
	public static final int MINUS=378;
	public static final int MOD=379;
	public static final int NOTEQUAL=380;
	public static final int Number=381;
	public static final int NumberLiteral=382;
	public static final int PLUS=383;
	public static final int QUERY_HINT=384;
	public static final int QUESTION=385;
	public static final int QuotedIdentifier=386;
	public static final int RCURLY=387;
	public static final int RPAREN=388;
	public static final int RSQUARE=389;
	public static final int RegexComponent=390;
	public static final int SEMICOLON=391;
	public static final int STAR=392;
	public static final int StringLiteral=393;
	public static final int TILDE=394;
	public static final int WS=395;

	  private Configuration hiveConf;
	  
	  public void setHiveConf(Configuration hiveConf) {
	    this.hiveConf = hiveConf;
	  }
	  
	  protected boolean allowQuotedId() {
	    if(hiveConf == null){
	      return false;
	    }
	    String supportedQIds = HiveConf.getVar(hiveConf, HiveConf.ConfVars.HIVE_QUOTEDID_SUPPORT);
	    return !"none".equals(supportedQIds);
	  }


	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public HiveLexer() {} 
	public HiveLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public HiveLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "org/apache/hadoop/hive/ql/parse/HiveLexer.g"; }

	// $ANTLR start "KW_TRUE"
	public final void mKW_TRUE() throws RecognitionException {
		try {
			int _type = KW_TRUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:45:9: ( 'TRUE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:45:11: 'TRUE'
			{
			match("TRUE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TRUE"

	// $ANTLR start "KW_FALSE"
	public final void mKW_FALSE() throws RecognitionException {
		try {
			int _type = KW_FALSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:46:10: ( 'FALSE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:46:12: 'FALSE'
			{
			match("FALSE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FALSE"

	// $ANTLR start "KW_ALL"
	public final void mKW_ALL() throws RecognitionException {
		try {
			int _type = KW_ALL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:47:8: ( 'ALL' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:47:10: 'ALL'
			{
			match("ALL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ALL"

	// $ANTLR start "KW_NONE"
	public final void mKW_NONE() throws RecognitionException {
		try {
			int _type = KW_NONE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:48:8: ( 'NONE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:48:10: 'NONE'
			{
			match("NONE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_NONE"

	// $ANTLR start "KW_AND"
	public final void mKW_AND() throws RecognitionException {
		try {
			int _type = KW_AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:49:8: ( 'AND' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:49:10: 'AND'
			{
			match("AND"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_AND"

	// $ANTLR start "KW_OR"
	public final void mKW_OR() throws RecognitionException {
		try {
			int _type = KW_OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:50:7: ( 'OR' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:50:9: 'OR'
			{
			match("OR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OR"

	// $ANTLR start "KW_NOT"
	public final void mKW_NOT() throws RecognitionException {
		try {
			int _type = KW_NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:51:8: ( 'NOT' | '!' )
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='N') ) {
				alt1=1;
			}
			else if ( (LA1_0=='!') ) {
				alt1=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 1, 0, input);
				throw nvae;
			}

			switch (alt1) {
				case 1 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:51:10: 'NOT'
					{
					match("NOT"); 

					}
					break;
				case 2 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:51:18: '!'
					{
					match('!'); 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_NOT"

	// $ANTLR start "KW_LIKE"
	public final void mKW_LIKE() throws RecognitionException {
		try {
			int _type = KW_LIKE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:52:9: ( 'LIKE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:52:11: 'LIKE'
			{
			match("LIKE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LIKE"

	// $ANTLR start "KW_ANY"
	public final void mKW_ANY() throws RecognitionException {
		try {
			int _type = KW_ANY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:53:8: ( 'ANY' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:53:10: 'ANY'
			{
			match("ANY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ANY"

	// $ANTLR start "KW_IF"
	public final void mKW_IF() throws RecognitionException {
		try {
			int _type = KW_IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:55:7: ( 'IF' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:55:9: 'IF'
			{
			match("IF"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_IF"

	// $ANTLR start "KW_EXISTS"
	public final void mKW_EXISTS() throws RecognitionException {
		try {
			int _type = KW_EXISTS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:56:11: ( 'EXISTS' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:56:13: 'EXISTS'
			{
			match("EXISTS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_EXISTS"

	// $ANTLR start "KW_ASC"
	public final void mKW_ASC() throws RecognitionException {
		try {
			int _type = KW_ASC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:58:8: ( 'ASC' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:58:10: 'ASC'
			{
			match("ASC"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ASC"

	// $ANTLR start "KW_DESC"
	public final void mKW_DESC() throws RecognitionException {
		try {
			int _type = KW_DESC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:59:9: ( 'DESC' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:59:11: 'DESC'
			{
			match("DESC"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DESC"

	// $ANTLR start "KW_NULLS"
	public final void mKW_NULLS() throws RecognitionException {
		try {
			int _type = KW_NULLS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:60:10: ( 'NULLS' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:60:12: 'NULLS'
			{
			match("NULLS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_NULLS"

	// $ANTLR start "KW_LAST"
	public final void mKW_LAST() throws RecognitionException {
		try {
			int _type = KW_LAST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:61:9: ( 'LAST' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:61:11: 'LAST'
			{
			match("LAST"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LAST"

	// $ANTLR start "KW_ORDER"
	public final void mKW_ORDER() throws RecognitionException {
		try {
			int _type = KW_ORDER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:62:10: ( 'ORDER' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:62:12: 'ORDER'
			{
			match("ORDER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ORDER"

	// $ANTLR start "KW_GROUP"
	public final void mKW_GROUP() throws RecognitionException {
		try {
			int _type = KW_GROUP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:63:10: ( 'GROUP' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:63:12: 'GROUP'
			{
			match("GROUP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_GROUP"

	// $ANTLR start "KW_BY"
	public final void mKW_BY() throws RecognitionException {
		try {
			int _type = KW_BY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:64:7: ( 'BY' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:64:9: 'BY'
			{
			match("BY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_BY"

	// $ANTLR start "KW_HAVING"
	public final void mKW_HAVING() throws RecognitionException {
		try {
			int _type = KW_HAVING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:65:11: ( 'HAVING' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:65:13: 'HAVING'
			{
			match("HAVING"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_HAVING"

	// $ANTLR start "KW_WHERE"
	public final void mKW_WHERE() throws RecognitionException {
		try {
			int _type = KW_WHERE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:66:10: ( 'WHERE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:66:12: 'WHERE'
			{
			match("WHERE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_WHERE"

	// $ANTLR start "KW_FROM"
	public final void mKW_FROM() throws RecognitionException {
		try {
			int _type = KW_FROM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:67:9: ( 'FROM' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:67:11: 'FROM'
			{
			match("FROM"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FROM"

	// $ANTLR start "KW_AS"
	public final void mKW_AS() throws RecognitionException {
		try {
			int _type = KW_AS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:68:7: ( 'AS' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:68:9: 'AS'
			{
			match("AS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_AS"

	// $ANTLR start "KW_SELECT"
	public final void mKW_SELECT() throws RecognitionException {
		try {
			int _type = KW_SELECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:69:11: ( 'SELECT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:69:13: 'SELECT'
			{
			match("SELECT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SELECT"

	// $ANTLR start "KW_DISTINCT"
	public final void mKW_DISTINCT() throws RecognitionException {
		try {
			int _type = KW_DISTINCT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:70:13: ( 'DISTINCT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:70:15: 'DISTINCT'
			{
			match("DISTINCT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DISTINCT"

	// $ANTLR start "KW_INSERT"
	public final void mKW_INSERT() throws RecognitionException {
		try {
			int _type = KW_INSERT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:71:11: ( 'INSERT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:71:13: 'INSERT'
			{
			match("INSERT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INSERT"

	// $ANTLR start "KW_OVERWRITE"
	public final void mKW_OVERWRITE() throws RecognitionException {
		try {
			int _type = KW_OVERWRITE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:72:14: ( 'OVERWRITE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:72:16: 'OVERWRITE'
			{
			match("OVERWRITE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OVERWRITE"

	// $ANTLR start "KW_OUTER"
	public final void mKW_OUTER() throws RecognitionException {
		try {
			int _type = KW_OUTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:73:10: ( 'OUTER' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:73:12: 'OUTER'
			{
			match("OUTER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OUTER"

	// $ANTLR start "KW_UNIQUEJOIN"
	public final void mKW_UNIQUEJOIN() throws RecognitionException {
		try {
			int _type = KW_UNIQUEJOIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:74:15: ( 'UNIQUEJOIN' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:74:17: 'UNIQUEJOIN'
			{
			match("UNIQUEJOIN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UNIQUEJOIN"

	// $ANTLR start "KW_PRESERVE"
	public final void mKW_PRESERVE() throws RecognitionException {
		try {
			int _type = KW_PRESERVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:75:13: ( 'PRESERVE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:75:15: 'PRESERVE'
			{
			match("PRESERVE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PRESERVE"

	// $ANTLR start "KW_JOIN"
	public final void mKW_JOIN() throws RecognitionException {
		try {
			int _type = KW_JOIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:76:9: ( 'JOIN' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:76:11: 'JOIN'
			{
			match("JOIN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_JOIN"

	// $ANTLR start "KW_LEFT"
	public final void mKW_LEFT() throws RecognitionException {
		try {
			int _type = KW_LEFT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:77:9: ( 'LEFT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:77:11: 'LEFT'
			{
			match("LEFT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LEFT"

	// $ANTLR start "KW_RIGHT"
	public final void mKW_RIGHT() throws RecognitionException {
		try {
			int _type = KW_RIGHT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:78:10: ( 'RIGHT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:78:12: 'RIGHT'
			{
			match("RIGHT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_RIGHT"

	// $ANTLR start "KW_FULL"
	public final void mKW_FULL() throws RecognitionException {
		try {
			int _type = KW_FULL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:79:9: ( 'FULL' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:79:11: 'FULL'
			{
			match("FULL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FULL"

	// $ANTLR start "KW_ON"
	public final void mKW_ON() throws RecognitionException {
		try {
			int _type = KW_ON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:80:7: ( 'ON' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:80:9: 'ON'
			{
			match("ON"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ON"

	// $ANTLR start "KW_PARTITION"
	public final void mKW_PARTITION() throws RecognitionException {
		try {
			int _type = KW_PARTITION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:81:14: ( 'PARTITION' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:81:16: 'PARTITION'
			{
			match("PARTITION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PARTITION"

	// $ANTLR start "KW_PARTITIONS"
	public final void mKW_PARTITIONS() throws RecognitionException {
		try {
			int _type = KW_PARTITIONS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:82:15: ( 'PARTITIONS' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:82:17: 'PARTITIONS'
			{
			match("PARTITIONS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PARTITIONS"

	// $ANTLR start "KW_TABLE"
	public final void mKW_TABLE() throws RecognitionException {
		try {
			int _type = KW_TABLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:83:9: ( 'TABLE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:83:11: 'TABLE'
			{
			match("TABLE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TABLE"

	// $ANTLR start "KW_TABLES"
	public final void mKW_TABLES() throws RecognitionException {
		try {
			int _type = KW_TABLES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:84:10: ( 'TABLES' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:84:12: 'TABLES'
			{
			match("TABLES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TABLES"

	// $ANTLR start "KW_COLUMNS"
	public final void mKW_COLUMNS() throws RecognitionException {
		try {
			int _type = KW_COLUMNS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:85:11: ( 'COLUMNS' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:85:13: 'COLUMNS'
			{
			match("COLUMNS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_COLUMNS"

	// $ANTLR start "KW_INDEX"
	public final void mKW_INDEX() throws RecognitionException {
		try {
			int _type = KW_INDEX;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:86:9: ( 'INDEX' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:86:11: 'INDEX'
			{
			match("INDEX"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INDEX"

	// $ANTLR start "KW_INDEXES"
	public final void mKW_INDEXES() throws RecognitionException {
		try {
			int _type = KW_INDEXES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:87:11: ( 'INDEXES' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:87:13: 'INDEXES'
			{
			match("INDEXES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INDEXES"

	// $ANTLR start "KW_REBUILD"
	public final void mKW_REBUILD() throws RecognitionException {
		try {
			int _type = KW_REBUILD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:88:11: ( 'REBUILD' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:88:13: 'REBUILD'
			{
			match("REBUILD"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_REBUILD"

	// $ANTLR start "KW_FUNCTIONS"
	public final void mKW_FUNCTIONS() throws RecognitionException {
		try {
			int _type = KW_FUNCTIONS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:89:13: ( 'FUNCTIONS' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:89:15: 'FUNCTIONS'
			{
			match("FUNCTIONS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FUNCTIONS"

	// $ANTLR start "KW_SHOW"
	public final void mKW_SHOW() throws RecognitionException {
		try {
			int _type = KW_SHOW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:90:8: ( 'SHOW' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:90:10: 'SHOW'
			{
			match("SHOW"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SHOW"

	// $ANTLR start "KW_MSCK"
	public final void mKW_MSCK() throws RecognitionException {
		try {
			int _type = KW_MSCK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:91:8: ( 'MSCK' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:91:10: 'MSCK'
			{
			match("MSCK"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MSCK"

	// $ANTLR start "KW_REPAIR"
	public final void mKW_REPAIR() throws RecognitionException {
		try {
			int _type = KW_REPAIR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:92:10: ( 'REPAIR' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:92:12: 'REPAIR'
			{
			match("REPAIR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_REPAIR"

	// $ANTLR start "KW_DIRECTORY"
	public final void mKW_DIRECTORY() throws RecognitionException {
		try {
			int _type = KW_DIRECTORY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:93:13: ( 'DIRECTORY' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:93:15: 'DIRECTORY'
			{
			match("DIRECTORY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DIRECTORY"

	// $ANTLR start "KW_LOCAL"
	public final void mKW_LOCAL() throws RecognitionException {
		try {
			int _type = KW_LOCAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:94:9: ( 'LOCAL' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:94:11: 'LOCAL'
			{
			match("LOCAL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LOCAL"

	// $ANTLR start "KW_TRANSFORM"
	public final void mKW_TRANSFORM() throws RecognitionException {
		try {
			int _type = KW_TRANSFORM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:95:14: ( 'TRANSFORM' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:95:16: 'TRANSFORM'
			{
			match("TRANSFORM"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TRANSFORM"

	// $ANTLR start "KW_USING"
	public final void mKW_USING() throws RecognitionException {
		try {
			int _type = KW_USING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:96:9: ( 'USING' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:96:11: 'USING'
			{
			match("USING"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_USING"

	// $ANTLR start "KW_CLUSTER"
	public final void mKW_CLUSTER() throws RecognitionException {
		try {
			int _type = KW_CLUSTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:97:11: ( 'CLUSTER' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:97:13: 'CLUSTER'
			{
			match("CLUSTER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CLUSTER"

	// $ANTLR start "KW_DISTRIBUTE"
	public final void mKW_DISTRIBUTE() throws RecognitionException {
		try {
			int _type = KW_DISTRIBUTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:98:14: ( 'DISTRIBUTE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:98:16: 'DISTRIBUTE'
			{
			match("DISTRIBUTE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DISTRIBUTE"

	// $ANTLR start "KW_SORT"
	public final void mKW_SORT() throws RecognitionException {
		try {
			int _type = KW_SORT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:99:8: ( 'SORT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:99:10: 'SORT'
			{
			match("SORT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SORT"

	// $ANTLR start "KW_UNION"
	public final void mKW_UNION() throws RecognitionException {
		try {
			int _type = KW_UNION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:100:9: ( 'UNION' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:100:11: 'UNION'
			{
			match("UNION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UNION"

	// $ANTLR start "KW_EXCEPT"
	public final void mKW_EXCEPT() throws RecognitionException {
		try {
			int _type = KW_EXCEPT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:101:10: ( 'EXCEPT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:101:12: 'EXCEPT'
			{
			match("EXCEPT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_EXCEPT"

	// $ANTLR start "KW_LOAD"
	public final void mKW_LOAD() throws RecognitionException {
		try {
			int _type = KW_LOAD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:102:8: ( 'LOAD' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:102:10: 'LOAD'
			{
			match("LOAD"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LOAD"

	// $ANTLR start "KW_EXPORT"
	public final void mKW_EXPORT() throws RecognitionException {
		try {
			int _type = KW_EXPORT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:103:10: ( 'EXPORT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:103:12: 'EXPORT'
			{
			match("EXPORT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_EXPORT"

	// $ANTLR start "KW_IMPORT"
	public final void mKW_IMPORT() throws RecognitionException {
		try {
			int _type = KW_IMPORT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:104:10: ( 'IMPORT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:104:12: 'IMPORT'
			{
			match("IMPORT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_IMPORT"

	// $ANTLR start "KW_REPLICATION"
	public final void mKW_REPLICATION() throws RecognitionException {
		try {
			int _type = KW_REPLICATION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:105:15: ( 'REPLICATION' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:105:17: 'REPLICATION'
			{
			match("REPLICATION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_REPLICATION"

	// $ANTLR start "KW_METADATA"
	public final void mKW_METADATA() throws RecognitionException {
		try {
			int _type = KW_METADATA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:106:12: ( 'METADATA' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:106:14: 'METADATA'
			{
			match("METADATA"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_METADATA"

	// $ANTLR start "KW_DATA"
	public final void mKW_DATA() throws RecognitionException {
		try {
			int _type = KW_DATA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:107:8: ( 'DATA' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:107:10: 'DATA'
			{
			match("DATA"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DATA"

	// $ANTLR start "KW_INPATH"
	public final void mKW_INPATH() throws RecognitionException {
		try {
			int _type = KW_INPATH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:108:10: ( 'INPATH' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:108:12: 'INPATH'
			{
			match("INPATH"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INPATH"

	// $ANTLR start "KW_IS"
	public final void mKW_IS() throws RecognitionException {
		try {
			int _type = KW_IS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:109:6: ( 'IS' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:109:8: 'IS'
			{
			match("IS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_IS"

	// $ANTLR start "KW_NULL"
	public final void mKW_NULL() throws RecognitionException {
		try {
			int _type = KW_NULL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:110:8: ( 'NULL' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:110:10: 'NULL'
			{
			match("NULL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_NULL"

	// $ANTLR start "KW_CREATE"
	public final void mKW_CREATE() throws RecognitionException {
		try {
			int _type = KW_CREATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:111:10: ( 'CREATE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:111:12: 'CREATE'
			{
			match("CREATE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CREATE"

	// $ANTLR start "KW_EXTERNAL"
	public final void mKW_EXTERNAL() throws RecognitionException {
		try {
			int _type = KW_EXTERNAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:112:12: ( 'EXTERNAL' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:112:14: 'EXTERNAL'
			{
			match("EXTERNAL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_EXTERNAL"

	// $ANTLR start "KW_ALTER"
	public final void mKW_ALTER() throws RecognitionException {
		try {
			int _type = KW_ALTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:113:9: ( 'ALTER' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:113:11: 'ALTER'
			{
			match("ALTER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ALTER"

	// $ANTLR start "KW_CHANGE"
	public final void mKW_CHANGE() throws RecognitionException {
		try {
			int _type = KW_CHANGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:114:10: ( 'CHANGE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:114:12: 'CHANGE'
			{
			match("CHANGE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CHANGE"

	// $ANTLR start "KW_COLUMN"
	public final void mKW_COLUMN() throws RecognitionException {
		try {
			int _type = KW_COLUMN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:115:10: ( 'COLUMN' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:115:12: 'COLUMN'
			{
			match("COLUMN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_COLUMN"

	// $ANTLR start "KW_FIRST"
	public final void mKW_FIRST() throws RecognitionException {
		try {
			int _type = KW_FIRST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:116:9: ( 'FIRST' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:116:11: 'FIRST'
			{
			match("FIRST"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FIRST"

	// $ANTLR start "KW_AFTER"
	public final void mKW_AFTER() throws RecognitionException {
		try {
			int _type = KW_AFTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:117:9: ( 'AFTER' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:117:11: 'AFTER'
			{
			match("AFTER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_AFTER"

	// $ANTLR start "KW_DESCRIBE"
	public final void mKW_DESCRIBE() throws RecognitionException {
		try {
			int _type = KW_DESCRIBE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:118:12: ( 'DESCRIBE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:118:14: 'DESCRIBE'
			{
			match("DESCRIBE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DESCRIBE"

	// $ANTLR start "KW_DROP"
	public final void mKW_DROP() throws RecognitionException {
		try {
			int _type = KW_DROP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:119:8: ( 'DROP' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:119:10: 'DROP'
			{
			match("DROP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DROP"

	// $ANTLR start "KW_RENAME"
	public final void mKW_RENAME() throws RecognitionException {
		try {
			int _type = KW_RENAME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:120:10: ( 'RENAME' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:120:12: 'RENAME'
			{
			match("RENAME"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_RENAME"

	// $ANTLR start "KW_TO"
	public final void mKW_TO() throws RecognitionException {
		try {
			int _type = KW_TO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:121:6: ( 'TO' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:121:8: 'TO'
			{
			match("TO"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TO"

	// $ANTLR start "KW_COMMENT"
	public final void mKW_COMMENT() throws RecognitionException {
		try {
			int _type = KW_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:122:11: ( 'COMMENT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:122:13: 'COMMENT'
			{
			match("COMMENT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_COMMENT"

	// $ANTLR start "KW_BOOLEAN"
	public final void mKW_BOOLEAN() throws RecognitionException {
		try {
			int _type = KW_BOOLEAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:123:11: ( 'BOOLEAN' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:123:13: 'BOOLEAN'
			{
			match("BOOLEAN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_BOOLEAN"

	// $ANTLR start "KW_TINYINT"
	public final void mKW_TINYINT() throws RecognitionException {
		try {
			int _type = KW_TINYINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:124:11: ( 'TINYINT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:124:13: 'TINYINT'
			{
			match("TINYINT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TINYINT"

	// $ANTLR start "KW_SMALLINT"
	public final void mKW_SMALLINT() throws RecognitionException {
		try {
			int _type = KW_SMALLINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:125:12: ( 'SMALLINT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:125:14: 'SMALLINT'
			{
			match("SMALLINT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SMALLINT"

	// $ANTLR start "KW_INT"
	public final void mKW_INT() throws RecognitionException {
		try {
			int _type = KW_INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:126:7: ( 'INT' | 'INTEGER' )
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='I') ) {
				int LA2_1 = input.LA(2);
				if ( (LA2_1=='N') ) {
					int LA2_2 = input.LA(3);
					if ( (LA2_2=='T') ) {
						int LA2_3 = input.LA(4);
						if ( (LA2_3=='E') ) {
							alt2=2;
						}

						else {
							alt2=1;
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 2, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 2, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 2, 0, input);
				throw nvae;
			}

			switch (alt2) {
				case 1 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:126:9: 'INT'
					{
					match("INT"); 

					}
					break;
				case 2 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:126:17: 'INTEGER'
					{
					match("INTEGER"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INT"

	// $ANTLR start "KW_BIGINT"
	public final void mKW_BIGINT() throws RecognitionException {
		try {
			int _type = KW_BIGINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:127:10: ( 'BIGINT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:127:12: 'BIGINT'
			{
			match("BIGINT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_BIGINT"

	// $ANTLR start "KW_FLOAT"
	public final void mKW_FLOAT() throws RecognitionException {
		try {
			int _type = KW_FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:128:9: ( 'FLOAT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:128:11: 'FLOAT'
			{
			match("FLOAT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FLOAT"

	// $ANTLR start "KW_DOUBLE"
	public final void mKW_DOUBLE() throws RecognitionException {
		try {
			int _type = KW_DOUBLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:129:10: ( 'DOUBLE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:129:12: 'DOUBLE'
			{
			match("DOUBLE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DOUBLE"

	// $ANTLR start "KW_PRECISION"
	public final void mKW_PRECISION() throws RecognitionException {
		try {
			int _type = KW_PRECISION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:130:13: ( 'PRECISION' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:130:15: 'PRECISION'
			{
			match("PRECISION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PRECISION"

	// $ANTLR start "KW_DATE"
	public final void mKW_DATE() throws RecognitionException {
		try {
			int _type = KW_DATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:131:8: ( 'DATE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:131:10: 'DATE'
			{
			match("DATE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DATE"

	// $ANTLR start "KW_DATETIME"
	public final void mKW_DATETIME() throws RecognitionException {
		try {
			int _type = KW_DATETIME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:132:12: ( 'DATETIME' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:132:14: 'DATETIME'
			{
			match("DATETIME"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DATETIME"

	// $ANTLR start "KW_TIMESTAMP"
	public final void mKW_TIMESTAMP() throws RecognitionException {
		try {
			int _type = KW_TIMESTAMP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:133:13: ( 'TIMESTAMP' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:133:15: 'TIMESTAMP'
			{
			match("TIMESTAMP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TIMESTAMP"

	// $ANTLR start "KW_TIMESTAMPLOCALTZ"
	public final void mKW_TIMESTAMPLOCALTZ() throws RecognitionException {
		try {
			int _type = KW_TIMESTAMPLOCALTZ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:134:20: ( 'TIMESTAMPLOCALTZ' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:134:22: 'TIMESTAMPLOCALTZ'
			{
			match("TIMESTAMPLOCALTZ"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TIMESTAMPLOCALTZ"

	// $ANTLR start "KW_TIME"
	public final void mKW_TIME() throws RecognitionException {
		try {
			int _type = KW_TIME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:135:8: ( 'TIME' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:135:10: 'TIME'
			{
			match("TIME"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TIME"

	// $ANTLR start "KW_ZONE"
	public final void mKW_ZONE() throws RecognitionException {
		try {
			int _type = KW_ZONE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:136:8: ( 'ZONE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:136:10: 'ZONE'
			{
			match("ZONE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ZONE"

	// $ANTLR start "KW_INTERVAL"
	public final void mKW_INTERVAL() throws RecognitionException {
		try {
			int _type = KW_INTERVAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:137:12: ( 'INTERVAL' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:137:14: 'INTERVAL'
			{
			match("INTERVAL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INTERVAL"

	// $ANTLR start "KW_DECIMAL"
	public final void mKW_DECIMAL() throws RecognitionException {
		try {
			int _type = KW_DECIMAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:138:11: ( 'DECIMAL' | 'DEC' | 'NUMERIC' )
			int alt3=3;
			int LA3_0 = input.LA(1);
			if ( (LA3_0=='D') ) {
				int LA3_1 = input.LA(2);
				if ( (LA3_1=='E') ) {
					int LA3_3 = input.LA(3);
					if ( (LA3_3=='C') ) {
						int LA3_4 = input.LA(4);
						if ( (LA3_4=='I') ) {
							alt3=1;
						}

						else {
							alt3=2;
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 3, 3, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 3, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA3_0=='N') ) {
				alt3=3;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 3, 0, input);
				throw nvae;
			}

			switch (alt3) {
				case 1 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:138:13: 'DECIMAL'
					{
					match("DECIMAL"); 

					}
					break;
				case 2 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:138:25: 'DEC'
					{
					match("DEC"); 

					}
					break;
				case 3 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:138:33: 'NUMERIC'
					{
					match("NUMERIC"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DECIMAL"

	// $ANTLR start "KW_STRING"
	public final void mKW_STRING() throws RecognitionException {
		try {
			int _type = KW_STRING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:139:10: ( 'STRING' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:139:12: 'STRING'
			{
			match("STRING"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_STRING"

	// $ANTLR start "KW_CHAR"
	public final void mKW_CHAR() throws RecognitionException {
		try {
			int _type = KW_CHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:140:8: ( 'CHAR' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:140:10: 'CHAR'
			{
			match("CHAR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CHAR"

	// $ANTLR start "KW_VARCHAR"
	public final void mKW_VARCHAR() throws RecognitionException {
		try {
			int _type = KW_VARCHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:141:11: ( 'VARCHAR' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:141:13: 'VARCHAR'
			{
			match("VARCHAR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_VARCHAR"

	// $ANTLR start "KW_ARRAY"
	public final void mKW_ARRAY() throws RecognitionException {
		try {
			int _type = KW_ARRAY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:142:9: ( 'ARRAY' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:142:11: 'ARRAY'
			{
			match("ARRAY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ARRAY"

	// $ANTLR start "KW_STRUCT"
	public final void mKW_STRUCT() throws RecognitionException {
		try {
			int _type = KW_STRUCT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:143:10: ( 'STRUCT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:143:12: 'STRUCT'
			{
			match("STRUCT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_STRUCT"

	// $ANTLR start "KW_MAP"
	public final void mKW_MAP() throws RecognitionException {
		try {
			int _type = KW_MAP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:144:7: ( 'MAP' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:144:9: 'MAP'
			{
			match("MAP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MAP"

	// $ANTLR start "KW_UNIONTYPE"
	public final void mKW_UNIONTYPE() throws RecognitionException {
		try {
			int _type = KW_UNIONTYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:145:13: ( 'UNIONTYPE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:145:15: 'UNIONTYPE'
			{
			match("UNIONTYPE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UNIONTYPE"

	// $ANTLR start "KW_REDUCE"
	public final void mKW_REDUCE() throws RecognitionException {
		try {
			int _type = KW_REDUCE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:146:10: ( 'REDUCE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:146:12: 'REDUCE'
			{
			match("REDUCE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_REDUCE"

	// $ANTLR start "KW_PARTITIONED"
	public final void mKW_PARTITIONED() throws RecognitionException {
		try {
			int _type = KW_PARTITIONED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:147:15: ( 'PARTITIONED' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:147:17: 'PARTITIONED'
			{
			match("PARTITIONED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PARTITIONED"

	// $ANTLR start "KW_CLUSTERED"
	public final void mKW_CLUSTERED() throws RecognitionException {
		try {
			int _type = KW_CLUSTERED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:148:13: ( 'CLUSTERED' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:148:15: 'CLUSTERED'
			{
			match("CLUSTERED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CLUSTERED"

	// $ANTLR start "KW_DISTRIBUTED"
	public final void mKW_DISTRIBUTED() throws RecognitionException {
		try {
			int _type = KW_DISTRIBUTED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:149:15: ( 'DISTRIBUTED' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:149:17: 'DISTRIBUTED'
			{
			match("DISTRIBUTED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DISTRIBUTED"

	// $ANTLR start "KW_SORTED"
	public final void mKW_SORTED() throws RecognitionException {
		try {
			int _type = KW_SORTED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:150:10: ( 'SORTED' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:150:12: 'SORTED'
			{
			match("SORTED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SORTED"

	// $ANTLR start "KW_INTO"
	public final void mKW_INTO() throws RecognitionException {
		try {
			int _type = KW_INTO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:151:8: ( 'INTO' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:151:10: 'INTO'
			{
			match("INTO"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INTO"

	// $ANTLR start "KW_BUCKETS"
	public final void mKW_BUCKETS() throws RecognitionException {
		try {
			int _type = KW_BUCKETS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:152:11: ( 'BUCKETS' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:152:13: 'BUCKETS'
			{
			match("BUCKETS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_BUCKETS"

	// $ANTLR start "KW_ROW"
	public final void mKW_ROW() throws RecognitionException {
		try {
			int _type = KW_ROW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:153:7: ( 'ROW' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:153:9: 'ROW'
			{
			match("ROW"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ROW"

	// $ANTLR start "KW_ROWS"
	public final void mKW_ROWS() throws RecognitionException {
		try {
			int _type = KW_ROWS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:154:8: ( 'ROWS' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:154:10: 'ROWS'
			{
			match("ROWS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ROWS"

	// $ANTLR start "KW_FORMAT"
	public final void mKW_FORMAT() throws RecognitionException {
		try {
			int _type = KW_FORMAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:155:10: ( 'FORMAT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:155:12: 'FORMAT'
			{
			match("FORMAT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FORMAT"

	// $ANTLR start "KW_DELIMITED"
	public final void mKW_DELIMITED() throws RecognitionException {
		try {
			int _type = KW_DELIMITED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:156:13: ( 'DELIMITED' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:156:15: 'DELIMITED'
			{
			match("DELIMITED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DELIMITED"

	// $ANTLR start "KW_FIELDS"
	public final void mKW_FIELDS() throws RecognitionException {
		try {
			int _type = KW_FIELDS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:157:10: ( 'FIELDS' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:157:12: 'FIELDS'
			{
			match("FIELDS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FIELDS"

	// $ANTLR start "KW_TERMINATED"
	public final void mKW_TERMINATED() throws RecognitionException {
		try {
			int _type = KW_TERMINATED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:158:14: ( 'TERMINATED' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:158:16: 'TERMINATED'
			{
			match("TERMINATED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TERMINATED"

	// $ANTLR start "KW_ESCAPED"
	public final void mKW_ESCAPED() throws RecognitionException {
		try {
			int _type = KW_ESCAPED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:159:11: ( 'ESCAPED' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:159:13: 'ESCAPED'
			{
			match("ESCAPED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ESCAPED"

	// $ANTLR start "KW_COLLECTION"
	public final void mKW_COLLECTION() throws RecognitionException {
		try {
			int _type = KW_COLLECTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:160:14: ( 'COLLECTION' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:160:16: 'COLLECTION'
			{
			match("COLLECTION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_COLLECTION"

	// $ANTLR start "KW_ITEMS"
	public final void mKW_ITEMS() throws RecognitionException {
		try {
			int _type = KW_ITEMS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:161:9: ( 'ITEMS' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:161:11: 'ITEMS'
			{
			match("ITEMS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ITEMS"

	// $ANTLR start "KW_KEYS"
	public final void mKW_KEYS() throws RecognitionException {
		try {
			int _type = KW_KEYS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:162:8: ( 'KEYS' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:162:10: 'KEYS'
			{
			match("KEYS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_KEYS"

	// $ANTLR start "KW_KEY_TYPE"
	public final void mKW_KEY_TYPE() throws RecognitionException {
		try {
			int _type = KW_KEY_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:163:12: ( '$KEY$' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:163:14: '$KEY$'
			{
			match("$KEY$"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_KEY_TYPE"

	// $ANTLR start "KW_KILL"
	public final void mKW_KILL() throws RecognitionException {
		try {
			int _type = KW_KILL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:164:8: ( 'KILL' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:164:10: 'KILL'
			{
			match("KILL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_KILL"

	// $ANTLR start "KW_LINES"
	public final void mKW_LINES() throws RecognitionException {
		try {
			int _type = KW_LINES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:165:9: ( 'LINES' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:165:11: 'LINES'
			{
			match("LINES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LINES"

	// $ANTLR start "KW_STORED"
	public final void mKW_STORED() throws RecognitionException {
		try {
			int _type = KW_STORED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:166:10: ( 'STORED' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:166:12: 'STORED'
			{
			match("STORED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_STORED"

	// $ANTLR start "KW_FILEFORMAT"
	public final void mKW_FILEFORMAT() throws RecognitionException {
		try {
			int _type = KW_FILEFORMAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:167:14: ( 'FILEFORMAT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:167:16: 'FILEFORMAT'
			{
			match("FILEFORMAT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FILEFORMAT"

	// $ANTLR start "KW_INPUTFORMAT"
	public final void mKW_INPUTFORMAT() throws RecognitionException {
		try {
			int _type = KW_INPUTFORMAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:168:15: ( 'INPUTFORMAT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:168:17: 'INPUTFORMAT'
			{
			match("INPUTFORMAT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INPUTFORMAT"

	// $ANTLR start "KW_OUTPUTFORMAT"
	public final void mKW_OUTPUTFORMAT() throws RecognitionException {
		try {
			int _type = KW_OUTPUTFORMAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:169:16: ( 'OUTPUTFORMAT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:169:18: 'OUTPUTFORMAT'
			{
			match("OUTPUTFORMAT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OUTPUTFORMAT"

	// $ANTLR start "KW_INPUTDRIVER"
	public final void mKW_INPUTDRIVER() throws RecognitionException {
		try {
			int _type = KW_INPUTDRIVER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:170:15: ( 'INPUTDRIVER' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:170:17: 'INPUTDRIVER'
			{
			match("INPUTDRIVER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INPUTDRIVER"

	// $ANTLR start "KW_OUTPUTDRIVER"
	public final void mKW_OUTPUTDRIVER() throws RecognitionException {
		try {
			int _type = KW_OUTPUTDRIVER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:171:16: ( 'OUTPUTDRIVER' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:171:18: 'OUTPUTDRIVER'
			{
			match("OUTPUTDRIVER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OUTPUTDRIVER"

	// $ANTLR start "KW_ENABLE"
	public final void mKW_ENABLE() throws RecognitionException {
		try {
			int _type = KW_ENABLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:172:10: ( 'ENABLE' | 'ENABLED' )
			int alt4=2;
			int LA4_0 = input.LA(1);
			if ( (LA4_0=='E') ) {
				int LA4_1 = input.LA(2);
				if ( (LA4_1=='N') ) {
					int LA4_2 = input.LA(3);
					if ( (LA4_2=='A') ) {
						int LA4_3 = input.LA(4);
						if ( (LA4_3=='B') ) {
							int LA4_4 = input.LA(5);
							if ( (LA4_4=='L') ) {
								int LA4_5 = input.LA(6);
								if ( (LA4_5=='E') ) {
									int LA4_6 = input.LA(7);
									if ( (LA4_6=='D') ) {
										alt4=2;
									}

									else {
										alt4=1;
									}

								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 4, 5, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 4, 4, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 4, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 4, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 4, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 4, 0, input);
				throw nvae;
			}

			switch (alt4) {
				case 1 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:172:12: 'ENABLE'
					{
					match("ENABLE"); 

					}
					break;
				case 2 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:172:23: 'ENABLED'
					{
					match("ENABLED"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ENABLE"

	// $ANTLR start "KW_DISABLE"
	public final void mKW_DISABLE() throws RecognitionException {
		try {
			int _type = KW_DISABLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:173:11: ( 'DISABLE' | 'DISABLED' )
			int alt5=2;
			int LA5_0 = input.LA(1);
			if ( (LA5_0=='D') ) {
				int LA5_1 = input.LA(2);
				if ( (LA5_1=='I') ) {
					int LA5_2 = input.LA(3);
					if ( (LA5_2=='S') ) {
						int LA5_3 = input.LA(4);
						if ( (LA5_3=='A') ) {
							int LA5_4 = input.LA(5);
							if ( (LA5_4=='B') ) {
								int LA5_5 = input.LA(6);
								if ( (LA5_5=='L') ) {
									int LA5_6 = input.LA(7);
									if ( (LA5_6=='E') ) {
										int LA5_7 = input.LA(8);
										if ( (LA5_7=='D') ) {
											alt5=2;
										}

										else {
											alt5=1;
										}

									}

									else {
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 7 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 5, 6, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 5, 5, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 5, 4, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 5, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 5, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 5, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 5, 0, input);
				throw nvae;
			}

			switch (alt5) {
				case 1 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:173:13: 'DISABLE'
					{
					match("DISABLE"); 

					}
					break;
				case 2 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:173:25: 'DISABLED'
					{
					match("DISABLED"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DISABLE"

	// $ANTLR start "KW_EXECUTED"
	public final void mKW_EXECUTED() throws RecognitionException {
		try {
			int _type = KW_EXECUTED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:174:12: ( 'EXECUTED' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:174:14: 'EXECUTED'
			{
			match("EXECUTED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_EXECUTED"

	// $ANTLR start "KW_EXECUTE"
	public final void mKW_EXECUTE() throws RecognitionException {
		try {
			int _type = KW_EXECUTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:175:11: ( 'EXECUTE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:175:13: 'EXECUTE'
			{
			match("EXECUTE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_EXECUTE"

	// $ANTLR start "KW_LOCATION"
	public final void mKW_LOCATION() throws RecognitionException {
		try {
			int _type = KW_LOCATION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:176:12: ( 'LOCATION' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:176:14: 'LOCATION'
			{
			match("LOCATION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LOCATION"

	// $ANTLR start "KW_MANAGEDLOCATION"
	public final void mKW_MANAGEDLOCATION() throws RecognitionException {
		try {
			int _type = KW_MANAGEDLOCATION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:177:19: ( 'MANAGEDLOCATION' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:177:21: 'MANAGEDLOCATION'
			{
			match("MANAGEDLOCATION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MANAGEDLOCATION"

	// $ANTLR start "KW_TABLESAMPLE"
	public final void mKW_TABLESAMPLE() throws RecognitionException {
		try {
			int _type = KW_TABLESAMPLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:178:15: ( 'TABLESAMPLE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:178:17: 'TABLESAMPLE'
			{
			match("TABLESAMPLE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TABLESAMPLE"

	// $ANTLR start "KW_BUCKET"
	public final void mKW_BUCKET() throws RecognitionException {
		try {
			int _type = KW_BUCKET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:179:10: ( 'BUCKET' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:179:12: 'BUCKET'
			{
			match("BUCKET"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_BUCKET"

	// $ANTLR start "KW_OUT"
	public final void mKW_OUT() throws RecognitionException {
		try {
			int _type = KW_OUT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:180:7: ( 'OUT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:180:9: 'OUT'
			{
			match("OUT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OUT"

	// $ANTLR start "KW_OF"
	public final void mKW_OF() throws RecognitionException {
		try {
			int _type = KW_OF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:181:6: ( 'OF' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:181:8: 'OF'
			{
			match("OF"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OF"

	// $ANTLR start "KW_PERCENT"
	public final void mKW_PERCENT() throws RecognitionException {
		try {
			int _type = KW_PERCENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:182:11: ( 'PERCENT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:182:13: 'PERCENT'
			{
			match("PERCENT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PERCENT"

	// $ANTLR start "KW_CAST"
	public final void mKW_CAST() throws RecognitionException {
		try {
			int _type = KW_CAST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:183:8: ( 'CAST' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:183:10: 'CAST'
			{
			match("CAST"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CAST"

	// $ANTLR start "KW_ADD"
	public final void mKW_ADD() throws RecognitionException {
		try {
			int _type = KW_ADD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:184:7: ( 'ADD' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:184:9: 'ADD'
			{
			match("ADD"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ADD"

	// $ANTLR start "KW_REPLACE"
	public final void mKW_REPLACE() throws RecognitionException {
		try {
			int _type = KW_REPLACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:185:11: ( 'REPLACE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:185:13: 'REPLACE'
			{
			match("REPLACE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_REPLACE"

	// $ANTLR start "KW_RLIKE"
	public final void mKW_RLIKE() throws RecognitionException {
		try {
			int _type = KW_RLIKE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:186:9: ( 'RLIKE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:186:11: 'RLIKE'
			{
			match("RLIKE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_RLIKE"

	// $ANTLR start "KW_REGEXP"
	public final void mKW_REGEXP() throws RecognitionException {
		try {
			int _type = KW_REGEXP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:187:10: ( 'REGEXP' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:187:12: 'REGEXP'
			{
			match("REGEXP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_REGEXP"

	// $ANTLR start "KW_TEMPORARY"
	public final void mKW_TEMPORARY() throws RecognitionException {
		try {
			int _type = KW_TEMPORARY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:188:13: ( 'TEMPORARY' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:188:15: 'TEMPORARY'
			{
			match("TEMPORARY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TEMPORARY"

	// $ANTLR start "KW_FUNCTION"
	public final void mKW_FUNCTION() throws RecognitionException {
		try {
			int _type = KW_FUNCTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:189:12: ( 'FUNCTION' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:189:14: 'FUNCTION'
			{
			match("FUNCTION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FUNCTION"

	// $ANTLR start "KW_MACRO"
	public final void mKW_MACRO() throws RecognitionException {
		try {
			int _type = KW_MACRO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:190:9: ( 'MACRO' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:190:11: 'MACRO'
			{
			match("MACRO"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MACRO"

	// $ANTLR start "KW_FILE"
	public final void mKW_FILE() throws RecognitionException {
		try {
			int _type = KW_FILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:191:8: ( 'FILE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:191:10: 'FILE'
			{
			match("FILE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FILE"

	// $ANTLR start "KW_JAR"
	public final void mKW_JAR() throws RecognitionException {
		try {
			int _type = KW_JAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:192:7: ( 'JAR' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:192:9: 'JAR'
			{
			match("JAR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_JAR"

	// $ANTLR start "KW_EXPLAIN"
	public final void mKW_EXPLAIN() throws RecognitionException {
		try {
			int _type = KW_EXPLAIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:193:11: ( 'EXPLAIN' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:193:13: 'EXPLAIN'
			{
			match("EXPLAIN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_EXPLAIN"

	// $ANTLR start "KW_EXTENDED"
	public final void mKW_EXTENDED() throws RecognitionException {
		try {
			int _type = KW_EXTENDED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:194:12: ( 'EXTENDED' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:194:14: 'EXTENDED'
			{
			match("EXTENDED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_EXTENDED"

	// $ANTLR start "KW_DEBUG"
	public final void mKW_DEBUG() throws RecognitionException {
		try {
			int _type = KW_DEBUG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:195:9: ( 'DEBUG' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:195:11: 'DEBUG'
			{
			match("DEBUG"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DEBUG"

	// $ANTLR start "KW_FORMATTED"
	public final void mKW_FORMATTED() throws RecognitionException {
		try {
			int _type = KW_FORMATTED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:196:13: ( 'FORMATTED' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:196:15: 'FORMATTED'
			{
			match("FORMATTED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FORMATTED"

	// $ANTLR start "KW_DEPENDENCY"
	public final void mKW_DEPENDENCY() throws RecognitionException {
		try {
			int _type = KW_DEPENDENCY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:197:14: ( 'DEPENDENCY' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:197:16: 'DEPENDENCY'
			{
			match("DEPENDENCY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DEPENDENCY"

	// $ANTLR start "KW_LOGICAL"
	public final void mKW_LOGICAL() throws RecognitionException {
		try {
			int _type = KW_LOGICAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:198:11: ( 'LOGICAL' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:198:13: 'LOGICAL'
			{
			match("LOGICAL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LOGICAL"

	// $ANTLR start "KW_CBO"
	public final void mKW_CBO() throws RecognitionException {
		try {
			int _type = KW_CBO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:199:7: ( 'CBO' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:199:9: 'CBO'
			{
			match("CBO"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CBO"

	// $ANTLR start "KW_SERDE"
	public final void mKW_SERDE() throws RecognitionException {
		try {
			int _type = KW_SERDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:200:9: ( 'SERDE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:200:11: 'SERDE'
			{
			match("SERDE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SERDE"

	// $ANTLR start "KW_WITH"
	public final void mKW_WITH() throws RecognitionException {
		try {
			int _type = KW_WITH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:201:8: ( 'WITH' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:201:10: 'WITH'
			{
			match("WITH"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_WITH"

	// $ANTLR start "KW_DEFERRED"
	public final void mKW_DEFERRED() throws RecognitionException {
		try {
			int _type = KW_DEFERRED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:202:12: ( 'DEFERRED' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:202:14: 'DEFERRED'
			{
			match("DEFERRED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DEFERRED"

	// $ANTLR start "KW_SERDEPROPERTIES"
	public final void mKW_SERDEPROPERTIES() throws RecognitionException {
		try {
			int _type = KW_SERDEPROPERTIES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:203:19: ( 'SERDEPROPERTIES' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:203:21: 'SERDEPROPERTIES'
			{
			match("SERDEPROPERTIES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SERDEPROPERTIES"

	// $ANTLR start "KW_DBPROPERTIES"
	public final void mKW_DBPROPERTIES() throws RecognitionException {
		try {
			int _type = KW_DBPROPERTIES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:204:16: ( 'DBPROPERTIES' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:204:18: 'DBPROPERTIES'
			{
			match("DBPROPERTIES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DBPROPERTIES"

	// $ANTLR start "KW_LIMIT"
	public final void mKW_LIMIT() throws RecognitionException {
		try {
			int _type = KW_LIMIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:205:9: ( 'LIMIT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:205:11: 'LIMIT'
			{
			match("LIMIT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LIMIT"

	// $ANTLR start "KW_OFFSET"
	public final void mKW_OFFSET() throws RecognitionException {
		try {
			int _type = KW_OFFSET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:206:10: ( 'OFFSET' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:206:12: 'OFFSET'
			{
			match("OFFSET"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OFFSET"

	// $ANTLR start "KW_SET"
	public final void mKW_SET() throws RecognitionException {
		try {
			int _type = KW_SET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:207:7: ( 'SET' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:207:9: 'SET'
			{
			match("SET"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SET"

	// $ANTLR start "KW_UNSET"
	public final void mKW_UNSET() throws RecognitionException {
		try {
			int _type = KW_UNSET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:208:9: ( 'UNSET' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:208:11: 'UNSET'
			{
			match("UNSET"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UNSET"

	// $ANTLR start "KW_TBLPROPERTIES"
	public final void mKW_TBLPROPERTIES() throws RecognitionException {
		try {
			int _type = KW_TBLPROPERTIES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:209:17: ( 'TBLPROPERTIES' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:209:19: 'TBLPROPERTIES'
			{
			match("TBLPROPERTIES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TBLPROPERTIES"

	// $ANTLR start "KW_IDXPROPERTIES"
	public final void mKW_IDXPROPERTIES() throws RecognitionException {
		try {
			int _type = KW_IDXPROPERTIES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:210:17: ( 'IDXPROPERTIES' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:210:19: 'IDXPROPERTIES'
			{
			match("IDXPROPERTIES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_IDXPROPERTIES"

	// $ANTLR start "KW_VALUE_TYPE"
	public final void mKW_VALUE_TYPE() throws RecognitionException {
		try {
			int _type = KW_VALUE_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:211:14: ( '$VALUE$' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:211:16: '$VALUE$'
			{
			match("$VALUE$"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_VALUE_TYPE"

	// $ANTLR start "KW_ELEM_TYPE"
	public final void mKW_ELEM_TYPE() throws RecognitionException {
		try {
			int _type = KW_ELEM_TYPE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:212:13: ( '$ELEM$' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:212:15: '$ELEM$'
			{
			match("$ELEM$"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ELEM_TYPE"

	// $ANTLR start "KW_DEFINED"
	public final void mKW_DEFINED() throws RecognitionException {
		try {
			int _type = KW_DEFINED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:213:11: ( 'DEFINED' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:213:13: 'DEFINED'
			{
			match("DEFINED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DEFINED"

	// $ANTLR start "KW_CASE"
	public final void mKW_CASE() throws RecognitionException {
		try {
			int _type = KW_CASE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:214:8: ( 'CASE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:214:10: 'CASE'
			{
			match("CASE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CASE"

	// $ANTLR start "KW_WHEN"
	public final void mKW_WHEN() throws RecognitionException {
		try {
			int _type = KW_WHEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:215:8: ( 'WHEN' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:215:10: 'WHEN'
			{
			match("WHEN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_WHEN"

	// $ANTLR start "KW_THEN"
	public final void mKW_THEN() throws RecognitionException {
		try {
			int _type = KW_THEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:216:8: ( 'THEN' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:216:10: 'THEN'
			{
			match("THEN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_THEN"

	// $ANTLR start "KW_ELSE"
	public final void mKW_ELSE() throws RecognitionException {
		try {
			int _type = KW_ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:217:8: ( 'ELSE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:217:10: 'ELSE'
			{
			match("ELSE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ELSE"

	// $ANTLR start "KW_END"
	public final void mKW_END() throws RecognitionException {
		try {
			int _type = KW_END;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:218:7: ( 'END' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:218:9: 'END'
			{
			match("END"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_END"

	// $ANTLR start "KW_MAPJOIN"
	public final void mKW_MAPJOIN() throws RecognitionException {
		try {
			int _type = KW_MAPJOIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:219:11: ( 'MAPJOIN' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:219:13: 'MAPJOIN'
			{
			match("MAPJOIN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MAPJOIN"

	// $ANTLR start "KW_STREAMTABLE"
	public final void mKW_STREAMTABLE() throws RecognitionException {
		try {
			int _type = KW_STREAMTABLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:220:15: ( 'STREAMTABLE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:220:17: 'STREAMTABLE'
			{
			match("STREAMTABLE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_STREAMTABLE"

	// $ANTLR start "KW_CLUSTERSTATUS"
	public final void mKW_CLUSTERSTATUS() throws RecognitionException {
		try {
			int _type = KW_CLUSTERSTATUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:221:17: ( 'CLUSTERSTATUS' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:221:19: 'CLUSTERSTATUS'
			{
			match("CLUSTERSTATUS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CLUSTERSTATUS"

	// $ANTLR start "KW_UTC"
	public final void mKW_UTC() throws RecognitionException {
		try {
			int _type = KW_UTC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:222:7: ( 'UTC' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:222:9: 'UTC'
			{
			match("UTC"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UTC"

	// $ANTLR start "KW_UTCTIMESTAMP"
	public final void mKW_UTCTIMESTAMP() throws RecognitionException {
		try {
			int _type = KW_UTCTIMESTAMP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:223:16: ( 'UTC_TMESTAMP' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:223:18: 'UTC_TMESTAMP'
			{
			match("UTC_TMESTAMP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UTCTIMESTAMP"

	// $ANTLR start "KW_LONG"
	public final void mKW_LONG() throws RecognitionException {
		try {
			int _type = KW_LONG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:224:8: ( 'LONG' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:224:10: 'LONG'
			{
			match("LONG"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LONG"

	// $ANTLR start "KW_DELETE"
	public final void mKW_DELETE() throws RecognitionException {
		try {
			int _type = KW_DELETE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:225:10: ( 'DELETE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:225:12: 'DELETE'
			{
			match("DELETE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DELETE"

	// $ANTLR start "KW_PLUS"
	public final void mKW_PLUS() throws RecognitionException {
		try {
			int _type = KW_PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:226:8: ( 'PLUS' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:226:10: 'PLUS'
			{
			match("PLUS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PLUS"

	// $ANTLR start "KW_MINUS"
	public final void mKW_MINUS() throws RecognitionException {
		try {
			int _type = KW_MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:227:9: ( 'MINUS' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:227:11: 'MINUS'
			{
			match("MINUS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MINUS"

	// $ANTLR start "KW_FETCH"
	public final void mKW_FETCH() throws RecognitionException {
		try {
			int _type = KW_FETCH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:228:9: ( 'FETCH' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:228:11: 'FETCH'
			{
			match("FETCH"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FETCH"

	// $ANTLR start "KW_INTERSECT"
	public final void mKW_INTERSECT() throws RecognitionException {
		try {
			int _type = KW_INTERSECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:229:13: ( 'INTERSECT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:229:15: 'INTERSECT'
			{
			match("INTERSECT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INTERSECT"

	// $ANTLR start "KW_VIEW"
	public final void mKW_VIEW() throws RecognitionException {
		try {
			int _type = KW_VIEW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:230:8: ( 'VIEW' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:230:10: 'VIEW'
			{
			match("VIEW"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_VIEW"

	// $ANTLR start "KW_VIEWS"
	public final void mKW_VIEWS() throws RecognitionException {
		try {
			int _type = KW_VIEWS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:231:9: ( 'VIEWS' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:231:11: 'VIEWS'
			{
			match("VIEWS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_VIEWS"

	// $ANTLR start "KW_IN"
	public final void mKW_IN() throws RecognitionException {
		try {
			int _type = KW_IN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:232:6: ( 'IN' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:232:8: 'IN'
			{
			match("IN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_IN"

	// $ANTLR start "KW_DATABASE"
	public final void mKW_DATABASE() throws RecognitionException {
		try {
			int _type = KW_DATABASE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:233:12: ( 'DATABASE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:233:14: 'DATABASE'
			{
			match("DATABASE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DATABASE"

	// $ANTLR start "KW_DATABASES"
	public final void mKW_DATABASES() throws RecognitionException {
		try {
			int _type = KW_DATABASES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:234:13: ( 'DATABASES' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:234:15: 'DATABASES'
			{
			match("DATABASES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DATABASES"

	// $ANTLR start "KW_MATERIALIZED"
	public final void mKW_MATERIALIZED() throws RecognitionException {
		try {
			int _type = KW_MATERIALIZED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:235:16: ( 'MATERIALIZED' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:235:18: 'MATERIALIZED'
			{
			match("MATERIALIZED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MATERIALIZED"

	// $ANTLR start "KW_SCHEMA"
	public final void mKW_SCHEMA() throws RecognitionException {
		try {
			int _type = KW_SCHEMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:236:10: ( 'SCHEMA' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:236:12: 'SCHEMA'
			{
			match("SCHEMA"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SCHEMA"

	// $ANTLR start "KW_SCHEMAS"
	public final void mKW_SCHEMAS() throws RecognitionException {
		try {
			int _type = KW_SCHEMAS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:237:11: ( 'SCHEMAS' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:237:13: 'SCHEMAS'
			{
			match("SCHEMAS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SCHEMAS"

	// $ANTLR start "KW_GRANT"
	public final void mKW_GRANT() throws RecognitionException {
		try {
			int _type = KW_GRANT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:238:9: ( 'GRANT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:238:11: 'GRANT'
			{
			match("GRANT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_GRANT"

	// $ANTLR start "KW_REVOKE"
	public final void mKW_REVOKE() throws RecognitionException {
		try {
			int _type = KW_REVOKE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:239:10: ( 'REVOKE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:239:12: 'REVOKE'
			{
			match("REVOKE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_REVOKE"

	// $ANTLR start "KW_SSL"
	public final void mKW_SSL() throws RecognitionException {
		try {
			int _type = KW_SSL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:240:7: ( 'SSL' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:240:9: 'SSL'
			{
			match("SSL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SSL"

	// $ANTLR start "KW_UNDO"
	public final void mKW_UNDO() throws RecognitionException {
		try {
			int _type = KW_UNDO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:241:8: ( 'UNDO' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:241:10: 'UNDO'
			{
			match("UNDO"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UNDO"

	// $ANTLR start "KW_LOCK"
	public final void mKW_LOCK() throws RecognitionException {
		try {
			int _type = KW_LOCK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:242:8: ( 'LOCK' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:242:10: 'LOCK'
			{
			match("LOCK"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LOCK"

	// $ANTLR start "KW_LOCKS"
	public final void mKW_LOCKS() throws RecognitionException {
		try {
			int _type = KW_LOCKS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:243:9: ( 'LOCKS' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:243:11: 'LOCKS'
			{
			match("LOCKS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LOCKS"

	// $ANTLR start "KW_UNLOCK"
	public final void mKW_UNLOCK() throws RecognitionException {
		try {
			int _type = KW_UNLOCK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:244:10: ( 'UNLOCK' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:244:12: 'UNLOCK'
			{
			match("UNLOCK"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UNLOCK"

	// $ANTLR start "KW_SHARED"
	public final void mKW_SHARED() throws RecognitionException {
		try {
			int _type = KW_SHARED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:245:10: ( 'SHARED' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:245:12: 'SHARED'
			{
			match("SHARED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SHARED"

	// $ANTLR start "KW_EXCLUSIVE"
	public final void mKW_EXCLUSIVE() throws RecognitionException {
		try {
			int _type = KW_EXCLUSIVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:246:13: ( 'EXCLUSIVE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:246:15: 'EXCLUSIVE'
			{
			match("EXCLUSIVE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_EXCLUSIVE"

	// $ANTLR start "KW_PROCEDURE"
	public final void mKW_PROCEDURE() throws RecognitionException {
		try {
			int _type = KW_PROCEDURE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:247:13: ( 'PROCEDURE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:247:15: 'PROCEDURE'
			{
			match("PROCEDURE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PROCEDURE"

	// $ANTLR start "KW_UNSIGNED"
	public final void mKW_UNSIGNED() throws RecognitionException {
		try {
			int _type = KW_UNSIGNED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:248:12: ( 'UNSIGNED' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:248:14: 'UNSIGNED'
			{
			match("UNSIGNED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UNSIGNED"

	// $ANTLR start "KW_WHILE"
	public final void mKW_WHILE() throws RecognitionException {
		try {
			int _type = KW_WHILE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:249:9: ( 'WHILE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:249:11: 'WHILE'
			{
			match("WHILE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_WHILE"

	// $ANTLR start "KW_READ"
	public final void mKW_READ() throws RecognitionException {
		try {
			int _type = KW_READ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:250:8: ( 'READ' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:250:10: 'READ'
			{
			match("READ"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_READ"

	// $ANTLR start "KW_READS"
	public final void mKW_READS() throws RecognitionException {
		try {
			int _type = KW_READS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:251:9: ( 'READS' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:251:11: 'READS'
			{
			match("READS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_READS"

	// $ANTLR start "KW_PURGE"
	public final void mKW_PURGE() throws RecognitionException {
		try {
			int _type = KW_PURGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:252:9: ( 'PURGE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:252:11: 'PURGE'
			{
			match("PURGE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PURGE"

	// $ANTLR start "KW_RANGE"
	public final void mKW_RANGE() throws RecognitionException {
		try {
			int _type = KW_RANGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:253:9: ( 'RANGE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:253:11: 'RANGE'
			{
			match("RANGE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_RANGE"

	// $ANTLR start "KW_ANALYZE"
	public final void mKW_ANALYZE() throws RecognitionException {
		try {
			int _type = KW_ANALYZE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:254:11: ( 'ANALYZE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:254:13: 'ANALYZE'
			{
			match("ANALYZE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ANALYZE"

	// $ANTLR start "KW_BEFORE"
	public final void mKW_BEFORE() throws RecognitionException {
		try {
			int _type = KW_BEFORE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:255:10: ( 'BEFORE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:255:12: 'BEFORE'
			{
			match("BEFORE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_BEFORE"

	// $ANTLR start "KW_BETWEEN"
	public final void mKW_BETWEEN() throws RecognitionException {
		try {
			int _type = KW_BETWEEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:256:11: ( 'BETWEEN' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:256:13: 'BETWEEN'
			{
			match("BETWEEN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_BETWEEN"

	// $ANTLR start "KW_BOTH"
	public final void mKW_BOTH() throws RecognitionException {
		try {
			int _type = KW_BOTH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:257:8: ( 'BOTH' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:257:10: 'BOTH'
			{
			match("BOTH"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_BOTH"

	// $ANTLR start "KW_BINARY"
	public final void mKW_BINARY() throws RecognitionException {
		try {
			int _type = KW_BINARY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:258:10: ( 'BINARY' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:258:12: 'BINARY'
			{
			match("BINARY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_BINARY"

	// $ANTLR start "KW_CROSS"
	public final void mKW_CROSS() throws RecognitionException {
		try {
			int _type = KW_CROSS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:259:9: ( 'CROSS' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:259:11: 'CROSS'
			{
			match("CROSS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CROSS"

	// $ANTLR start "KW_CONTINUE"
	public final void mKW_CONTINUE() throws RecognitionException {
		try {
			int _type = KW_CONTINUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:260:12: ( 'CONTINUE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:260:14: 'CONTINUE'
			{
			match("CONTINUE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CONTINUE"

	// $ANTLR start "KW_CURSOR"
	public final void mKW_CURSOR() throws RecognitionException {
		try {
			int _type = KW_CURSOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:261:10: ( 'CURSOR' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:261:12: 'CURSOR'
			{
			match("CURSOR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CURSOR"

	// $ANTLR start "KW_TRIGGER"
	public final void mKW_TRIGGER() throws RecognitionException {
		try {
			int _type = KW_TRIGGER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:262:11: ( 'TRIGGER' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:262:13: 'TRIGGER'
			{
			match("TRIGGER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TRIGGER"

	// $ANTLR start "KW_RECORDREADER"
	public final void mKW_RECORDREADER() throws RecognitionException {
		try {
			int _type = KW_RECORDREADER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:263:16: ( 'RECORDREADER' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:263:18: 'RECORDREADER'
			{
			match("RECORDREADER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_RECORDREADER"

	// $ANTLR start "KW_RECORDWRITER"
	public final void mKW_RECORDWRITER() throws RecognitionException {
		try {
			int _type = KW_RECORDWRITER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:264:16: ( 'RECORDWRITER' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:264:18: 'RECORDWRITER'
			{
			match("RECORDWRITER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_RECORDWRITER"

	// $ANTLR start "KW_SEMI"
	public final void mKW_SEMI() throws RecognitionException {
		try {
			int _type = KW_SEMI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:265:8: ( 'SEMI' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:265:10: 'SEMI'
			{
			match("SEMI"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SEMI"

	// $ANTLR start "KW_LATERAL"
	public final void mKW_LATERAL() throws RecognitionException {
		try {
			int _type = KW_LATERAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:266:11: ( 'LATERAL' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:266:13: 'LATERAL'
			{
			match("LATERAL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LATERAL"

	// $ANTLR start "KW_TOUCH"
	public final void mKW_TOUCH() throws RecognitionException {
		try {
			int _type = KW_TOUCH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:267:9: ( 'TOUCH' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:267:11: 'TOUCH'
			{
			match("TOUCH"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TOUCH"

	// $ANTLR start "KW_ARCHIVE"
	public final void mKW_ARCHIVE() throws RecognitionException {
		try {
			int _type = KW_ARCHIVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:268:11: ( 'ARCHIVE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:268:13: 'ARCHIVE'
			{
			match("ARCHIVE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ARCHIVE"

	// $ANTLR start "KW_UNARCHIVE"
	public final void mKW_UNARCHIVE() throws RecognitionException {
		try {
			int _type = KW_UNARCHIVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:269:13: ( 'UNARCHIVE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:269:15: 'UNARCHIVE'
			{
			match("UNARCHIVE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UNARCHIVE"

	// $ANTLR start "KW_COMPUTE"
	public final void mKW_COMPUTE() throws RecognitionException {
		try {
			int _type = KW_COMPUTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:270:11: ( 'COMPUTE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:270:13: 'COMPUTE'
			{
			match("COMPUTE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_COMPUTE"

	// $ANTLR start "KW_STATISTICS"
	public final void mKW_STATISTICS() throws RecognitionException {
		try {
			int _type = KW_STATISTICS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:271:14: ( 'STATISTICS' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:271:16: 'STATISTICS'
			{
			match("STATISTICS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_STATISTICS"

	// $ANTLR start "KW_USE"
	public final void mKW_USE() throws RecognitionException {
		try {
			int _type = KW_USE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:272:7: ( 'USE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:272:9: 'USE'
			{
			match("USE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_USE"

	// $ANTLR start "KW_OPTION"
	public final void mKW_OPTION() throws RecognitionException {
		try {
			int _type = KW_OPTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:273:10: ( 'OPTION' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:273:12: 'OPTION'
			{
			match("OPTION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OPTION"

	// $ANTLR start "KW_CONCATENATE"
	public final void mKW_CONCATENATE() throws RecognitionException {
		try {
			int _type = KW_CONCATENATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:274:15: ( 'CONCATENATE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:274:17: 'CONCATENATE'
			{
			match("CONCATENATE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CONCATENATE"

	// $ANTLR start "KW_SHOW_DATABASE"
	public final void mKW_SHOW_DATABASE() throws RecognitionException {
		try {
			int _type = KW_SHOW_DATABASE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:275:17: ( 'SHOW_DATABASE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:275:19: 'SHOW_DATABASE'
			{
			match("SHOW_DATABASE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SHOW_DATABASE"

	// $ANTLR start "KW_UPDATE"
	public final void mKW_UPDATE() throws RecognitionException {
		try {
			int _type = KW_UPDATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:276:10: ( 'UPDATE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:276:12: 'UPDATE'
			{
			match("UPDATE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UPDATE"

	// $ANTLR start "KW_RESTRICT"
	public final void mKW_RESTRICT() throws RecognitionException {
		try {
			int _type = KW_RESTRICT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:277:12: ( 'RESTRICT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:277:14: 'RESTRICT'
			{
			match("RESTRICT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_RESTRICT"

	// $ANTLR start "KW_CASCADE"
	public final void mKW_CASCADE() throws RecognitionException {
		try {
			int _type = KW_CASCADE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:278:11: ( 'CASCADE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:278:13: 'CASCADE'
			{
			match("CASCADE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CASCADE"

	// $ANTLR start "KW_SKEWED"
	public final void mKW_SKEWED() throws RecognitionException {
		try {
			int _type = KW_SKEWED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:279:10: ( 'SKEWED' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:279:12: 'SKEWED'
			{
			match("SKEWED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SKEWED"

	// $ANTLR start "KW_ROLLUP"
	public final void mKW_ROLLUP() throws RecognitionException {
		try {
			int _type = KW_ROLLUP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:280:10: ( 'ROLLUP' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:280:12: 'ROLLUP'
			{
			match("ROLLUP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ROLLUP"

	// $ANTLR start "KW_CUBE"
	public final void mKW_CUBE() throws RecognitionException {
		try {
			int _type = KW_CUBE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:281:8: ( 'CUBE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:281:10: 'CUBE'
			{
			match("CUBE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CUBE"

	// $ANTLR start "KW_DIRECTORIES"
	public final void mKW_DIRECTORIES() throws RecognitionException {
		try {
			int _type = KW_DIRECTORIES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:282:15: ( 'DIRECTORIES' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:282:17: 'DIRECTORIES'
			{
			match("DIRECTORIES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DIRECTORIES"

	// $ANTLR start "KW_FOR"
	public final void mKW_FOR() throws RecognitionException {
		try {
			int _type = KW_FOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:283:7: ( 'FOR' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:283:9: 'FOR'
			{
			match("FOR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FOR"

	// $ANTLR start "KW_WINDOW"
	public final void mKW_WINDOW() throws RecognitionException {
		try {
			int _type = KW_WINDOW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:284:10: ( 'WINDOW' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:284:12: 'WINDOW'
			{
			match("WINDOW"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_WINDOW"

	// $ANTLR start "KW_UNBOUNDED"
	public final void mKW_UNBOUNDED() throws RecognitionException {
		try {
			int _type = KW_UNBOUNDED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:285:13: ( 'UNBOUNDED' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:285:15: 'UNBOUNDED'
			{
			match("UNBOUNDED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UNBOUNDED"

	// $ANTLR start "KW_PRECEDING"
	public final void mKW_PRECEDING() throws RecognitionException {
		try {
			int _type = KW_PRECEDING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:286:13: ( 'PRECEDING' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:286:15: 'PRECEDING'
			{
			match("PRECEDING"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PRECEDING"

	// $ANTLR start "KW_FOLLOWING"
	public final void mKW_FOLLOWING() throws RecognitionException {
		try {
			int _type = KW_FOLLOWING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:287:13: ( 'FOLLOWING' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:287:15: 'FOLLOWING'
			{
			match("FOLLOWING"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FOLLOWING"

	// $ANTLR start "KW_CURRENT"
	public final void mKW_CURRENT() throws RecognitionException {
		try {
			int _type = KW_CURRENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:288:11: ( 'CURRENT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:288:13: 'CURRENT'
			{
			match("CURRENT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CURRENT"

	// $ANTLR start "KW_CURRENT_DATE"
	public final void mKW_CURRENT_DATE() throws RecognitionException {
		try {
			int _type = KW_CURRENT_DATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:289:16: ( 'CURRENT_DATE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:289:18: 'CURRENT_DATE'
			{
			match("CURRENT_DATE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CURRENT_DATE"

	// $ANTLR start "KW_CURRENT_TIMESTAMP"
	public final void mKW_CURRENT_TIMESTAMP() throws RecognitionException {
		try {
			int _type = KW_CURRENT_TIMESTAMP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:290:21: ( 'CURRENT_TIMESTAMP' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:290:23: 'CURRENT_TIMESTAMP'
			{
			match("CURRENT_TIMESTAMP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CURRENT_TIMESTAMP"

	// $ANTLR start "KW_LESS"
	public final void mKW_LESS() throws RecognitionException {
		try {
			int _type = KW_LESS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:291:8: ( 'LESS' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:291:10: 'LESS'
			{
			match("LESS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LESS"

	// $ANTLR start "KW_MORE"
	public final void mKW_MORE() throws RecognitionException {
		try {
			int _type = KW_MORE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:292:8: ( 'MORE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:292:10: 'MORE'
			{
			match("MORE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MORE"

	// $ANTLR start "KW_OVER"
	public final void mKW_OVER() throws RecognitionException {
		try {
			int _type = KW_OVER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:293:8: ( 'OVER' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:293:10: 'OVER'
			{
			match("OVER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OVER"

	// $ANTLR start "KW_GROUPING"
	public final void mKW_GROUPING() throws RecognitionException {
		try {
			int _type = KW_GROUPING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:294:12: ( 'GROUPING' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:294:14: 'GROUPING'
			{
			match("GROUPING"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_GROUPING"

	// $ANTLR start "KW_SETS"
	public final void mKW_SETS() throws RecognitionException {
		try {
			int _type = KW_SETS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:295:8: ( 'SETS' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:295:10: 'SETS'
			{
			match("SETS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SETS"

	// $ANTLR start "KW_TRUNCATE"
	public final void mKW_TRUNCATE() throws RecognitionException {
		try {
			int _type = KW_TRUNCATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:296:12: ( 'TRUNCATE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:296:14: 'TRUNCATE'
			{
			match("TRUNCATE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TRUNCATE"

	// $ANTLR start "KW_NOSCAN"
	public final void mKW_NOSCAN() throws RecognitionException {
		try {
			int _type = KW_NOSCAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:297:10: ( 'NOSCAN' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:297:12: 'NOSCAN'
			{
			match("NOSCAN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_NOSCAN"

	// $ANTLR start "KW_USER"
	public final void mKW_USER() throws RecognitionException {
		try {
			int _type = KW_USER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:298:8: ( 'USER' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:298:10: 'USER'
			{
			match("USER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_USER"

	// $ANTLR start "KW_ROLE"
	public final void mKW_ROLE() throws RecognitionException {
		try {
			int _type = KW_ROLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:299:8: ( 'ROLE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:299:10: 'ROLE'
			{
			match("ROLE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ROLE"

	// $ANTLR start "KW_ROLES"
	public final void mKW_ROLES() throws RecognitionException {
		try {
			int _type = KW_ROLES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:300:9: ( 'ROLES' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:300:11: 'ROLES'
			{
			match("ROLES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ROLES"

	// $ANTLR start "KW_INNER"
	public final void mKW_INNER() throws RecognitionException {
		try {
			int _type = KW_INNER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:301:9: ( 'INNER' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:301:11: 'INNER'
			{
			match("INNER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_INNER"

	// $ANTLR start "KW_EXCHANGE"
	public final void mKW_EXCHANGE() throws RecognitionException {
		try {
			int _type = KW_EXCHANGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:302:12: ( 'EXCHANGE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:302:14: 'EXCHANGE'
			{
			match("EXCHANGE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_EXCHANGE"

	// $ANTLR start "KW_URI"
	public final void mKW_URI() throws RecognitionException {
		try {
			int _type = KW_URI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:303:7: ( 'URI' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:303:9: 'URI'
			{
			match("URI"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_URI"

	// $ANTLR start "KW_SERVER"
	public final void mKW_SERVER() throws RecognitionException {
		try {
			int _type = KW_SERVER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:304:11: ( 'SERVER' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:304:13: 'SERVER'
			{
			match("SERVER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SERVER"

	// $ANTLR start "KW_ADMIN"
	public final void mKW_ADMIN() throws RecognitionException {
		try {
			int _type = KW_ADMIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:305:9: ( 'ADMIN' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:305:11: 'ADMIN'
			{
			match("ADMIN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ADMIN"

	// $ANTLR start "KW_OWNER"
	public final void mKW_OWNER() throws RecognitionException {
		try {
			int _type = KW_OWNER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:306:9: ( 'OWNER' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:306:11: 'OWNER'
			{
			match("OWNER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OWNER"

	// $ANTLR start "KW_PRINCIPALS"
	public final void mKW_PRINCIPALS() throws RecognitionException {
		try {
			int _type = KW_PRINCIPALS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:307:14: ( 'PRINCIPALS' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:307:16: 'PRINCIPALS'
			{
			match("PRINCIPALS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PRINCIPALS"

	// $ANTLR start "KW_COMPACT"
	public final void mKW_COMPACT() throws RecognitionException {
		try {
			int _type = KW_COMPACT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:308:11: ( 'COMPACT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:308:13: 'COMPACT'
			{
			match("COMPACT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_COMPACT"

	// $ANTLR start "KW_COMPACTIONS"
	public final void mKW_COMPACTIONS() throws RecognitionException {
		try {
			int _type = KW_COMPACTIONS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:309:15: ( 'COMPACTIONS' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:309:17: 'COMPACTIONS'
			{
			match("COMPACTIONS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_COMPACTIONS"

	// $ANTLR start "KW_TRANSACTIONS"
	public final void mKW_TRANSACTIONS() throws RecognitionException {
		try {
			int _type = KW_TRANSACTIONS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:310:16: ( 'TRANSACTIONS' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:310:18: 'TRANSACTIONS'
			{
			match("TRANSACTIONS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TRANSACTIONS"

	// $ANTLR start "KW_TRANSACTIONAL"
	public final void mKW_TRANSACTIONAL() throws RecognitionException {
		try {
			int _type = KW_TRANSACTIONAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:311:17: ( 'TRANSACTIONAL' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:311:19: 'TRANSACTIONAL'
			{
			match("TRANSACTIONAL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TRANSACTIONAL"

	// $ANTLR start "KW_REWRITE"
	public final void mKW_REWRITE() throws RecognitionException {
		try {
			int _type = KW_REWRITE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:312:12: ( 'REWRITE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:312:14: 'REWRITE'
			{
			match("REWRITE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_REWRITE"

	// $ANTLR start "KW_AUTHORIZATION"
	public final void mKW_AUTHORIZATION() throws RecognitionException {
		try {
			int _type = KW_AUTHORIZATION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:313:17: ( 'AUTHORIZATION' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:313:19: 'AUTHORIZATION'
			{
			match("AUTHORIZATION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_AUTHORIZATION"

	// $ANTLR start "KW_REOPTIMIZATION"
	public final void mKW_REOPTIMIZATION() throws RecognitionException {
		try {
			int _type = KW_REOPTIMIZATION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:314:18: ( 'REOPTIMIZATION' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:314:20: 'REOPTIMIZATION'
			{
			match("REOPTIMIZATION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_REOPTIMIZATION"

	// $ANTLR start "KW_CONF"
	public final void mKW_CONF() throws RecognitionException {
		try {
			int _type = KW_CONF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:315:8: ( 'CONF' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:315:10: 'CONF'
			{
			match("CONF"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CONF"

	// $ANTLR start "KW_VALUES"
	public final void mKW_VALUES() throws RecognitionException {
		try {
			int _type = KW_VALUES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:316:10: ( 'VALUES' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:316:12: 'VALUES'
			{
			match("VALUES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_VALUES"

	// $ANTLR start "KW_RELOAD"
	public final void mKW_RELOAD() throws RecognitionException {
		try {
			int _type = KW_RELOAD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:317:10: ( 'RELOAD' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:317:12: 'RELOAD'
			{
			match("RELOAD"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_RELOAD"

	// $ANTLR start "KW_YEAR"
	public final void mKW_YEAR() throws RecognitionException {
		try {
			int _type = KW_YEAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:318:8: ( 'YEAR' | 'YEARS' )
			int alt6=2;
			int LA6_0 = input.LA(1);
			if ( (LA6_0=='Y') ) {
				int LA6_1 = input.LA(2);
				if ( (LA6_1=='E') ) {
					int LA6_2 = input.LA(3);
					if ( (LA6_2=='A') ) {
						int LA6_3 = input.LA(4);
						if ( (LA6_3=='R') ) {
							int LA6_4 = input.LA(5);
							if ( (LA6_4=='S') ) {
								alt6=2;
							}

							else {
								alt6=1;
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 6, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 6, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 6, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}

			switch (alt6) {
				case 1 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:318:10: 'YEAR'
					{
					match("YEAR"); 

					}
					break;
				case 2 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:318:19: 'YEARS'
					{
					match("YEARS"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_YEAR"

	// $ANTLR start "KW_QUERY"
	public final void mKW_QUERY() throws RecognitionException {
		try {
			int _type = KW_QUERY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:319:9: ( 'QUERY' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:319:11: 'QUERY'
			{
			match("QUERY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_QUERY"

	// $ANTLR start "KW_QUARTER"
	public final void mKW_QUARTER() throws RecognitionException {
		try {
			int _type = KW_QUARTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:320:11: ( 'QUARTER' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:320:13: 'QUARTER'
			{
			match("QUARTER"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_QUARTER"

	// $ANTLR start "KW_MONTH"
	public final void mKW_MONTH() throws RecognitionException {
		try {
			int _type = KW_MONTH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:321:9: ( 'MONTH' | 'MONTHS' )
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='M') ) {
				int LA7_1 = input.LA(2);
				if ( (LA7_1=='O') ) {
					int LA7_2 = input.LA(3);
					if ( (LA7_2=='N') ) {
						int LA7_3 = input.LA(4);
						if ( (LA7_3=='T') ) {
							int LA7_4 = input.LA(5);
							if ( (LA7_4=='H') ) {
								int LA7_5 = input.LA(6);
								if ( (LA7_5=='S') ) {
									alt7=2;
								}

								else {
									alt7=1;
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 7, 4, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 7, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 7, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 7, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 7, 0, input);
				throw nvae;
			}

			switch (alt7) {
				case 1 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:321:11: 'MONTH'
					{
					match("MONTH"); 

					}
					break;
				case 2 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:321:21: 'MONTHS'
					{
					match("MONTHS"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MONTH"

	// $ANTLR start "KW_WEEK"
	public final void mKW_WEEK() throws RecognitionException {
		try {
			int _type = KW_WEEK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:322:8: ( 'WEEK' | 'WEEKS' )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0=='W') ) {
				int LA8_1 = input.LA(2);
				if ( (LA8_1=='E') ) {
					int LA8_2 = input.LA(3);
					if ( (LA8_2=='E') ) {
						int LA8_3 = input.LA(4);
						if ( (LA8_3=='K') ) {
							int LA8_4 = input.LA(5);
							if ( (LA8_4=='S') ) {
								alt8=2;
							}

							else {
								alt8=1;
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 8, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 8, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 8, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:322:10: 'WEEK'
					{
					match("WEEK"); 

					}
					break;
				case 2 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:322:19: 'WEEKS'
					{
					match("WEEKS"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_WEEK"

	// $ANTLR start "KW_DAY"
	public final void mKW_DAY() throws RecognitionException {
		try {
			int _type = KW_DAY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:323:7: ( 'DAY' | 'DAYS' )
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0=='D') ) {
				int LA9_1 = input.LA(2);
				if ( (LA9_1=='A') ) {
					int LA9_2 = input.LA(3);
					if ( (LA9_2=='Y') ) {
						int LA9_3 = input.LA(4);
						if ( (LA9_3=='S') ) {
							alt9=2;
						}

						else {
							alt9=1;
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 9, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 9, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 9, 0, input);
				throw nvae;
			}

			switch (alt9) {
				case 1 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:323:9: 'DAY'
					{
					match("DAY"); 

					}
					break;
				case 2 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:323:17: 'DAYS'
					{
					match("DAYS"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DAY"

	// $ANTLR start "KW_DOW"
	public final void mKW_DOW() throws RecognitionException {
		try {
			int _type = KW_DOW;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:324:7: ( 'DAYOFWEEK' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:324:9: 'DAYOFWEEK'
			{
			match("DAYOFWEEK"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DOW"

	// $ANTLR start "KW_HOUR"
	public final void mKW_HOUR() throws RecognitionException {
		try {
			int _type = KW_HOUR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:325:8: ( 'HOUR' | 'HOURS' )
			int alt10=2;
			int LA10_0 = input.LA(1);
			if ( (LA10_0=='H') ) {
				int LA10_1 = input.LA(2);
				if ( (LA10_1=='O') ) {
					int LA10_2 = input.LA(3);
					if ( (LA10_2=='U') ) {
						int LA10_3 = input.LA(4);
						if ( (LA10_3=='R') ) {
							int LA10_4 = input.LA(5);
							if ( (LA10_4=='S') ) {
								alt10=2;
							}

							else {
								alt10=1;
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 10, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 10, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 10, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 10, 0, input);
				throw nvae;
			}

			switch (alt10) {
				case 1 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:325:10: 'HOUR'
					{
					match("HOUR"); 

					}
					break;
				case 2 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:325:19: 'HOURS'
					{
					match("HOURS"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_HOUR"

	// $ANTLR start "KW_MINUTE"
	public final void mKW_MINUTE() throws RecognitionException {
		try {
			int _type = KW_MINUTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:326:10: ( 'MINUTE' | 'MINUTES' )
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0=='M') ) {
				int LA11_1 = input.LA(2);
				if ( (LA11_1=='I') ) {
					int LA11_2 = input.LA(3);
					if ( (LA11_2=='N') ) {
						int LA11_3 = input.LA(4);
						if ( (LA11_3=='U') ) {
							int LA11_4 = input.LA(5);
							if ( (LA11_4=='T') ) {
								int LA11_5 = input.LA(6);
								if ( (LA11_5=='E') ) {
									int LA11_6 = input.LA(7);
									if ( (LA11_6=='S') ) {
										alt11=2;
									}

									else {
										alt11=1;
									}

								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 11, 5, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 11, 4, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 11, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 11, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 11, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 11, 0, input);
				throw nvae;
			}

			switch (alt11) {
				case 1 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:326:12: 'MINUTE'
					{
					match("MINUTE"); 

					}
					break;
				case 2 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:326:23: 'MINUTES'
					{
					match("MINUTES"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MINUTE"

	// $ANTLR start "KW_SECOND"
	public final void mKW_SECOND() throws RecognitionException {
		try {
			int _type = KW_SECOND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:327:10: ( 'SECOND' | 'SECONDS' )
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0=='S') ) {
				int LA12_1 = input.LA(2);
				if ( (LA12_1=='E') ) {
					int LA12_2 = input.LA(3);
					if ( (LA12_2=='C') ) {
						int LA12_3 = input.LA(4);
						if ( (LA12_3=='O') ) {
							int LA12_4 = input.LA(5);
							if ( (LA12_4=='N') ) {
								int LA12_5 = input.LA(6);
								if ( (LA12_5=='D') ) {
									int LA12_6 = input.LA(7);
									if ( (LA12_6=='S') ) {
										alt12=2;
									}

									else {
										alt12=1;
									}

								}

								else {
									int nvaeMark = input.mark();
									try {
										for (int nvaeConsume = 0; nvaeConsume < 6 - 1; nvaeConsume++) {
											input.consume();
										}
										NoViableAltException nvae =
											new NoViableAltException("", 12, 5, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

							}

							else {
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 5 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 12, 4, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}

						else {
							int nvaeMark = input.mark();
							try {
								for (int nvaeConsume = 0; nvaeConsume < 4 - 1; nvaeConsume++) {
									input.consume();
								}
								NoViableAltException nvae =
									new NoViableAltException("", 12, 3, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

					}

					else {
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 12, 2, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 12, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 12, 0, input);
				throw nvae;
			}

			switch (alt12) {
				case 1 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:327:12: 'SECOND'
					{
					match("SECOND"); 

					}
					break;
				case 2 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:327:23: 'SECONDS'
					{
					match("SECONDS"); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SECOND"

	// $ANTLR start "KW_START"
	public final void mKW_START() throws RecognitionException {
		try {
			int _type = KW_START;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:328:9: ( 'START' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:328:11: 'START'
			{
			match("START"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_START"

	// $ANTLR start "KW_TRANSACTION"
	public final void mKW_TRANSACTION() throws RecognitionException {
		try {
			int _type = KW_TRANSACTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:329:15: ( 'TRANSACTION' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:329:17: 'TRANSACTION'
			{
			match("TRANSACTION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_TRANSACTION"

	// $ANTLR start "KW_COMMIT"
	public final void mKW_COMMIT() throws RecognitionException {
		try {
			int _type = KW_COMMIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:330:10: ( 'COMMIT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:330:12: 'COMMIT'
			{
			match("COMMIT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_COMMIT"

	// $ANTLR start "KW_ROLLBACK"
	public final void mKW_ROLLBACK() throws RecognitionException {
		try {
			int _type = KW_ROLLBACK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:331:12: ( 'ROLLBACK' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:331:14: 'ROLLBACK'
			{
			match("ROLLBACK"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ROLLBACK"

	// $ANTLR start "KW_WORK"
	public final void mKW_WORK() throws RecognitionException {
		try {
			int _type = KW_WORK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:332:8: ( 'WORK' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:332:10: 'WORK'
			{
			match("WORK"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_WORK"

	// $ANTLR start "KW_ONLY"
	public final void mKW_ONLY() throws RecognitionException {
		try {
			int _type = KW_ONLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:333:8: ( 'ONLY' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:333:10: 'ONLY'
			{
			match("ONLY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ONLY"

	// $ANTLR start "KW_WRITE"
	public final void mKW_WRITE() throws RecognitionException {
		try {
			int _type = KW_WRITE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:334:9: ( 'WRITE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:334:11: 'WRITE'
			{
			match("WRITE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_WRITE"

	// $ANTLR start "KW_ISOLATION"
	public final void mKW_ISOLATION() throws RecognitionException {
		try {
			int _type = KW_ISOLATION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:335:13: ( 'ISOLATION' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:335:15: 'ISOLATION'
			{
			match("ISOLATION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ISOLATION"

	// $ANTLR start "KW_LEVEL"
	public final void mKW_LEVEL() throws RecognitionException {
		try {
			int _type = KW_LEVEL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:336:9: ( 'LEVEL' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:336:11: 'LEVEL'
			{
			match("LEVEL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_LEVEL"

	// $ANTLR start "KW_SNAPSHOT"
	public final void mKW_SNAPSHOT() throws RecognitionException {
		try {
			int _type = KW_SNAPSHOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:337:12: ( 'SNAPSHOT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:337:14: 'SNAPSHOT'
			{
			match("SNAPSHOT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SNAPSHOT"

	// $ANTLR start "KW_AUTOCOMMIT"
	public final void mKW_AUTOCOMMIT() throws RecognitionException {
		try {
			int _type = KW_AUTOCOMMIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:338:14: ( 'AUTOCOMMIT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:338:16: 'AUTOCOMMIT'
			{
			match("AUTOCOMMIT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_AUTOCOMMIT"

	// $ANTLR start "KW_CACHE"
	public final void mKW_CACHE() throws RecognitionException {
		try {
			int _type = KW_CACHE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:339:9: ( 'CACHE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:339:11: 'CACHE'
			{
			match("CACHE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CACHE"

	// $ANTLR start "KW_PRIMARY"
	public final void mKW_PRIMARY() throws RecognitionException {
		try {
			int _type = KW_PRIMARY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:340:11: ( 'PRIMARY' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:340:13: 'PRIMARY'
			{
			match("PRIMARY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PRIMARY"

	// $ANTLR start "KW_FOREIGN"
	public final void mKW_FOREIGN() throws RecognitionException {
		try {
			int _type = KW_FOREIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:341:11: ( 'FOREIGN' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:341:13: 'FOREIGN'
			{
			match("FOREIGN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FOREIGN"

	// $ANTLR start "KW_REFERENCES"
	public final void mKW_REFERENCES() throws RecognitionException {
		try {
			int _type = KW_REFERENCES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:342:14: ( 'REFERENCES' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:342:16: 'REFERENCES'
			{
			match("REFERENCES"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_REFERENCES"

	// $ANTLR start "KW_CONSTRAINT"
	public final void mKW_CONSTRAINT() throws RecognitionException {
		try {
			int _type = KW_CONSTRAINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:343:14: ( 'CONSTRAINT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:343:16: 'CONSTRAINT'
			{
			match("CONSTRAINT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CONSTRAINT"

	// $ANTLR start "KW_FORCE"
	public final void mKW_FORCE() throws RecognitionException {
		try {
			int _type = KW_FORCE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:344:9: ( 'FORCE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:344:11: 'FORCE'
			{
			match("FORCE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FORCE"

	// $ANTLR start "KW_ENFORCED"
	public final void mKW_ENFORCED() throws RecognitionException {
		try {
			int _type = KW_ENFORCED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:345:12: ( 'ENFORCED' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:345:14: 'ENFORCED'
			{
			match("ENFORCED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ENFORCED"

	// $ANTLR start "KW_VALIDATE"
	public final void mKW_VALIDATE() throws RecognitionException {
		try {
			int _type = KW_VALIDATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:346:12: ( 'VALIDATE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:346:14: 'VALIDATE'
			{
			match("VALIDATE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_VALIDATE"

	// $ANTLR start "KW_NOVALIDATE"
	public final void mKW_NOVALIDATE() throws RecognitionException {
		try {
			int _type = KW_NOVALIDATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:347:14: ( 'NOVALIDATE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:347:16: 'NOVALIDATE'
			{
			match("NOVALIDATE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_NOVALIDATE"

	// $ANTLR start "KW_RELY"
	public final void mKW_RELY() throws RecognitionException {
		try {
			int _type = KW_RELY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:348:8: ( 'RELY' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:348:10: 'RELY'
			{
			match("RELY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_RELY"

	// $ANTLR start "KW_NORELY"
	public final void mKW_NORELY() throws RecognitionException {
		try {
			int _type = KW_NORELY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:349:10: ( 'NORELY' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:349:12: 'NORELY'
			{
			match("NORELY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_NORELY"

	// $ANTLR start "KW_UNIQUE"
	public final void mKW_UNIQUE() throws RecognitionException {
		try {
			int _type = KW_UNIQUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:350:10: ( 'UNIQUE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:350:12: 'UNIQUE'
			{
			match("UNIQUE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UNIQUE"

	// $ANTLR start "KW_KEY"
	public final void mKW_KEY() throws RecognitionException {
		try {
			int _type = KW_KEY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:351:7: ( 'KEY' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:351:9: 'KEY'
			{
			match("KEY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_KEY"

	// $ANTLR start "KW_ABORT"
	public final void mKW_ABORT() throws RecognitionException {
		try {
			int _type = KW_ABORT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:352:9: ( 'ABORT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:352:11: 'ABORT'
			{
			match("ABORT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ABORT"

	// $ANTLR start "KW_EXTRACT"
	public final void mKW_EXTRACT() throws RecognitionException {
		try {
			int _type = KW_EXTRACT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:353:11: ( 'EXTRACT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:353:13: 'EXTRACT'
			{
			match("EXTRACT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_EXTRACT"

	// $ANTLR start "KW_FLOOR"
	public final void mKW_FLOOR() throws RecognitionException {
		try {
			int _type = KW_FLOOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:354:9: ( 'FLOOR' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:354:11: 'FLOOR'
			{
			match("FLOOR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_FLOOR"

	// $ANTLR start "KW_MERGE"
	public final void mKW_MERGE() throws RecognitionException {
		try {
			int _type = KW_MERGE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:355:9: ( 'MERGE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:355:11: 'MERGE'
			{
			match("MERGE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MERGE"

	// $ANTLR start "KW_MATCHED"
	public final void mKW_MATCHED() throws RecognitionException {
		try {
			int _type = KW_MATCHED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:356:11: ( 'MATCHED' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:356:13: 'MATCHED'
			{
			match("MATCHED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MATCHED"

	// $ANTLR start "KW_REPL"
	public final void mKW_REPL() throws RecognitionException {
		try {
			int _type = KW_REPL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:357:8: ( 'REPL' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:357:10: 'REPL'
			{
			match("REPL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_REPL"

	// $ANTLR start "KW_DUMP"
	public final void mKW_DUMP() throws RecognitionException {
		try {
			int _type = KW_DUMP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:358:8: ( 'DUMP' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:358:10: 'DUMP'
			{
			match("DUMP"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DUMP"

	// $ANTLR start "KW_STATUS"
	public final void mKW_STATUS() throws RecognitionException {
		try {
			int _type = KW_STATUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:359:10: ( 'STATUS' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:359:12: 'STATUS'
			{
			match("STATUS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_STATUS"

	// $ANTLR start "KW_VECTORIZATION"
	public final void mKW_VECTORIZATION() throws RecognitionException {
		try {
			int _type = KW_VECTORIZATION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:360:17: ( 'VECTORIZATION' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:360:19: 'VECTORIZATION'
			{
			match("VECTORIZATION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_VECTORIZATION"

	// $ANTLR start "KW_SUMMARY"
	public final void mKW_SUMMARY() throws RecognitionException {
		try {
			int _type = KW_SUMMARY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:361:11: ( 'SUMMARY' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:361:13: 'SUMMARY'
			{
			match("SUMMARY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SUMMARY"

	// $ANTLR start "KW_OPERATOR"
	public final void mKW_OPERATOR() throws RecognitionException {
		try {
			int _type = KW_OPERATOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:362:12: ( 'OPERATOR' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:362:14: 'OPERATOR'
			{
			match("OPERATOR"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_OPERATOR"

	// $ANTLR start "KW_EXPRESSION"
	public final void mKW_EXPRESSION() throws RecognitionException {
		try {
			int _type = KW_EXPRESSION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:363:14: ( 'EXPRESSION' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:363:16: 'EXPRESSION'
			{
			match("EXPRESSION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_EXPRESSION"

	// $ANTLR start "KW_DETAIL"
	public final void mKW_DETAIL() throws RecognitionException {
		try {
			int _type = KW_DETAIL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:364:10: ( 'DETAIL' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:364:12: 'DETAIL'
			{
			match("DETAIL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DETAIL"

	// $ANTLR start "KW_WAIT"
	public final void mKW_WAIT() throws RecognitionException {
		try {
			int _type = KW_WAIT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:365:8: ( 'WAIT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:365:10: 'WAIT'
			{
			match("WAIT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_WAIT"

	// $ANTLR start "KW_RESOURCE"
	public final void mKW_RESOURCE() throws RecognitionException {
		try {
			int _type = KW_RESOURCE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:366:12: ( 'RESOURCE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:366:14: 'RESOURCE'
			{
			match("RESOURCE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_RESOURCE"

	// $ANTLR start "KW_PLAN"
	public final void mKW_PLAN() throws RecognitionException {
		try {
			int _type = KW_PLAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:367:8: ( 'PLAN' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:367:10: 'PLAN'
			{
			match("PLAN"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PLAN"

	// $ANTLR start "KW_QUERY_PARALLELISM"
	public final void mKW_QUERY_PARALLELISM() throws RecognitionException {
		try {
			int _type = KW_QUERY_PARALLELISM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:368:21: ( 'QUERY_PARALLELISM' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:368:23: 'QUERY_PARALLELISM'
			{
			match("QUERY_PARALLELISM"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_QUERY_PARALLELISM"

	// $ANTLR start "KW_PLANS"
	public final void mKW_PLANS() throws RecognitionException {
		try {
			int _type = KW_PLANS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:369:9: ( 'PLANS' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:369:11: 'PLANS'
			{
			match("PLANS"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PLANS"

	// $ANTLR start "KW_ACTIVATE"
	public final void mKW_ACTIVATE() throws RecognitionException {
		try {
			int _type = KW_ACTIVATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:370:12: ( 'ACTIVATE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:370:14: 'ACTIVATE'
			{
			match("ACTIVATE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ACTIVATE"

	// $ANTLR start "KW_DEFAULT"
	public final void mKW_DEFAULT() throws RecognitionException {
		try {
			int _type = KW_DEFAULT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:371:11: ( 'DEFAULT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:371:13: 'DEFAULT'
			{
			match("DEFAULT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DEFAULT"

	// $ANTLR start "KW_CHECK"
	public final void mKW_CHECK() throws RecognitionException {
		try {
			int _type = KW_CHECK;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:372:9: ( 'CHECK' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:372:11: 'CHECK'
			{
			match("CHECK"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CHECK"

	// $ANTLR start "KW_POOL"
	public final void mKW_POOL() throws RecognitionException {
		try {
			int _type = KW_POOL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:373:8: ( 'POOL' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:373:10: 'POOL'
			{
			match("POOL"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_POOL"

	// $ANTLR start "KW_MOVE"
	public final void mKW_MOVE() throws RecognitionException {
		try {
			int _type = KW_MOVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:374:8: ( 'MOVE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:374:10: 'MOVE'
			{
			match("MOVE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MOVE"

	// $ANTLR start "KW_DO"
	public final void mKW_DO() throws RecognitionException {
		try {
			int _type = KW_DO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:375:6: ( 'DO' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:375:8: 'DO'
			{
			match("DO"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_DO"

	// $ANTLR start "KW_ALLOC_FRACTION"
	public final void mKW_ALLOC_FRACTION() throws RecognitionException {
		try {
			int _type = KW_ALLOC_FRACTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:376:18: ( 'ALLOC_FRACTION' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:376:20: 'ALLOC_FRACTION'
			{
			match("ALLOC_FRACTION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ALLOC_FRACTION"

	// $ANTLR start "KW_SCHEDULING_POLICY"
	public final void mKW_SCHEDULING_POLICY() throws RecognitionException {
		try {
			int _type = KW_SCHEDULING_POLICY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:377:21: ( 'SCHEDULING_POLICY' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:377:23: 'SCHEDULING_POLICY'
			{
			match("SCHEDULING_POLICY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SCHEDULING_POLICY"

	// $ANTLR start "KW_SCHEDULED"
	public final void mKW_SCHEDULED() throws RecognitionException {
		try {
			int _type = KW_SCHEDULED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:378:13: ( 'SCHEDULED' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:378:15: 'SCHEDULED'
			{
			match("SCHEDULED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SCHEDULED"

	// $ANTLR start "KW_EVERY"
	public final void mKW_EVERY() throws RecognitionException {
		try {
			int _type = KW_EVERY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:379:9: ( 'EVERY' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:379:11: 'EVERY'
			{
			match("EVERY"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_EVERY"

	// $ANTLR start "KW_AT"
	public final void mKW_AT() throws RecognitionException {
		try {
			int _type = KW_AT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:380:6: ( 'AT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:380:8: 'AT'
			{
			match("AT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_AT"

	// $ANTLR start "KW_CRON"
	public final void mKW_CRON() throws RecognitionException {
		try {
			int _type = KW_CRON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:381:8: ( 'CRON' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:381:10: 'CRON'
			{
			match("CRON"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_CRON"

	// $ANTLR start "KW_PATH"
	public final void mKW_PATH() throws RecognitionException {
		try {
			int _type = KW_PATH;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:382:8: ( 'PATH' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:382:10: 'PATH'
			{
			match("PATH"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_PATH"

	// $ANTLR start "KW_MAPPING"
	public final void mKW_MAPPING() throws RecognitionException {
		try {
			int _type = KW_MAPPING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:383:11: ( 'MAPPING' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:383:13: 'MAPPING'
			{
			match("MAPPING"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MAPPING"

	// $ANTLR start "KW_WORKLOAD"
	public final void mKW_WORKLOAD() throws RecognitionException {
		try {
			int _type = KW_WORKLOAD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:384:12: ( 'WORKLOAD' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:384:14: 'WORKLOAD'
			{
			match("WORKLOAD"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_WORKLOAD"

	// $ANTLR start "KW_MANAGEMENT"
	public final void mKW_MANAGEMENT() throws RecognitionException {
		try {
			int _type = KW_MANAGEMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:385:14: ( 'MANAGEMENT' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:385:16: 'MANAGEMENT'
			{
			match("MANAGEMENT"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_MANAGEMENT"

	// $ANTLR start "KW_ACTIVE"
	public final void mKW_ACTIVE() throws RecognitionException {
		try {
			int _type = KW_ACTIVE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:386:10: ( 'ACTIVE' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:386:12: 'ACTIVE'
			{
			match("ACTIVE"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_ACTIVE"

	// $ANTLR start "KW_UNMANAGED"
	public final void mKW_UNMANAGED() throws RecognitionException {
		try {
			int _type = KW_UNMANAGED;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:387:13: ( 'UNMANAGED' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:387:15: 'UNMANAGED'
			{
			match("UNMANAGED"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_UNMANAGED"

	// $ANTLR start "KW_APPLICATION"
	public final void mKW_APPLICATION() throws RecognitionException {
		try {
			int _type = KW_APPLICATION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:388:15: ( 'APPLICATION' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:388:17: 'APPLICATION'
			{
			match("APPLICATION"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_APPLICATION"

	// $ANTLR start "KW_SYNC"
	public final void mKW_SYNC() throws RecognitionException {
		try {
			int _type = KW_SYNC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:389:8: ( 'SYNC' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:389:10: 'SYNC'
			{
			match("SYNC"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_SYNC"

	// $ANTLR start "KW_COST"
	public final void mKW_COST() throws RecognitionException {
		try {
			int _type = KW_COST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:390:8: ( 'COST' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:390:10: 'COST'
			{
			match("COST"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_COST"

	// $ANTLR start "KW_JOINCOST"
	public final void mKW_JOINCOST() throws RecognitionException {
		try {
			int _type = KW_JOINCOST;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:391:12: ( 'JOINCOST' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:391:14: 'JOINCOST'
			{
			match("JOINCOST"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "KW_JOINCOST"

	// $ANTLR start "DOT"
	public final void mDOT() throws RecognitionException {
		try {
			int _type = DOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:396:5: ( '.' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:396:7: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOT"

	// $ANTLR start "COLON"
	public final void mCOLON() throws RecognitionException {
		try {
			int _type = COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:397:7: ( ':' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:397:9: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLON"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:398:7: ( ',' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:398:9: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "SEMICOLON"
	public final void mSEMICOLON() throws RecognitionException {
		try {
			int _type = SEMICOLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:399:11: ( ';' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:399:13: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMICOLON"

	// $ANTLR start "LPAREN"
	public final void mLPAREN() throws RecognitionException {
		try {
			int _type = LPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:401:8: ( '(' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:401:10: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LPAREN"

	// $ANTLR start "RPAREN"
	public final void mRPAREN() throws RecognitionException {
		try {
			int _type = RPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:402:8: ( ')' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:402:10: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RPAREN"

	// $ANTLR start "LSQUARE"
	public final void mLSQUARE() throws RecognitionException {
		try {
			int _type = LSQUARE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:403:9: ( '[' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:403:11: '['
			{
			match('['); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LSQUARE"

	// $ANTLR start "RSQUARE"
	public final void mRSQUARE() throws RecognitionException {
		try {
			int _type = RSQUARE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:404:9: ( ']' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:404:11: ']'
			{
			match(']'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RSQUARE"

	// $ANTLR start "LCURLY"
	public final void mLCURLY() throws RecognitionException {
		try {
			int _type = LCURLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:405:8: ( '{' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:405:10: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LCURLY"

	// $ANTLR start "RCURLY"
	public final void mRCURLY() throws RecognitionException {
		try {
			int _type = RCURLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:406:8: ( '}' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:406:10: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RCURLY"

	// $ANTLR start "EQUAL"
	public final void mEQUAL() throws RecognitionException {
		try {
			int _type = EQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:408:7: ( '=' | '==' )
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0=='=') ) {
				int LA13_1 = input.LA(2);
				if ( (LA13_1=='=') ) {
					alt13=2;
				}

				else {
					alt13=1;
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 13, 0, input);
				throw nvae;
			}

			switch (alt13) {
				case 1 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:408:9: '='
					{
					match('='); 
					}
					break;
				case 2 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:408:15: '=='
					{
					match("=="); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQUAL"

	// $ANTLR start "EQUAL_NS"
	public final void mEQUAL_NS() throws RecognitionException {
		try {
			int _type = EQUAL_NS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:409:10: ( '<=>' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:409:12: '<=>'
			{
			match("<=>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQUAL_NS"

	// $ANTLR start "NOTEQUAL"
	public final void mNOTEQUAL() throws RecognitionException {
		try {
			int _type = NOTEQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:410:10: ( '<>' | '!=' )
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0=='<') ) {
				alt14=1;
			}
			else if ( (LA14_0=='!') ) {
				alt14=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 14, 0, input);
				throw nvae;
			}

			switch (alt14) {
				case 1 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:410:12: '<>'
					{
					match("<>"); 

					}
					break;
				case 2 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:410:19: '!='
					{
					match("!="); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOTEQUAL"

	// $ANTLR start "LESSTHANOREQUALTO"
	public final void mLESSTHANOREQUALTO() throws RecognitionException {
		try {
			int _type = LESSTHANOREQUALTO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:411:19: ( '<=' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:411:21: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LESSTHANOREQUALTO"

	// $ANTLR start "LESSTHAN"
	public final void mLESSTHAN() throws RecognitionException {
		try {
			int _type = LESSTHAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:412:10: ( '<' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:412:12: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LESSTHAN"

	// $ANTLR start "GREATERTHANOREQUALTO"
	public final void mGREATERTHANOREQUALTO() throws RecognitionException {
		try {
			int _type = GREATERTHANOREQUALTO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:413:22: ( '>=' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:413:24: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GREATERTHANOREQUALTO"

	// $ANTLR start "GREATERTHAN"
	public final void mGREATERTHAN() throws RecognitionException {
		try {
			int _type = GREATERTHAN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:414:13: ( '>' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:414:15: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GREATERTHAN"

	// $ANTLR start "DIVIDE"
	public final void mDIVIDE() throws RecognitionException {
		try {
			int _type = DIVIDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:416:8: ( '/' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:416:10: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIVIDE"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:417:6: ( '+' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:417:8: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS"

	// $ANTLR start "MINUS"
	public final void mMINUS() throws RecognitionException {
		try {
			int _type = MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:418:7: ( '-' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:418:9: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINUS"

	// $ANTLR start "STAR"
	public final void mSTAR() throws RecognitionException {
		try {
			int _type = STAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:419:6: ( '*' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:419:8: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STAR"

	// $ANTLR start "MOD"
	public final void mMOD() throws RecognitionException {
		try {
			int _type = MOD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:420:5: ( '%' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:420:7: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOD"

	// $ANTLR start "DIV"
	public final void mDIV() throws RecognitionException {
		try {
			int _type = DIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:421:5: ( 'DIV' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:421:7: 'DIV'
			{
			match("DIV"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIV"

	// $ANTLR start "AMPERSAND"
	public final void mAMPERSAND() throws RecognitionException {
		try {
			int _type = AMPERSAND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:423:11: ( '&' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:423:13: '&'
			{
			match('&'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AMPERSAND"

	// $ANTLR start "TILDE"
	public final void mTILDE() throws RecognitionException {
		try {
			int _type = TILDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:424:7: ( '~' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:424:9: '~'
			{
			match('~'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TILDE"

	// $ANTLR start "BITWISEOR"
	public final void mBITWISEOR() throws RecognitionException {
		try {
			int _type = BITWISEOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:425:11: ( '|' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:425:13: '|'
			{
			match('|'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BITWISEOR"

	// $ANTLR start "CONCATENATE"
	public final void mCONCATENATE() throws RecognitionException {
		try {
			int _type = CONCATENATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:426:13: ( '||' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:426:15: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CONCATENATE"

	// $ANTLR start "BITWISEXOR"
	public final void mBITWISEXOR() throws RecognitionException {
		try {
			int _type = BITWISEXOR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:427:12: ( '^' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:427:14: '^'
			{
			match('^'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BITWISEXOR"

	// $ANTLR start "QUESTION"
	public final void mQUESTION() throws RecognitionException {
		try {
			int _type = QUESTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:428:10: ( '?' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:428:12: '?'
			{
			match('?'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUESTION"

	// $ANTLR start "DOLLAR"
	public final void mDOLLAR() throws RecognitionException {
		try {
			int _type = DOLLAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:429:8: ( '$' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:429:10: '$'
			{
			match('$'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOLLAR"

	// $ANTLR start "Letter"
	public final void mLetter() throws RecognitionException {
		try {
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:434:5: ( 'a' .. 'z' | 'A' .. 'Z' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Letter"

	// $ANTLR start "HexDigit"
	public final void mHexDigit() throws RecognitionException {
		try {
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:439:5: ( 'a' .. 'f' | 'A' .. 'F' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HexDigit"

	// $ANTLR start "Digit"
	public final void mDigit() throws RecognitionException {
		try {
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:444:5: ( '0' .. '9' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Digit"

	// $ANTLR start "Exponent"
	public final void mExponent() throws RecognitionException {
		try {
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:450:5: ( ( 'e' | 'E' ) ( PLUS | MINUS )? ( Digit )+ )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:451:5: ( 'e' | 'E' ) ( PLUS | MINUS )? ( Digit )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:451:17: ( PLUS | MINUS )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0=='+'||LA15_0=='-') ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:451:33: ( Digit )+
			int cnt16=0;
			loop16:
			while (true) {
				int alt16=2;
				int LA16_0 = input.LA(1);
				if ( ((LA16_0 >= '0' && LA16_0 <= '9')) ) {
					alt16=1;
				}

				switch (alt16) {
				case 1 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt16 >= 1 ) break loop16;
					EarlyExitException eee = new EarlyExitException(16, input);
					throw eee;
				}
				cnt16++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Exponent"

	// $ANTLR start "RegexComponent"
	public final void mRegexComponent() throws RecognitionException {
		try {
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:456:5: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | PLUS | STAR | QUESTION | MINUS | DOT | LPAREN | RPAREN | LSQUARE | RSQUARE | LCURLY | RCURLY | BITWISEXOR | BITWISEOR | DOLLAR | '!' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:
			{
			if ( input.LA(1)=='!'||input.LA(1)=='$'||(input.LA(1) >= '(' && input.LA(1) <= '+')||(input.LA(1) >= '-' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= '9')||input.LA(1)=='?'||(input.LA(1) >= 'A' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '_')||(input.LA(1) >= 'a' && input.LA(1) <= '}') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RegexComponent"

	// $ANTLR start "StringLiteral"
	public final void mStringLiteral() throws RecognitionException {
		try {
			int _type = StringLiteral;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:463:5: ( ( '\\'' (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )* '\\'' | '\\\"' (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )* '\\\"' )+ )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:464:5: ( '\\'' (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )* '\\'' | '\\\"' (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )* '\\\"' )+
			{
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:464:5: ( '\\'' (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )* '\\'' | '\\\"' (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )* '\\\"' )+
			int cnt19=0;
			loop19:
			while (true) {
				int alt19=3;
				int LA19_0 = input.LA(1);
				if ( (LA19_0=='\'') ) {
					alt19=1;
				}
				else if ( (LA19_0=='\"') ) {
					alt19=2;
				}

				switch (alt19) {
				case 1 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:464:7: '\\'' (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )* '\\''
					{
					match('\''); 
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:464:12: (~ ( '\\'' | '\\\\' ) | ( '\\\\' . ) )*
					loop17:
					while (true) {
						int alt17=3;
						int LA17_0 = input.LA(1);
						if ( ((LA17_0 >= '\u0000' && LA17_0 <= '&')||(LA17_0 >= '(' && LA17_0 <= '[')||(LA17_0 >= ']' && LA17_0 <= '\uFFFF')) ) {
							alt17=1;
						}
						else if ( (LA17_0=='\\') ) {
							alt17=2;
						}

						switch (alt17) {
						case 1 :
							// org/apache/hadoop/hive/ql/parse/HiveLexer.g:464:14: ~ ( '\\'' | '\\\\' )
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;
						case 2 :
							// org/apache/hadoop/hive/ql/parse/HiveLexer.g:464:29: ( '\\\\' . )
							{
							// org/apache/hadoop/hive/ql/parse/HiveLexer.g:464:29: ( '\\\\' . )
							// org/apache/hadoop/hive/ql/parse/HiveLexer.g:464:30: '\\\\' .
							{
							match('\\'); 
							matchAny(); 
							}

							}
							break;

						default :
							break loop17;
						}
					}

					match('\''); 
					}
					break;
				case 2 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:465:7: '\\\"' (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )* '\\\"'
					{
					match('\"'); 
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:465:12: (~ ( '\\\"' | '\\\\' ) | ( '\\\\' . ) )*
					loop18:
					while (true) {
						int alt18=3;
						int LA18_0 = input.LA(1);
						if ( ((LA18_0 >= '\u0000' && LA18_0 <= '!')||(LA18_0 >= '#' && LA18_0 <= '[')||(LA18_0 >= ']' && LA18_0 <= '\uFFFF')) ) {
							alt18=1;
						}
						else if ( (LA18_0=='\\') ) {
							alt18=2;
						}

						switch (alt18) {
						case 1 :
							// org/apache/hadoop/hive/ql/parse/HiveLexer.g:465:14: ~ ( '\\\"' | '\\\\' )
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;
						case 2 :
							// org/apache/hadoop/hive/ql/parse/HiveLexer.g:465:29: ( '\\\\' . )
							{
							// org/apache/hadoop/hive/ql/parse/HiveLexer.g:465:29: ( '\\\\' . )
							// org/apache/hadoop/hive/ql/parse/HiveLexer.g:465:30: '\\\\' .
							{
							match('\\'); 
							matchAny(); 
							}

							}
							break;

						default :
							break loop18;
						}
					}

					match('\"'); 
					}
					break;

				default :
					if ( cnt19 >= 1 ) break loop19;
					EarlyExitException eee = new EarlyExitException(19, input);
					throw eee;
				}
				cnt19++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "StringLiteral"

	// $ANTLR start "CharSetLiteral"
	public final void mCharSetLiteral() throws RecognitionException {
		try {
			int _type = CharSetLiteral;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:470:5: ( StringLiteral | '0' 'X' ( HexDigit | Digit )+ )
			int alt21=2;
			int LA21_0 = input.LA(1);
			if ( (LA21_0=='\"'||LA21_0=='\'') ) {
				alt21=1;
			}
			else if ( (LA21_0=='0') ) {
				alt21=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 21, 0, input);
				throw nvae;
			}

			switch (alt21) {
				case 1 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:471:5: StringLiteral
					{
					mStringLiteral(); 

					}
					break;
				case 2 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:472:7: '0' 'X' ( HexDigit | Digit )+
					{
					match('0'); 
					match('X'); 
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:472:15: ( HexDigit | Digit )+
					int cnt20=0;
					loop20:
					while (true) {
						int alt20=2;
						int LA20_0 = input.LA(1);
						if ( ((LA20_0 >= '0' && LA20_0 <= '9')||(LA20_0 >= 'A' && LA20_0 <= 'F')||(LA20_0 >= 'a' && LA20_0 <= 'f')) ) {
							alt20=1;
						}

						switch (alt20) {
						case 1 :
							// org/apache/hadoop/hive/ql/parse/HiveLexer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt20 >= 1 ) break loop20;
							EarlyExitException eee = new EarlyExitException(20, input);
							throw eee;
						}
						cnt20++;
					}

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CharSetLiteral"

	// $ANTLR start "IntegralLiteral"
	public final void mIntegralLiteral() throws RecognitionException {
		try {
			int _type = IntegralLiteral;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:476:5: ( ( Digit )+ ( 'L' | 'S' | 'Y' ) )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:477:5: ( Digit )+ ( 'L' | 'S' | 'Y' )
			{
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:477:5: ( Digit )+
			int cnt22=0;
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( ((LA22_0 >= '0' && LA22_0 <= '9')) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt22 >= 1 ) break loop22;
					EarlyExitException eee = new EarlyExitException(22, input);
					throw eee;
				}
				cnt22++;
			}

			if ( input.LA(1)=='L'||input.LA(1)=='S'||input.LA(1)=='Y' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IntegralLiteral"

	// $ANTLR start "NumberLiteral"
	public final void mNumberLiteral() throws RecognitionException {
		try {
			int _type = NumberLiteral;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:481:5: ( Number ( 'D' | 'B' 'D' ) )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:482:5: Number ( 'D' | 'B' 'D' )
			{
			mNumber(); 

			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:482:12: ( 'D' | 'B' 'D' )
			int alt23=2;
			int LA23_0 = input.LA(1);
			if ( (LA23_0=='D') ) {
				alt23=1;
			}
			else if ( (LA23_0=='B') ) {
				alt23=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 23, 0, input);
				throw nvae;
			}

			switch (alt23) {
				case 1 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:482:13: 'D'
					{
					match('D'); 
					}
					break;
				case 2 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:482:19: 'B' 'D'
					{
					match('B'); 
					match('D'); 
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NumberLiteral"

	// $ANTLR start "ByteLengthLiteral"
	public final void mByteLengthLiteral() throws RecognitionException {
		try {
			int _type = ByteLengthLiteral;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:486:5: ( ( Digit )+ ( 'b' | 'B' | 'k' | 'K' | 'm' | 'M' | 'g' | 'G' ) )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:487:5: ( Digit )+ ( 'b' | 'B' | 'k' | 'K' | 'm' | 'M' | 'g' | 'G' )
			{
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:487:5: ( Digit )+
			int cnt24=0;
			loop24:
			while (true) {
				int alt24=2;
				int LA24_0 = input.LA(1);
				if ( ((LA24_0 >= '0' && LA24_0 <= '9')) ) {
					alt24=1;
				}

				switch (alt24) {
				case 1 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt24 >= 1 ) break loop24;
					EarlyExitException eee = new EarlyExitException(24, input);
					throw eee;
				}
				cnt24++;
			}

			if ( input.LA(1)=='B'||input.LA(1)=='G'||input.LA(1)=='K'||input.LA(1)=='M'||input.LA(1)=='b'||input.LA(1)=='g'||input.LA(1)=='k'||input.LA(1)=='m' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ByteLengthLiteral"

	// $ANTLR start "Number"
	public final void mNumber() throws RecognitionException {
		try {
			int _type = Number;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:491:5: ( ( Digit )+ ( DOT ( Digit )* ( Exponent )? | Exponent )? )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:492:5: ( Digit )+ ( DOT ( Digit )* ( Exponent )? | Exponent )?
			{
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:492:5: ( Digit )+
			int cnt25=0;
			loop25:
			while (true) {
				int alt25=2;
				int LA25_0 = input.LA(1);
				if ( ((LA25_0 >= '0' && LA25_0 <= '9')) ) {
					alt25=1;
				}

				switch (alt25) {
				case 1 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt25 >= 1 ) break loop25;
					EarlyExitException eee = new EarlyExitException(25, input);
					throw eee;
				}
				cnt25++;
			}

			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:492:14: ( DOT ( Digit )* ( Exponent )? | Exponent )?
			int alt28=3;
			int LA28_0 = input.LA(1);
			if ( (LA28_0=='.') ) {
				alt28=1;
			}
			else if ( (LA28_0=='E'||LA28_0=='e') ) {
				alt28=2;
			}
			switch (alt28) {
				case 1 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:492:16: DOT ( Digit )* ( Exponent )?
					{
					mDOT(); 

					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:492:20: ( Digit )*
					loop26:
					while (true) {
						int alt26=2;
						int LA26_0 = input.LA(1);
						if ( ((LA26_0 >= '0' && LA26_0 <= '9')) ) {
							alt26=1;
						}

						switch (alt26) {
						case 1 :
							// org/apache/hadoop/hive/ql/parse/HiveLexer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop26;
						}
					}

					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:492:29: ( Exponent )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0=='E'||LA27_0=='e') ) {
						alt27=1;
					}
					switch (alt27) {
						case 1 :
							// org/apache/hadoop/hive/ql/parse/HiveLexer.g:492:30: Exponent
							{
							mExponent(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:492:43: Exponent
					{
					mExponent(); 

					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Number"

	// $ANTLR start "Identifier"
	public final void mIdentifier() throws RecognitionException {
		try {
			int _type = Identifier;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:517:5: ( ( Letter | Digit ) ( Letter | Digit | '_' )* |{...}? QuotedIdentifier | '`' ( RegexComponent )+ '`' )
			int alt31=3;
			alt31 = dfa31.predict(input);
			switch (alt31) {
				case 1 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:518:5: ( Letter | Digit ) ( Letter | Digit | '_' )*
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:518:22: ( Letter | Digit | '_' )*
					loop29:
					while (true) {
						int alt29=2;
						int LA29_0 = input.LA(1);
						if ( ((LA29_0 >= '0' && LA29_0 <= '9')||(LA29_0 >= 'A' && LA29_0 <= 'Z')||LA29_0=='_'||(LA29_0 >= 'a' && LA29_0 <= 'z')) ) {
							alt29=1;
						}

						switch (alt29) {
						case 1 :
							// org/apache/hadoop/hive/ql/parse/HiveLexer.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop29;
						}
					}

					}
					break;
				case 2 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:519:7: {...}? QuotedIdentifier
					{
					if ( !((allowQuotedId())) ) {
						throw new FailedPredicateException(input, "Identifier", "allowQuotedId()");
					}
					mQuotedIdentifier(); 

					}
					break;
				case 3 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:521:7: '`' ( RegexComponent )+ '`'
					{
					match('`'); 
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:521:11: ( RegexComponent )+
					int cnt30=0;
					loop30:
					while (true) {
						int alt30=2;
						int LA30_0 = input.LA(1);
						if ( (LA30_0=='!'||LA30_0=='$'||(LA30_0 >= '(' && LA30_0 <= '+')||(LA30_0 >= '-' && LA30_0 <= '.')||(LA30_0 >= '0' && LA30_0 <= '9')||LA30_0=='?'||(LA30_0 >= 'A' && LA30_0 <= '[')||(LA30_0 >= ']' && LA30_0 <= '_')||(LA30_0 >= 'a' && LA30_0 <= '}')) ) {
							alt30=1;
						}

						switch (alt30) {
						case 1 :
							// org/apache/hadoop/hive/ql/parse/HiveLexer.g:
							{
							if ( input.LA(1)=='!'||input.LA(1)=='$'||(input.LA(1) >= '(' && input.LA(1) <= '+')||(input.LA(1) >= '-' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= '9')||input.LA(1)=='?'||(input.LA(1) >= 'A' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '_')||(input.LA(1) >= 'a' && input.LA(1) <= '}') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt30 >= 1 ) break loop30;
							EarlyExitException eee = new EarlyExitException(30, input);
							throw eee;
						}
						cnt30++;
					}

					match('`'); 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Identifier"

	// $ANTLR start "QuotedIdentifier"
	public final void mQuotedIdentifier() throws RecognitionException {
		try {
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:526:5: ( '`' ( '``' |~ ( '`' ) )* '`' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:527:5: '`' ( '``' |~ ( '`' ) )* '`'
			{
			match('`'); 
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:527:10: ( '``' |~ ( '`' ) )*
			loop32:
			while (true) {
				int alt32=3;
				int LA32_0 = input.LA(1);
				if ( (LA32_0=='`') ) {
					int LA32_1 = input.LA(2);
					if ( (LA32_1=='`') ) {
						alt32=1;
					}

				}
				else if ( ((LA32_0 >= '\u0000' && LA32_0 <= '_')||(LA32_0 >= 'a' && LA32_0 <= '\uFFFF')) ) {
					alt32=2;
				}

				switch (alt32) {
				case 1 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:527:12: '``'
					{
					match("``"); 

					}
					break;
				case 2 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:527:19: ~ ( '`' )
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '_')||(input.LA(1) >= 'a' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop32;
				}
			}

			match('`'); 
			 setText(StringUtils.replace(getText().substring(1, getText().length() -1 ), "``", "`")); 
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QuotedIdentifier"

	// $ANTLR start "CharSetName"
	public final void mCharSetName() throws RecognitionException {
		try {
			int _type = CharSetName;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:531:5: ( '_' ( Letter | Digit | '_' | '-' | '.' | ':' )+ )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:532:5: '_' ( Letter | Digit | '_' | '-' | '.' | ':' )+
			{
			match('_'); 
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:532:9: ( Letter | Digit | '_' | '-' | '.' | ':' )+
			int cnt33=0;
			loop33:
			while (true) {
				int alt33=2;
				int LA33_0 = input.LA(1);
				if ( ((LA33_0 >= '-' && LA33_0 <= '.')||(LA33_0 >= '0' && LA33_0 <= ':')||(LA33_0 >= 'A' && LA33_0 <= 'Z')||LA33_0=='_'||(LA33_0 >= 'a' && LA33_0 <= 'z')) ) {
					alt33=1;
				}

				switch (alt33) {
				case 1 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:
					{
					if ( (input.LA(1) >= '-' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= ':')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt33 >= 1 ) break loop33;
					EarlyExitException eee = new EarlyExitException(33, input);
					throw eee;
				}
				cnt33++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CharSetName"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:535:5: ( ( ' ' | '\\r' | '\\t' | '\\n' ) )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:535:8: ( ' ' | '\\r' | '\\t' | '\\n' )
			{
			if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			_channel=HIDDEN;
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "LINE_COMMENT"
	public final void mLINE_COMMENT() throws RecognitionException {
		try {
			int _type = LINE_COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:539:5: ( '--' (~ ( '\\n' | '\\r' ) )* )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:539:7: '--' (~ ( '\\n' | '\\r' ) )*
			{
			match("--"); 

			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:539:12: (~ ( '\\n' | '\\r' ) )*
			loop34:
			while (true) {
				int alt34=2;
				int LA34_0 = input.LA(1);
				if ( ((LA34_0 >= '\u0000' && LA34_0 <= '\t')||(LA34_0 >= '\u000B' && LA34_0 <= '\f')||(LA34_0 >= '\u000E' && LA34_0 <= '\uFFFF')) ) {
					alt34=1;
				}

				switch (alt34) {
				case 1 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop34;
				}
			}

			 _channel=HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LINE_COMMENT"

	// $ANTLR start "QUERY_HINT"
	public final void mQUERY_HINT() throws RecognitionException {
		try {
			int _type = QUERY_HINT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:543:5: ( '/*' ( options {greedy=false; } : QUERY_HINT | . )* '*/' )
			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:543:7: '/*' ( options {greedy=false; } : QUERY_HINT | . )* '*/'
			{
			match("/*"); 

			// org/apache/hadoop/hive/ql/parse/HiveLexer.g:543:12: ( options {greedy=false; } : QUERY_HINT | . )*
			loop35:
			while (true) {
				int alt35=3;
				int LA35_0 = input.LA(1);
				if ( (LA35_0=='*') ) {
					int LA35_1 = input.LA(2);
					if ( (LA35_1=='/') ) {
						alt35=3;
					}
					else if ( ((LA35_1 >= '\u0000' && LA35_1 <= '.')||(LA35_1 >= '0' && LA35_1 <= '\uFFFF')) ) {
						alt35=2;
					}

				}
				else if ( (LA35_0=='/') ) {
					int LA35_2 = input.LA(2);
					if ( (LA35_2=='*') ) {
						alt35=1;
					}
					else if ( ((LA35_2 >= '\u0000' && LA35_2 <= ')')||(LA35_2 >= '+' && LA35_2 <= '\uFFFF')) ) {
						alt35=2;
					}

				}
				else if ( ((LA35_0 >= '\u0000' && LA35_0 <= ')')||(LA35_0 >= '+' && LA35_0 <= '.')||(LA35_0 >= '0' && LA35_0 <= '\uFFFF')) ) {
					alt35=2;
				}

				switch (alt35) {
				case 1 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:543:41: QUERY_HINT
					{
					mQUERY_HINT(); 

					}
					break;
				case 2 :
					// org/apache/hadoop/hive/ql/parse/HiveLexer.g:543:52: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop35;
				}
			}

			match("*/"); 

			 if(getText().charAt(2) != '+') { _channel=HIDDEN; } else { setText(getText().substring(3, getText().length() - 2)); } 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUERY_HINT"

	@Override
	public void mTokens() throws RecognitionException {
		// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:8: ( KW_TRUE | KW_FALSE | KW_ALL | KW_NONE | KW_AND | KW_OR | KW_NOT | KW_LIKE | KW_ANY | KW_IF | KW_EXISTS | KW_ASC | KW_DESC | KW_NULLS | KW_LAST | KW_ORDER | KW_GROUP | KW_BY | KW_HAVING | KW_WHERE | KW_FROM | KW_AS | KW_SELECT | KW_DISTINCT | KW_INSERT | KW_OVERWRITE | KW_OUTER | KW_UNIQUEJOIN | KW_PRESERVE | KW_JOIN | KW_LEFT | KW_RIGHT | KW_FULL | KW_ON | KW_PARTITION | KW_PARTITIONS | KW_TABLE | KW_TABLES | KW_COLUMNS | KW_INDEX | KW_INDEXES | KW_REBUILD | KW_FUNCTIONS | KW_SHOW | KW_MSCK | KW_REPAIR | KW_DIRECTORY | KW_LOCAL | KW_TRANSFORM | KW_USING | KW_CLUSTER | KW_DISTRIBUTE | KW_SORT | KW_UNION | KW_EXCEPT | KW_LOAD | KW_EXPORT | KW_IMPORT | KW_REPLICATION | KW_METADATA | KW_DATA | KW_INPATH | KW_IS | KW_NULL | KW_CREATE | KW_EXTERNAL | KW_ALTER | KW_CHANGE | KW_COLUMN | KW_FIRST | KW_AFTER | KW_DESCRIBE | KW_DROP | KW_RENAME | KW_TO | KW_COMMENT | KW_BOOLEAN | KW_TINYINT | KW_SMALLINT | KW_INT | KW_BIGINT | KW_FLOAT | KW_DOUBLE | KW_PRECISION | KW_DATE | KW_DATETIME | KW_TIMESTAMP | KW_TIMESTAMPLOCALTZ | KW_TIME | KW_ZONE | KW_INTERVAL | KW_DECIMAL | KW_STRING | KW_CHAR | KW_VARCHAR | KW_ARRAY | KW_STRUCT | KW_MAP | KW_UNIONTYPE | KW_REDUCE | KW_PARTITIONED | KW_CLUSTERED | KW_DISTRIBUTED | KW_SORTED | KW_INTO | KW_BUCKETS | KW_ROW | KW_ROWS | KW_FORMAT | KW_DELIMITED | KW_FIELDS | KW_TERMINATED | KW_ESCAPED | KW_COLLECTION | KW_ITEMS | KW_KEYS | KW_KEY_TYPE | KW_KILL | KW_LINES | KW_STORED | KW_FILEFORMAT | KW_INPUTFORMAT | KW_OUTPUTFORMAT | KW_INPUTDRIVER | KW_OUTPUTDRIVER | KW_ENABLE | KW_DISABLE | KW_EXECUTED | KW_EXECUTE | KW_LOCATION | KW_MANAGEDLOCATION | KW_TABLESAMPLE | KW_BUCKET | KW_OUT | KW_OF | KW_PERCENT | KW_CAST | KW_ADD | KW_REPLACE | KW_RLIKE | KW_REGEXP | KW_TEMPORARY | KW_FUNCTION | KW_MACRO | KW_FILE | KW_JAR | KW_EXPLAIN | KW_EXTENDED | KW_DEBUG | KW_FORMATTED | KW_DEPENDENCY | KW_LOGICAL | KW_CBO | KW_SERDE | KW_WITH | KW_DEFERRED | KW_SERDEPROPERTIES | KW_DBPROPERTIES | KW_LIMIT | KW_OFFSET | KW_SET | KW_UNSET | KW_TBLPROPERTIES | KW_IDXPROPERTIES | KW_VALUE_TYPE | KW_ELEM_TYPE | KW_DEFINED | KW_CASE | KW_WHEN | KW_THEN | KW_ELSE | KW_END | KW_MAPJOIN | KW_STREAMTABLE | KW_CLUSTERSTATUS | KW_UTC | KW_UTCTIMESTAMP | KW_LONG | KW_DELETE | KW_PLUS | KW_MINUS | KW_FETCH | KW_INTERSECT | KW_VIEW | KW_VIEWS | KW_IN | KW_DATABASE | KW_DATABASES | KW_MATERIALIZED | KW_SCHEMA | KW_SCHEMAS | KW_GRANT | KW_REVOKE | KW_SSL | KW_UNDO | KW_LOCK | KW_LOCKS | KW_UNLOCK | KW_SHARED | KW_EXCLUSIVE | KW_PROCEDURE | KW_UNSIGNED | KW_WHILE | KW_READ | KW_READS | KW_PURGE | KW_RANGE | KW_ANALYZE | KW_BEFORE | KW_BETWEEN | KW_BOTH | KW_BINARY | KW_CROSS | KW_CONTINUE | KW_CURSOR | KW_TRIGGER | KW_RECORDREADER | KW_RECORDWRITER | KW_SEMI | KW_LATERAL | KW_TOUCH | KW_ARCHIVE | KW_UNARCHIVE | KW_COMPUTE | KW_STATISTICS | KW_USE | KW_OPTION | KW_CONCATENATE | KW_SHOW_DATABASE | KW_UPDATE | KW_RESTRICT | KW_CASCADE | KW_SKEWED | KW_ROLLUP | KW_CUBE | KW_DIRECTORIES | KW_FOR | KW_WINDOW | KW_UNBOUNDED | KW_PRECEDING | KW_FOLLOWING | KW_CURRENT | KW_CURRENT_DATE | KW_CURRENT_TIMESTAMP | KW_LESS | KW_MORE | KW_OVER | KW_GROUPING | KW_SETS | KW_TRUNCATE | KW_NOSCAN | KW_USER | KW_ROLE | KW_ROLES | KW_INNER | KW_EXCHANGE | KW_URI | KW_SERVER | KW_ADMIN | KW_OWNER | KW_PRINCIPALS | KW_COMPACT | KW_COMPACTIONS | KW_TRANSACTIONS | KW_TRANSACTIONAL | KW_REWRITE | KW_AUTHORIZATION | KW_REOPTIMIZATION | KW_CONF | KW_VALUES | KW_RELOAD | KW_YEAR | KW_QUERY | KW_QUARTER | KW_MONTH | KW_WEEK | KW_DAY | KW_DOW | KW_HOUR | KW_MINUTE | KW_SECOND | KW_START | KW_TRANSACTION | KW_COMMIT | KW_ROLLBACK | KW_WORK | KW_ONLY | KW_WRITE | KW_ISOLATION | KW_LEVEL | KW_SNAPSHOT | KW_AUTOCOMMIT | KW_CACHE | KW_PRIMARY | KW_FOREIGN | KW_REFERENCES | KW_CONSTRAINT | KW_FORCE | KW_ENFORCED | KW_VALIDATE | KW_NOVALIDATE | KW_RELY | KW_NORELY | KW_UNIQUE | KW_KEY | KW_ABORT | KW_EXTRACT | KW_FLOOR | KW_MERGE | KW_MATCHED | KW_REPL | KW_DUMP | KW_STATUS | KW_VECTORIZATION | KW_SUMMARY | KW_OPERATOR | KW_EXPRESSION | KW_DETAIL | KW_WAIT | KW_RESOURCE | KW_PLAN | KW_QUERY_PARALLELISM | KW_PLANS | KW_ACTIVATE | KW_DEFAULT | KW_CHECK | KW_POOL | KW_MOVE | KW_DO | KW_ALLOC_FRACTION | KW_SCHEDULING_POLICY | KW_SCHEDULED | KW_EVERY | KW_AT | KW_CRON | KW_PATH | KW_MAPPING | KW_WORKLOAD | KW_MANAGEMENT | KW_ACTIVE | KW_UNMANAGED | KW_APPLICATION | KW_SYNC | KW_COST | KW_JOINCOST | DOT | COLON | COMMA | SEMICOLON | LPAREN | RPAREN | LSQUARE | RSQUARE | LCURLY | RCURLY | EQUAL | EQUAL_NS | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN | DIVIDE | PLUS | MINUS | STAR | MOD | DIV | AMPERSAND | TILDE | BITWISEOR | CONCATENATE | BITWISEXOR | QUESTION | DOLLAR | StringLiteral | CharSetLiteral | IntegralLiteral | NumberLiteral | ByteLengthLiteral | Number | Identifier | CharSetName | WS | LINE_COMMENT | QUERY_HINT )
		int alt36=386;
		alt36 = dfa36.predict(input);
		switch (alt36) {
			case 1 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:10: KW_TRUE
				{
				mKW_TRUE(); 

				}
				break;
			case 2 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:18: KW_FALSE
				{
				mKW_FALSE(); 

				}
				break;
			case 3 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:27: KW_ALL
				{
				mKW_ALL(); 

				}
				break;
			case 4 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:34: KW_NONE
				{
				mKW_NONE(); 

				}
				break;
			case 5 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:42: KW_AND
				{
				mKW_AND(); 

				}
				break;
			case 6 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:49: KW_OR
				{
				mKW_OR(); 

				}
				break;
			case 7 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:55: KW_NOT
				{
				mKW_NOT(); 

				}
				break;
			case 8 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:62: KW_LIKE
				{
				mKW_LIKE(); 

				}
				break;
			case 9 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:70: KW_ANY
				{
				mKW_ANY(); 

				}
				break;
			case 10 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:77: KW_IF
				{
				mKW_IF(); 

				}
				break;
			case 11 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:83: KW_EXISTS
				{
				mKW_EXISTS(); 

				}
				break;
			case 12 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:93: KW_ASC
				{
				mKW_ASC(); 

				}
				break;
			case 13 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:100: KW_DESC
				{
				mKW_DESC(); 

				}
				break;
			case 14 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:108: KW_NULLS
				{
				mKW_NULLS(); 

				}
				break;
			case 15 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:117: KW_LAST
				{
				mKW_LAST(); 

				}
				break;
			case 16 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:125: KW_ORDER
				{
				mKW_ORDER(); 

				}
				break;
			case 17 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:134: KW_GROUP
				{
				mKW_GROUP(); 

				}
				break;
			case 18 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:143: KW_BY
				{
				mKW_BY(); 

				}
				break;
			case 19 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:149: KW_HAVING
				{
				mKW_HAVING(); 

				}
				break;
			case 20 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:159: KW_WHERE
				{
				mKW_WHERE(); 

				}
				break;
			case 21 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:168: KW_FROM
				{
				mKW_FROM(); 

				}
				break;
			case 22 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:176: KW_AS
				{
				mKW_AS(); 

				}
				break;
			case 23 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:182: KW_SELECT
				{
				mKW_SELECT(); 

				}
				break;
			case 24 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:192: KW_DISTINCT
				{
				mKW_DISTINCT(); 

				}
				break;
			case 25 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:204: KW_INSERT
				{
				mKW_INSERT(); 

				}
				break;
			case 26 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:214: KW_OVERWRITE
				{
				mKW_OVERWRITE(); 

				}
				break;
			case 27 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:227: KW_OUTER
				{
				mKW_OUTER(); 

				}
				break;
			case 28 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:236: KW_UNIQUEJOIN
				{
				mKW_UNIQUEJOIN(); 

				}
				break;
			case 29 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:250: KW_PRESERVE
				{
				mKW_PRESERVE(); 

				}
				break;
			case 30 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:262: KW_JOIN
				{
				mKW_JOIN(); 

				}
				break;
			case 31 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:270: KW_LEFT
				{
				mKW_LEFT(); 

				}
				break;
			case 32 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:278: KW_RIGHT
				{
				mKW_RIGHT(); 

				}
				break;
			case 33 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:287: KW_FULL
				{
				mKW_FULL(); 

				}
				break;
			case 34 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:295: KW_ON
				{
				mKW_ON(); 

				}
				break;
			case 35 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:301: KW_PARTITION
				{
				mKW_PARTITION(); 

				}
				break;
			case 36 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:314: KW_PARTITIONS
				{
				mKW_PARTITIONS(); 

				}
				break;
			case 37 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:328: KW_TABLE
				{
				mKW_TABLE(); 

				}
				break;
			case 38 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:337: KW_TABLES
				{
				mKW_TABLES(); 

				}
				break;
			case 39 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:347: KW_COLUMNS
				{
				mKW_COLUMNS(); 

				}
				break;
			case 40 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:358: KW_INDEX
				{
				mKW_INDEX(); 

				}
				break;
			case 41 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:367: KW_INDEXES
				{
				mKW_INDEXES(); 

				}
				break;
			case 42 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:378: KW_REBUILD
				{
				mKW_REBUILD(); 

				}
				break;
			case 43 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:389: KW_FUNCTIONS
				{
				mKW_FUNCTIONS(); 

				}
				break;
			case 44 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:402: KW_SHOW
				{
				mKW_SHOW(); 

				}
				break;
			case 45 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:410: KW_MSCK
				{
				mKW_MSCK(); 

				}
				break;
			case 46 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:418: KW_REPAIR
				{
				mKW_REPAIR(); 

				}
				break;
			case 47 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:428: KW_DIRECTORY
				{
				mKW_DIRECTORY(); 

				}
				break;
			case 48 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:441: KW_LOCAL
				{
				mKW_LOCAL(); 

				}
				break;
			case 49 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:450: KW_TRANSFORM
				{
				mKW_TRANSFORM(); 

				}
				break;
			case 50 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:463: KW_USING
				{
				mKW_USING(); 

				}
				break;
			case 51 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:472: KW_CLUSTER
				{
				mKW_CLUSTER(); 

				}
				break;
			case 52 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:483: KW_DISTRIBUTE
				{
				mKW_DISTRIBUTE(); 

				}
				break;
			case 53 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:497: KW_SORT
				{
				mKW_SORT(); 

				}
				break;
			case 54 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:505: KW_UNION
				{
				mKW_UNION(); 

				}
				break;
			case 55 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:514: KW_EXCEPT
				{
				mKW_EXCEPT(); 

				}
				break;
			case 56 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:524: KW_LOAD
				{
				mKW_LOAD(); 

				}
				break;
			case 57 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:532: KW_EXPORT
				{
				mKW_EXPORT(); 

				}
				break;
			case 58 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:542: KW_IMPORT
				{
				mKW_IMPORT(); 

				}
				break;
			case 59 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:552: KW_REPLICATION
				{
				mKW_REPLICATION(); 

				}
				break;
			case 60 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:567: KW_METADATA
				{
				mKW_METADATA(); 

				}
				break;
			case 61 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:579: KW_DATA
				{
				mKW_DATA(); 

				}
				break;
			case 62 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:587: KW_INPATH
				{
				mKW_INPATH(); 

				}
				break;
			case 63 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:597: KW_IS
				{
				mKW_IS(); 

				}
				break;
			case 64 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:603: KW_NULL
				{
				mKW_NULL(); 

				}
				break;
			case 65 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:611: KW_CREATE
				{
				mKW_CREATE(); 

				}
				break;
			case 66 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:621: KW_EXTERNAL
				{
				mKW_EXTERNAL(); 

				}
				break;
			case 67 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:633: KW_ALTER
				{
				mKW_ALTER(); 

				}
				break;
			case 68 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:642: KW_CHANGE
				{
				mKW_CHANGE(); 

				}
				break;
			case 69 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:652: KW_COLUMN
				{
				mKW_COLUMN(); 

				}
				break;
			case 70 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:662: KW_FIRST
				{
				mKW_FIRST(); 

				}
				break;
			case 71 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:671: KW_AFTER
				{
				mKW_AFTER(); 

				}
				break;
			case 72 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:680: KW_DESCRIBE
				{
				mKW_DESCRIBE(); 

				}
				break;
			case 73 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:692: KW_DROP
				{
				mKW_DROP(); 

				}
				break;
			case 74 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:700: KW_RENAME
				{
				mKW_RENAME(); 

				}
				break;
			case 75 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:710: KW_TO
				{
				mKW_TO(); 

				}
				break;
			case 76 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:716: KW_COMMENT
				{
				mKW_COMMENT(); 

				}
				break;
			case 77 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:727: KW_BOOLEAN
				{
				mKW_BOOLEAN(); 

				}
				break;
			case 78 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:738: KW_TINYINT
				{
				mKW_TINYINT(); 

				}
				break;
			case 79 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:749: KW_SMALLINT
				{
				mKW_SMALLINT(); 

				}
				break;
			case 80 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:761: KW_INT
				{
				mKW_INT(); 

				}
				break;
			case 81 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:768: KW_BIGINT
				{
				mKW_BIGINT(); 

				}
				break;
			case 82 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:778: KW_FLOAT
				{
				mKW_FLOAT(); 

				}
				break;
			case 83 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:787: KW_DOUBLE
				{
				mKW_DOUBLE(); 

				}
				break;
			case 84 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:797: KW_PRECISION
				{
				mKW_PRECISION(); 

				}
				break;
			case 85 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:810: KW_DATE
				{
				mKW_DATE(); 

				}
				break;
			case 86 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:818: KW_DATETIME
				{
				mKW_DATETIME(); 

				}
				break;
			case 87 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:830: KW_TIMESTAMP
				{
				mKW_TIMESTAMP(); 

				}
				break;
			case 88 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:843: KW_TIMESTAMPLOCALTZ
				{
				mKW_TIMESTAMPLOCALTZ(); 

				}
				break;
			case 89 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:863: KW_TIME
				{
				mKW_TIME(); 

				}
				break;
			case 90 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:871: KW_ZONE
				{
				mKW_ZONE(); 

				}
				break;
			case 91 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:879: KW_INTERVAL
				{
				mKW_INTERVAL(); 

				}
				break;
			case 92 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:891: KW_DECIMAL
				{
				mKW_DECIMAL(); 

				}
				break;
			case 93 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:902: KW_STRING
				{
				mKW_STRING(); 

				}
				break;
			case 94 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:912: KW_CHAR
				{
				mKW_CHAR(); 

				}
				break;
			case 95 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:920: KW_VARCHAR
				{
				mKW_VARCHAR(); 

				}
				break;
			case 96 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:931: KW_ARRAY
				{
				mKW_ARRAY(); 

				}
				break;
			case 97 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:940: KW_STRUCT
				{
				mKW_STRUCT(); 

				}
				break;
			case 98 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:950: KW_MAP
				{
				mKW_MAP(); 

				}
				break;
			case 99 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:957: KW_UNIONTYPE
				{
				mKW_UNIONTYPE(); 

				}
				break;
			case 100 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:970: KW_REDUCE
				{
				mKW_REDUCE(); 

				}
				break;
			case 101 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:980: KW_PARTITIONED
				{
				mKW_PARTITIONED(); 

				}
				break;
			case 102 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:995: KW_CLUSTERED
				{
				mKW_CLUSTERED(); 

				}
				break;
			case 103 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1008: KW_DISTRIBUTED
				{
				mKW_DISTRIBUTED(); 

				}
				break;
			case 104 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1023: KW_SORTED
				{
				mKW_SORTED(); 

				}
				break;
			case 105 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1033: KW_INTO
				{
				mKW_INTO(); 

				}
				break;
			case 106 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1041: KW_BUCKETS
				{
				mKW_BUCKETS(); 

				}
				break;
			case 107 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1052: KW_ROW
				{
				mKW_ROW(); 

				}
				break;
			case 108 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1059: KW_ROWS
				{
				mKW_ROWS(); 

				}
				break;
			case 109 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1067: KW_FORMAT
				{
				mKW_FORMAT(); 

				}
				break;
			case 110 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1077: KW_DELIMITED
				{
				mKW_DELIMITED(); 

				}
				break;
			case 111 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1090: KW_FIELDS
				{
				mKW_FIELDS(); 

				}
				break;
			case 112 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1100: KW_TERMINATED
				{
				mKW_TERMINATED(); 

				}
				break;
			case 113 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1114: KW_ESCAPED
				{
				mKW_ESCAPED(); 

				}
				break;
			case 114 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1125: KW_COLLECTION
				{
				mKW_COLLECTION(); 

				}
				break;
			case 115 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1139: KW_ITEMS
				{
				mKW_ITEMS(); 

				}
				break;
			case 116 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1148: KW_KEYS
				{
				mKW_KEYS(); 

				}
				break;
			case 117 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1156: KW_KEY_TYPE
				{
				mKW_KEY_TYPE(); 

				}
				break;
			case 118 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1168: KW_KILL
				{
				mKW_KILL(); 

				}
				break;
			case 119 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1176: KW_LINES
				{
				mKW_LINES(); 

				}
				break;
			case 120 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1185: KW_STORED
				{
				mKW_STORED(); 

				}
				break;
			case 121 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1195: KW_FILEFORMAT
				{
				mKW_FILEFORMAT(); 

				}
				break;
			case 122 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1209: KW_INPUTFORMAT
				{
				mKW_INPUTFORMAT(); 

				}
				break;
			case 123 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1224: KW_OUTPUTFORMAT
				{
				mKW_OUTPUTFORMAT(); 

				}
				break;
			case 124 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1240: KW_INPUTDRIVER
				{
				mKW_INPUTDRIVER(); 

				}
				break;
			case 125 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1255: KW_OUTPUTDRIVER
				{
				mKW_OUTPUTDRIVER(); 

				}
				break;
			case 126 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1271: KW_ENABLE
				{
				mKW_ENABLE(); 

				}
				break;
			case 127 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1281: KW_DISABLE
				{
				mKW_DISABLE(); 

				}
				break;
			case 128 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1292: KW_EXECUTED
				{
				mKW_EXECUTED(); 

				}
				break;
			case 129 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1304: KW_EXECUTE
				{
				mKW_EXECUTE(); 

				}
				break;
			case 130 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1315: KW_LOCATION
				{
				mKW_LOCATION(); 

				}
				break;
			case 131 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1327: KW_MANAGEDLOCATION
				{
				mKW_MANAGEDLOCATION(); 

				}
				break;
			case 132 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1346: KW_TABLESAMPLE
				{
				mKW_TABLESAMPLE(); 

				}
				break;
			case 133 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1361: KW_BUCKET
				{
				mKW_BUCKET(); 

				}
				break;
			case 134 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1371: KW_OUT
				{
				mKW_OUT(); 

				}
				break;
			case 135 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1378: KW_OF
				{
				mKW_OF(); 

				}
				break;
			case 136 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1384: KW_PERCENT
				{
				mKW_PERCENT(); 

				}
				break;
			case 137 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1395: KW_CAST
				{
				mKW_CAST(); 

				}
				break;
			case 138 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1403: KW_ADD
				{
				mKW_ADD(); 

				}
				break;
			case 139 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1410: KW_REPLACE
				{
				mKW_REPLACE(); 

				}
				break;
			case 140 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1421: KW_RLIKE
				{
				mKW_RLIKE(); 

				}
				break;
			case 141 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1430: KW_REGEXP
				{
				mKW_REGEXP(); 

				}
				break;
			case 142 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1440: KW_TEMPORARY
				{
				mKW_TEMPORARY(); 

				}
				break;
			case 143 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1453: KW_FUNCTION
				{
				mKW_FUNCTION(); 

				}
				break;
			case 144 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1465: KW_MACRO
				{
				mKW_MACRO(); 

				}
				break;
			case 145 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1474: KW_FILE
				{
				mKW_FILE(); 

				}
				break;
			case 146 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1482: KW_JAR
				{
				mKW_JAR(); 

				}
				break;
			case 147 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1489: KW_EXPLAIN
				{
				mKW_EXPLAIN(); 

				}
				break;
			case 148 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1500: KW_EXTENDED
				{
				mKW_EXTENDED(); 

				}
				break;
			case 149 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1512: KW_DEBUG
				{
				mKW_DEBUG(); 

				}
				break;
			case 150 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1521: KW_FORMATTED
				{
				mKW_FORMATTED(); 

				}
				break;
			case 151 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1534: KW_DEPENDENCY
				{
				mKW_DEPENDENCY(); 

				}
				break;
			case 152 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1548: KW_LOGICAL
				{
				mKW_LOGICAL(); 

				}
				break;
			case 153 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1559: KW_CBO
				{
				mKW_CBO(); 

				}
				break;
			case 154 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1566: KW_SERDE
				{
				mKW_SERDE(); 

				}
				break;
			case 155 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1575: KW_WITH
				{
				mKW_WITH(); 

				}
				break;
			case 156 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1583: KW_DEFERRED
				{
				mKW_DEFERRED(); 

				}
				break;
			case 157 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1595: KW_SERDEPROPERTIES
				{
				mKW_SERDEPROPERTIES(); 

				}
				break;
			case 158 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1614: KW_DBPROPERTIES
				{
				mKW_DBPROPERTIES(); 

				}
				break;
			case 159 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1630: KW_LIMIT
				{
				mKW_LIMIT(); 

				}
				break;
			case 160 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1639: KW_OFFSET
				{
				mKW_OFFSET(); 

				}
				break;
			case 161 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1649: KW_SET
				{
				mKW_SET(); 

				}
				break;
			case 162 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1656: KW_UNSET
				{
				mKW_UNSET(); 

				}
				break;
			case 163 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1665: KW_TBLPROPERTIES
				{
				mKW_TBLPROPERTIES(); 

				}
				break;
			case 164 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1682: KW_IDXPROPERTIES
				{
				mKW_IDXPROPERTIES(); 

				}
				break;
			case 165 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1699: KW_VALUE_TYPE
				{
				mKW_VALUE_TYPE(); 

				}
				break;
			case 166 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1713: KW_ELEM_TYPE
				{
				mKW_ELEM_TYPE(); 

				}
				break;
			case 167 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1726: KW_DEFINED
				{
				mKW_DEFINED(); 

				}
				break;
			case 168 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1737: KW_CASE
				{
				mKW_CASE(); 

				}
				break;
			case 169 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1745: KW_WHEN
				{
				mKW_WHEN(); 

				}
				break;
			case 170 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1753: KW_THEN
				{
				mKW_THEN(); 

				}
				break;
			case 171 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1761: KW_ELSE
				{
				mKW_ELSE(); 

				}
				break;
			case 172 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1769: KW_END
				{
				mKW_END(); 

				}
				break;
			case 173 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1776: KW_MAPJOIN
				{
				mKW_MAPJOIN(); 

				}
				break;
			case 174 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1787: KW_STREAMTABLE
				{
				mKW_STREAMTABLE(); 

				}
				break;
			case 175 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1802: KW_CLUSTERSTATUS
				{
				mKW_CLUSTERSTATUS(); 

				}
				break;
			case 176 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1819: KW_UTC
				{
				mKW_UTC(); 

				}
				break;
			case 177 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1826: KW_UTCTIMESTAMP
				{
				mKW_UTCTIMESTAMP(); 

				}
				break;
			case 178 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1842: KW_LONG
				{
				mKW_LONG(); 

				}
				break;
			case 179 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1850: KW_DELETE
				{
				mKW_DELETE(); 

				}
				break;
			case 180 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1860: KW_PLUS
				{
				mKW_PLUS(); 

				}
				break;
			case 181 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1868: KW_MINUS
				{
				mKW_MINUS(); 

				}
				break;
			case 182 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1877: KW_FETCH
				{
				mKW_FETCH(); 

				}
				break;
			case 183 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1886: KW_INTERSECT
				{
				mKW_INTERSECT(); 

				}
				break;
			case 184 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1899: KW_VIEW
				{
				mKW_VIEW(); 

				}
				break;
			case 185 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1907: KW_VIEWS
				{
				mKW_VIEWS(); 

				}
				break;
			case 186 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1916: KW_IN
				{
				mKW_IN(); 

				}
				break;
			case 187 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1922: KW_DATABASE
				{
				mKW_DATABASE(); 

				}
				break;
			case 188 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1934: KW_DATABASES
				{
				mKW_DATABASES(); 

				}
				break;
			case 189 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1947: KW_MATERIALIZED
				{
				mKW_MATERIALIZED(); 

				}
				break;
			case 190 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1963: KW_SCHEMA
				{
				mKW_SCHEMA(); 

				}
				break;
			case 191 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1973: KW_SCHEMAS
				{
				mKW_SCHEMAS(); 

				}
				break;
			case 192 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1984: KW_GRANT
				{
				mKW_GRANT(); 

				}
				break;
			case 193 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:1993: KW_REVOKE
				{
				mKW_REVOKE(); 

				}
				break;
			case 194 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2003: KW_SSL
				{
				mKW_SSL(); 

				}
				break;
			case 195 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2010: KW_UNDO
				{
				mKW_UNDO(); 

				}
				break;
			case 196 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2018: KW_LOCK
				{
				mKW_LOCK(); 

				}
				break;
			case 197 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2026: KW_LOCKS
				{
				mKW_LOCKS(); 

				}
				break;
			case 198 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2035: KW_UNLOCK
				{
				mKW_UNLOCK(); 

				}
				break;
			case 199 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2045: KW_SHARED
				{
				mKW_SHARED(); 

				}
				break;
			case 200 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2055: KW_EXCLUSIVE
				{
				mKW_EXCLUSIVE(); 

				}
				break;
			case 201 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2068: KW_PROCEDURE
				{
				mKW_PROCEDURE(); 

				}
				break;
			case 202 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2081: KW_UNSIGNED
				{
				mKW_UNSIGNED(); 

				}
				break;
			case 203 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2093: KW_WHILE
				{
				mKW_WHILE(); 

				}
				break;
			case 204 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2102: KW_READ
				{
				mKW_READ(); 

				}
				break;
			case 205 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2110: KW_READS
				{
				mKW_READS(); 

				}
				break;
			case 206 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2119: KW_PURGE
				{
				mKW_PURGE(); 

				}
				break;
			case 207 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2128: KW_RANGE
				{
				mKW_RANGE(); 

				}
				break;
			case 208 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2137: KW_ANALYZE
				{
				mKW_ANALYZE(); 

				}
				break;
			case 209 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2148: KW_BEFORE
				{
				mKW_BEFORE(); 

				}
				break;
			case 210 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2158: KW_BETWEEN
				{
				mKW_BETWEEN(); 

				}
				break;
			case 211 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2169: KW_BOTH
				{
				mKW_BOTH(); 

				}
				break;
			case 212 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2177: KW_BINARY
				{
				mKW_BINARY(); 

				}
				break;
			case 213 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2187: KW_CROSS
				{
				mKW_CROSS(); 

				}
				break;
			case 214 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2196: KW_CONTINUE
				{
				mKW_CONTINUE(); 

				}
				break;
			case 215 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2208: KW_CURSOR
				{
				mKW_CURSOR(); 

				}
				break;
			case 216 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2218: KW_TRIGGER
				{
				mKW_TRIGGER(); 

				}
				break;
			case 217 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2229: KW_RECORDREADER
				{
				mKW_RECORDREADER(); 

				}
				break;
			case 218 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2245: KW_RECORDWRITER
				{
				mKW_RECORDWRITER(); 

				}
				break;
			case 219 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2261: KW_SEMI
				{
				mKW_SEMI(); 

				}
				break;
			case 220 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2269: KW_LATERAL
				{
				mKW_LATERAL(); 

				}
				break;
			case 221 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2280: KW_TOUCH
				{
				mKW_TOUCH(); 

				}
				break;
			case 222 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2289: KW_ARCHIVE
				{
				mKW_ARCHIVE(); 

				}
				break;
			case 223 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2300: KW_UNARCHIVE
				{
				mKW_UNARCHIVE(); 

				}
				break;
			case 224 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2313: KW_COMPUTE
				{
				mKW_COMPUTE(); 

				}
				break;
			case 225 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2324: KW_STATISTICS
				{
				mKW_STATISTICS(); 

				}
				break;
			case 226 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2338: KW_USE
				{
				mKW_USE(); 

				}
				break;
			case 227 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2345: KW_OPTION
				{
				mKW_OPTION(); 

				}
				break;
			case 228 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2355: KW_CONCATENATE
				{
				mKW_CONCATENATE(); 

				}
				break;
			case 229 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2370: KW_SHOW_DATABASE
				{
				mKW_SHOW_DATABASE(); 

				}
				break;
			case 230 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2387: KW_UPDATE
				{
				mKW_UPDATE(); 

				}
				break;
			case 231 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2397: KW_RESTRICT
				{
				mKW_RESTRICT(); 

				}
				break;
			case 232 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2409: KW_CASCADE
				{
				mKW_CASCADE(); 

				}
				break;
			case 233 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2420: KW_SKEWED
				{
				mKW_SKEWED(); 

				}
				break;
			case 234 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2430: KW_ROLLUP
				{
				mKW_ROLLUP(); 

				}
				break;
			case 235 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2440: KW_CUBE
				{
				mKW_CUBE(); 

				}
				break;
			case 236 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2448: KW_DIRECTORIES
				{
				mKW_DIRECTORIES(); 

				}
				break;
			case 237 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2463: KW_FOR
				{
				mKW_FOR(); 

				}
				break;
			case 238 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2470: KW_WINDOW
				{
				mKW_WINDOW(); 

				}
				break;
			case 239 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2480: KW_UNBOUNDED
				{
				mKW_UNBOUNDED(); 

				}
				break;
			case 240 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2493: KW_PRECEDING
				{
				mKW_PRECEDING(); 

				}
				break;
			case 241 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2506: KW_FOLLOWING
				{
				mKW_FOLLOWING(); 

				}
				break;
			case 242 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2519: KW_CURRENT
				{
				mKW_CURRENT(); 

				}
				break;
			case 243 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2530: KW_CURRENT_DATE
				{
				mKW_CURRENT_DATE(); 

				}
				break;
			case 244 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2546: KW_CURRENT_TIMESTAMP
				{
				mKW_CURRENT_TIMESTAMP(); 

				}
				break;
			case 245 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2567: KW_LESS
				{
				mKW_LESS(); 

				}
				break;
			case 246 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2575: KW_MORE
				{
				mKW_MORE(); 

				}
				break;
			case 247 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2583: KW_OVER
				{
				mKW_OVER(); 

				}
				break;
			case 248 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2591: KW_GROUPING
				{
				mKW_GROUPING(); 

				}
				break;
			case 249 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2603: KW_SETS
				{
				mKW_SETS(); 

				}
				break;
			case 250 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2611: KW_TRUNCATE
				{
				mKW_TRUNCATE(); 

				}
				break;
			case 251 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2623: KW_NOSCAN
				{
				mKW_NOSCAN(); 

				}
				break;
			case 252 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2633: KW_USER
				{
				mKW_USER(); 

				}
				break;
			case 253 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2641: KW_ROLE
				{
				mKW_ROLE(); 

				}
				break;
			case 254 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2649: KW_ROLES
				{
				mKW_ROLES(); 

				}
				break;
			case 255 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2658: KW_INNER
				{
				mKW_INNER(); 

				}
				break;
			case 256 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2667: KW_EXCHANGE
				{
				mKW_EXCHANGE(); 

				}
				break;
			case 257 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2679: KW_URI
				{
				mKW_URI(); 

				}
				break;
			case 258 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2686: KW_SERVER
				{
				mKW_SERVER(); 

				}
				break;
			case 259 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2696: KW_ADMIN
				{
				mKW_ADMIN(); 

				}
				break;
			case 260 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2705: KW_OWNER
				{
				mKW_OWNER(); 

				}
				break;
			case 261 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2714: KW_PRINCIPALS
				{
				mKW_PRINCIPALS(); 

				}
				break;
			case 262 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2728: KW_COMPACT
				{
				mKW_COMPACT(); 

				}
				break;
			case 263 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2739: KW_COMPACTIONS
				{
				mKW_COMPACTIONS(); 

				}
				break;
			case 264 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2754: KW_TRANSACTIONS
				{
				mKW_TRANSACTIONS(); 

				}
				break;
			case 265 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2770: KW_TRANSACTIONAL
				{
				mKW_TRANSACTIONAL(); 

				}
				break;
			case 266 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2787: KW_REWRITE
				{
				mKW_REWRITE(); 

				}
				break;
			case 267 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2798: KW_AUTHORIZATION
				{
				mKW_AUTHORIZATION(); 

				}
				break;
			case 268 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2815: KW_REOPTIMIZATION
				{
				mKW_REOPTIMIZATION(); 

				}
				break;
			case 269 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2833: KW_CONF
				{
				mKW_CONF(); 

				}
				break;
			case 270 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2841: KW_VALUES
				{
				mKW_VALUES(); 

				}
				break;
			case 271 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2851: KW_RELOAD
				{
				mKW_RELOAD(); 

				}
				break;
			case 272 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2861: KW_YEAR
				{
				mKW_YEAR(); 

				}
				break;
			case 273 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2869: KW_QUERY
				{
				mKW_QUERY(); 

				}
				break;
			case 274 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2878: KW_QUARTER
				{
				mKW_QUARTER(); 

				}
				break;
			case 275 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2889: KW_MONTH
				{
				mKW_MONTH(); 

				}
				break;
			case 276 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2898: KW_WEEK
				{
				mKW_WEEK(); 

				}
				break;
			case 277 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2906: KW_DAY
				{
				mKW_DAY(); 

				}
				break;
			case 278 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2913: KW_DOW
				{
				mKW_DOW(); 

				}
				break;
			case 279 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2920: KW_HOUR
				{
				mKW_HOUR(); 

				}
				break;
			case 280 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2928: KW_MINUTE
				{
				mKW_MINUTE(); 

				}
				break;
			case 281 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2938: KW_SECOND
				{
				mKW_SECOND(); 

				}
				break;
			case 282 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2948: KW_START
				{
				mKW_START(); 

				}
				break;
			case 283 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2957: KW_TRANSACTION
				{
				mKW_TRANSACTION(); 

				}
				break;
			case 284 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2972: KW_COMMIT
				{
				mKW_COMMIT(); 

				}
				break;
			case 285 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2982: KW_ROLLBACK
				{
				mKW_ROLLBACK(); 

				}
				break;
			case 286 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:2994: KW_WORK
				{
				mKW_WORK(); 

				}
				break;
			case 287 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3002: KW_ONLY
				{
				mKW_ONLY(); 

				}
				break;
			case 288 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3010: KW_WRITE
				{
				mKW_WRITE(); 

				}
				break;
			case 289 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3019: KW_ISOLATION
				{
				mKW_ISOLATION(); 

				}
				break;
			case 290 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3032: KW_LEVEL
				{
				mKW_LEVEL(); 

				}
				break;
			case 291 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3041: KW_SNAPSHOT
				{
				mKW_SNAPSHOT(); 

				}
				break;
			case 292 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3053: KW_AUTOCOMMIT
				{
				mKW_AUTOCOMMIT(); 

				}
				break;
			case 293 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3067: KW_CACHE
				{
				mKW_CACHE(); 

				}
				break;
			case 294 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3076: KW_PRIMARY
				{
				mKW_PRIMARY(); 

				}
				break;
			case 295 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3087: KW_FOREIGN
				{
				mKW_FOREIGN(); 

				}
				break;
			case 296 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3098: KW_REFERENCES
				{
				mKW_REFERENCES(); 

				}
				break;
			case 297 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3112: KW_CONSTRAINT
				{
				mKW_CONSTRAINT(); 

				}
				break;
			case 298 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3126: KW_FORCE
				{
				mKW_FORCE(); 

				}
				break;
			case 299 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3135: KW_ENFORCED
				{
				mKW_ENFORCED(); 

				}
				break;
			case 300 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3147: KW_VALIDATE
				{
				mKW_VALIDATE(); 

				}
				break;
			case 301 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3159: KW_NOVALIDATE
				{
				mKW_NOVALIDATE(); 

				}
				break;
			case 302 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3173: KW_RELY
				{
				mKW_RELY(); 

				}
				break;
			case 303 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3181: KW_NORELY
				{
				mKW_NORELY(); 

				}
				break;
			case 304 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3191: KW_UNIQUE
				{
				mKW_UNIQUE(); 

				}
				break;
			case 305 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3201: KW_KEY
				{
				mKW_KEY(); 

				}
				break;
			case 306 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3208: KW_ABORT
				{
				mKW_ABORT(); 

				}
				break;
			case 307 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3217: KW_EXTRACT
				{
				mKW_EXTRACT(); 

				}
				break;
			case 308 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3228: KW_FLOOR
				{
				mKW_FLOOR(); 

				}
				break;
			case 309 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3237: KW_MERGE
				{
				mKW_MERGE(); 

				}
				break;
			case 310 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3246: KW_MATCHED
				{
				mKW_MATCHED(); 

				}
				break;
			case 311 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3257: KW_REPL
				{
				mKW_REPL(); 

				}
				break;
			case 312 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3265: KW_DUMP
				{
				mKW_DUMP(); 

				}
				break;
			case 313 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3273: KW_STATUS
				{
				mKW_STATUS(); 

				}
				break;
			case 314 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3283: KW_VECTORIZATION
				{
				mKW_VECTORIZATION(); 

				}
				break;
			case 315 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3300: KW_SUMMARY
				{
				mKW_SUMMARY(); 

				}
				break;
			case 316 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3311: KW_OPERATOR
				{
				mKW_OPERATOR(); 

				}
				break;
			case 317 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3323: KW_EXPRESSION
				{
				mKW_EXPRESSION(); 

				}
				break;
			case 318 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3337: KW_DETAIL
				{
				mKW_DETAIL(); 

				}
				break;
			case 319 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3347: KW_WAIT
				{
				mKW_WAIT(); 

				}
				break;
			case 320 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3355: KW_RESOURCE
				{
				mKW_RESOURCE(); 

				}
				break;
			case 321 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3367: KW_PLAN
				{
				mKW_PLAN(); 

				}
				break;
			case 322 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3375: KW_QUERY_PARALLELISM
				{
				mKW_QUERY_PARALLELISM(); 

				}
				break;
			case 323 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3396: KW_PLANS
				{
				mKW_PLANS(); 

				}
				break;
			case 324 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3405: KW_ACTIVATE
				{
				mKW_ACTIVATE(); 

				}
				break;
			case 325 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3417: KW_DEFAULT
				{
				mKW_DEFAULT(); 

				}
				break;
			case 326 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3428: KW_CHECK
				{
				mKW_CHECK(); 

				}
				break;
			case 327 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3437: KW_POOL
				{
				mKW_POOL(); 

				}
				break;
			case 328 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3445: KW_MOVE
				{
				mKW_MOVE(); 

				}
				break;
			case 329 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3453: KW_DO
				{
				mKW_DO(); 

				}
				break;
			case 330 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3459: KW_ALLOC_FRACTION
				{
				mKW_ALLOC_FRACTION(); 

				}
				break;
			case 331 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3477: KW_SCHEDULING_POLICY
				{
				mKW_SCHEDULING_POLICY(); 

				}
				break;
			case 332 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3498: KW_SCHEDULED
				{
				mKW_SCHEDULED(); 

				}
				break;
			case 333 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3511: KW_EVERY
				{
				mKW_EVERY(); 

				}
				break;
			case 334 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3520: KW_AT
				{
				mKW_AT(); 

				}
				break;
			case 335 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3526: KW_CRON
				{
				mKW_CRON(); 

				}
				break;
			case 336 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3534: KW_PATH
				{
				mKW_PATH(); 

				}
				break;
			case 337 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3542: KW_MAPPING
				{
				mKW_MAPPING(); 

				}
				break;
			case 338 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3553: KW_WORKLOAD
				{
				mKW_WORKLOAD(); 

				}
				break;
			case 339 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3565: KW_MANAGEMENT
				{
				mKW_MANAGEMENT(); 

				}
				break;
			case 340 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3579: KW_ACTIVE
				{
				mKW_ACTIVE(); 

				}
				break;
			case 341 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3589: KW_UNMANAGED
				{
				mKW_UNMANAGED(); 

				}
				break;
			case 342 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3602: KW_APPLICATION
				{
				mKW_APPLICATION(); 

				}
				break;
			case 343 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3617: KW_SYNC
				{
				mKW_SYNC(); 

				}
				break;
			case 344 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3625: KW_COST
				{
				mKW_COST(); 

				}
				break;
			case 345 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3633: KW_JOINCOST
				{
				mKW_JOINCOST(); 

				}
				break;
			case 346 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3645: DOT
				{
				mDOT(); 

				}
				break;
			case 347 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3649: COLON
				{
				mCOLON(); 

				}
				break;
			case 348 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3655: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 349 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3661: SEMICOLON
				{
				mSEMICOLON(); 

				}
				break;
			case 350 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3671: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 351 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3678: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 352 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3685: LSQUARE
				{
				mLSQUARE(); 

				}
				break;
			case 353 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3693: RSQUARE
				{
				mRSQUARE(); 

				}
				break;
			case 354 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3701: LCURLY
				{
				mLCURLY(); 

				}
				break;
			case 355 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3708: RCURLY
				{
				mRCURLY(); 

				}
				break;
			case 356 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3715: EQUAL
				{
				mEQUAL(); 

				}
				break;
			case 357 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3721: EQUAL_NS
				{
				mEQUAL_NS(); 

				}
				break;
			case 358 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3730: NOTEQUAL
				{
				mNOTEQUAL(); 

				}
				break;
			case 359 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3739: LESSTHANOREQUALTO
				{
				mLESSTHANOREQUALTO(); 

				}
				break;
			case 360 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3757: LESSTHAN
				{
				mLESSTHAN(); 

				}
				break;
			case 361 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3766: GREATERTHANOREQUALTO
				{
				mGREATERTHANOREQUALTO(); 

				}
				break;
			case 362 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3787: GREATERTHAN
				{
				mGREATERTHAN(); 

				}
				break;
			case 363 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3799: DIVIDE
				{
				mDIVIDE(); 

				}
				break;
			case 364 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3806: PLUS
				{
				mPLUS(); 

				}
				break;
			case 365 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3811: MINUS
				{
				mMINUS(); 

				}
				break;
			case 366 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3817: STAR
				{
				mSTAR(); 

				}
				break;
			case 367 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3822: MOD
				{
				mMOD(); 

				}
				break;
			case 368 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3826: DIV
				{
				mDIV(); 

				}
				break;
			case 369 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3830: AMPERSAND
				{
				mAMPERSAND(); 

				}
				break;
			case 370 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3840: TILDE
				{
				mTILDE(); 

				}
				break;
			case 371 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3846: BITWISEOR
				{
				mBITWISEOR(); 

				}
				break;
			case 372 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3856: CONCATENATE
				{
				mCONCATENATE(); 

				}
				break;
			case 373 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3868: BITWISEXOR
				{
				mBITWISEXOR(); 

				}
				break;
			case 374 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3879: QUESTION
				{
				mQUESTION(); 

				}
				break;
			case 375 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3888: DOLLAR
				{
				mDOLLAR(); 

				}
				break;
			case 376 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3895: StringLiteral
				{
				mStringLiteral(); 

				}
				break;
			case 377 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3909: CharSetLiteral
				{
				mCharSetLiteral(); 

				}
				break;
			case 378 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3924: IntegralLiteral
				{
				mIntegralLiteral(); 

				}
				break;
			case 379 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3940: NumberLiteral
				{
				mNumberLiteral(); 

				}
				break;
			case 380 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3954: ByteLengthLiteral
				{
				mByteLengthLiteral(); 

				}
				break;
			case 381 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3972: Number
				{
				mNumber(); 

				}
				break;
			case 382 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3979: Identifier
				{
				mIdentifier(); 

				}
				break;
			case 383 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:3990: CharSetName
				{
				mCharSetName(); 

				}
				break;
			case 384 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:4002: WS
				{
				mWS(); 

				}
				break;
			case 385 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:4005: LINE_COMMENT
				{
				mLINE_COMMENT(); 

				}
				break;
			case 386 :
				// org/apache/hadoop/hive/ql/parse/HiveLexer.g:1:4018: QUERY_HINT
				{
				mQUERY_HINT(); 

				}
				break;

		}
	}


	protected DFA31 dfa31 = new DFA31(this);
	protected DFA36 dfa36 = new DFA36(this);
	static final String DFA31_eotS =
		"\7\uffff";
	static final String DFA31_eofS =
		"\7\uffff";
	static final String DFA31_minS =
		"\1\60\1\uffff\1\0\1\uffff\2\0\1\uffff";
	static final String DFA31_maxS =
		"\1\172\1\uffff\1\uffff\1\uffff\1\uffff\1\0\1\uffff";
	static final String DFA31_acceptS =
		"\1\uffff\1\1\1\uffff\1\2\2\uffff\1\3";
	static final String DFA31_specialS =
		"\2\uffff\1\0\1\uffff\1\1\1\2\1\uffff}>";
	static final String[] DFA31_transitionS = {
			"\12\1\7\uffff\32\1\5\uffff\1\2\32\1",
			"",
			"\41\3\1\4\2\3\1\4\3\3\4\4\1\3\2\4\1\3\12\4\5\3\1\4\1\3\33\4\1\3\3\4"+
			"\1\3\35\4\uff82\3",
			"",
			"\41\3\1\4\2\3\1\4\3\3\4\4\1\3\2\4\1\3\12\4\5\3\1\4\1\3\33\4\1\3\3\4"+
			"\1\5\35\4\uff82\3",
			"\1\uffff",
			""
	};

	static final short[] DFA31_eot = DFA.unpackEncodedString(DFA31_eotS);
	static final short[] DFA31_eof = DFA.unpackEncodedString(DFA31_eofS);
	static final char[] DFA31_min = DFA.unpackEncodedStringToUnsignedChars(DFA31_minS);
	static final char[] DFA31_max = DFA.unpackEncodedStringToUnsignedChars(DFA31_maxS);
	static final short[] DFA31_accept = DFA.unpackEncodedString(DFA31_acceptS);
	static final short[] DFA31_special = DFA.unpackEncodedString(DFA31_specialS);
	static final short[][] DFA31_transition;

	static {
		int numStates = DFA31_transitionS.length;
		DFA31_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA31_transition[i] = DFA.unpackEncodedString(DFA31_transitionS[i]);
		}
	}

	protected class DFA31 extends DFA {

		public DFA31(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 31;
			this.eot = DFA31_eot;
			this.eof = DFA31_eof;
			this.min = DFA31_min;
			this.max = DFA31_max;
			this.accept = DFA31_accept;
			this.special = DFA31_special;
			this.transition = DFA31_transition;
		}
		@Override
		public String getDescription() {
			return "516:1: Identifier : ( ( Letter | Digit ) ( Letter | Digit | '_' )* |{...}? QuotedIdentifier | '`' ( RegexComponent )+ '`' );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA31_2 = input.LA(1);
						s = -1;
						if ( ((LA31_2 >= '\u0000' && LA31_2 <= ' ')||(LA31_2 >= '\"' && LA31_2 <= '#')||(LA31_2 >= '%' && LA31_2 <= '\'')||LA31_2==','||LA31_2=='/'||(LA31_2 >= ':' && LA31_2 <= '>')||LA31_2=='@'||LA31_2=='\\'||LA31_2=='`'||(LA31_2 >= '~' && LA31_2 <= '\uFFFF')) ) {s = 3;}
						else if ( (LA31_2=='!'||LA31_2=='$'||(LA31_2 >= '(' && LA31_2 <= '+')||(LA31_2 >= '-' && LA31_2 <= '.')||(LA31_2 >= '0' && LA31_2 <= '9')||LA31_2=='?'||(LA31_2 >= 'A' && LA31_2 <= '[')||(LA31_2 >= ']' && LA31_2 <= '_')||(LA31_2 >= 'a' && LA31_2 <= '}')) ) {s = 4;}
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA31_4 = input.LA(1);
						s = -1;
						if ( (LA31_4=='`') ) {s = 5;}
						else if ( (LA31_4=='!'||LA31_4=='$'||(LA31_4 >= '(' && LA31_4 <= '+')||(LA31_4 >= '-' && LA31_4 <= '.')||(LA31_4 >= '0' && LA31_4 <= '9')||LA31_4=='?'||(LA31_4 >= 'A' && LA31_4 <= '[')||(LA31_4 >= ']' && LA31_4 <= '_')||(LA31_4 >= 'a' && LA31_4 <= '}')) ) {s = 4;}
						else if ( ((LA31_4 >= '\u0000' && LA31_4 <= ' ')||(LA31_4 >= '\"' && LA31_4 <= '#')||(LA31_4 >= '%' && LA31_4 <= '\'')||LA31_4==','||LA31_4=='/'||(LA31_4 >= ':' && LA31_4 <= '>')||LA31_4=='@'||LA31_4=='\\'||(LA31_4 >= '~' && LA31_4 <= '\uFFFF')) ) {s = 3;}
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA31_5 = input.LA(1);
						 
						int index31_5 = input.index();
						input.rewind();
						s = -1;
						if ( ((allowQuotedId())) ) {s = 3;}
						else if ( (true) ) {s = 6;}
						 
						input.seek(index31_5);
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 31, _s, input);
			error(nvae);
			throw nvae;
		}
	}

	static final String DFA36_eotS =
		"\1\uffff\5\67\1\135\22\67\1\u00b4\2\67\13\uffff\1\u00b8\1\u00ba\1\u00bc"+
		"\1\uffff\1\u00be\4\uffff\1\u00c0\4\uffff\2\u00cc\3\uffff\2\67\1\u00d5"+
		"\15\67\1\u00ed\6\67\1\u00f6\3\67\1\u0100\2\67\1\u0104\1\u0106\2\67\2\uffff"+
		"\4\67\1\u0116\1\u011c\1\67\1\u011f\13\67\1\u013b\3\67\1\u0140\73\67\4"+
		"\uffff\2\67\1\u01b2\13\uffff\1\u01b4\2\uffff\1\u01b4\1\67\1\u01b7\2\u00cc"+
		"\1\67\1\uffff\1\u01ba\2\u01be\5\67\1\uffff\16\67\1\u01d7\2\67\1\u01db"+
		"\1\67\1\u01dd\1\u01de\1\67\1\u01e0\1\uffff\3\67\1\u01e4\4\67\1\uffff\2"+
		"\67\1\135\6\67\1\uffff\1\67\1\u01f5\1\67\1\uffff\1\67\1\uffff\17\67\1"+
		"\uffff\3\67\1\u020e\1\67\1\uffff\2\67\1\uffff\11\67\1\u0220\4\67\1\u0226"+
		"\7\67\1\u0232\1\67\1\u0237\2\67\1\uffff\4\67\1\uffff\23\67\1\u0254\12"+
		"\67\1\u0262\14\67\1\u0272\1\u0274\1\67\1\u0276\13\67\1\u0284\16\67\1\u0297"+
		"\16\67\1\u02b0\5\67\1\u02b9\14\67\1\u02c9\4\67\5\uffff\1\u02ce\1\uffff"+
		"\1\u00cc\3\uffff\1\u00cc\1\u01ba\1\uffff\1\u02d3\6\67\1\u02db\3\67\1\u02df"+
		"\1\67\1\u02e1\1\u02e2\3\67\1\u02e7\5\67\1\uffff\3\67\1\uffff\1\67\2\uffff"+
		"\1\67\1\uffff\3\67\1\uffff\6\67\1\u02fb\3\67\1\u0300\2\67\1\u0304\2\67"+
		"\1\uffff\1\u0307\4\67\1\u030c\2\67\1\u030f\1\67\1\u0311\1\u0312\2\67\1"+
		"\u0317\1\u0318\1\67\1\u031a\5\67\1\u0321\1\uffff\21\67\1\uffff\1\67\1"+
		"\u0335\1\67\1\u0338\1\67\1\uffff\13\67\1\uffff\1\u0347\1\u0349\1\u0237"+
		"\1\67\1\uffff\1\u034b\2\67\1\u034e\3\67\1\u0352\6\67\1\u035a\1\67\1\u035c"+
		"\1\67\1\u035e\1\67\1\u0361\1\u0363\1\67\1\u0365\3\67\1\u0369\1\uffff\1"+
		"\u036a\1\67\1\u036d\1\67\1\u0370\10\67\1\uffff\3\67\1\u037e\4\67\1\u0383"+
		"\5\67\1\u0389\1\uffff\1\67\1\uffff\1\67\1\uffff\6\67\1\u0393\1\67\1\u0395"+
		"\1\u0397\1\67\1\u0399\1\u039b\1\uffff\3\67\1\u03a1\4\67\1\u03a7\6\67\1"+
		"\u03ae\1\67\1\u03b0\1\uffff\1\67\1\u03b4\10\67\1\u03bf\1\67\1\u03c1\3"+
		"\67\1\u03c5\1\67\1\u03c7\1\67\1\u03c9\1\u03ca\2\67\1\uffff\2\67\1\u03cf"+
		"\1\u03d0\4\67\1\uffff\5\67\1\u03db\1\67\1\u03dd\1\u03de\3\67\1\u03e3\1"+
		"\67\1\u03e5\1\uffff\1\u03e6\1\u03e8\2\67\2\uffff\2\u00cc\1\67\1\uffff"+
		"\3\67\1\u03f0\1\u03f1\2\67\1\uffff\3\67\1\uffff\1\u03f7\2\uffff\1\67\1"+
		"\u03f9\2\67\1\uffff\1\u03fc\1\u03fd\2\67\1\u0400\1\67\1\u0402\1\67\1\u0404"+
		"\1\67\1\u0406\1\u0407\1\67\1\u0409\2\67\1\u040c\2\67\1\uffff\3\67\1\u0413"+
		"\1\uffff\1\67\1\u0415\1\67\1\uffff\1\u0417\1\67\1\uffff\3\67\1\u041c\1"+
		"\uffff\1\u041d\1\u041e\1\uffff\1\67\2\uffff\1\u0420\1\u0421\1\67\1\u0423"+
		"\2\uffff\1\67\1\uffff\1\67\1\u0427\4\67\1\uffff\1\u042e\2\67\1\u0431\17"+
		"\67\1\uffff\1\u0441\1\67\1\uffff\3\67\1\u0446\12\67\1\uffff\1\67\1\uffff"+
		"\1\67\1\uffff\2\67\1\uffff\1\u0456\1\u0457\1\67\1\uffff\6\67\1\u035a\1"+
		"\uffff\1\u045f\1\uffff\1\u0460\1\uffff\1\67\1\u0361\1\uffff\1\67\1\uffff"+
		"\1\u0463\1\uffff\1\67\1\u0466\1\67\2\uffff\2\67\1\uffff\2\67\1\uffff\7"+
		"\67\1\u0473\5\67\1\uffff\1\67\1\u047b\1\u047c\1\67\1\uffff\4\67\1\u0482"+
		"\1\uffff\11\67\1\uffff\1\67\1\uffff\1\u048d\1\uffff\1\u048e\1\uffff\1"+
		"\67\1\uffff\1\u0490\4\67\1\uffff\4\67\1\u0499\1\uffff\6\67\1\uffff\1\67"+
		"\1\uffff\2\67\1\u04a3\1\uffff\1\u04a4\1\u04a5\10\67\1\uffff\1\67\1\uffff"+
		"\2\67\1\u04b1\1\uffff\1\67\1\uffff\1\u04b3\2\uffff\1\67\1\u04b5\2\67\2"+
		"\uffff\1\67\1\u04b9\3\67\1\u04bd\2\67\1\u04c0\1\67\1\uffff\1\u04c3\2\uffff"+
		"\3\67\1\u04c7\1\uffff\1\67\2\uffff\1\u03e8\1\uffff\1\u04ca\5\67\1\u04d1"+
		"\2\uffff\5\67\1\uffff\1\67\1\uffff\1\u04d8\1\67\2\uffff\1\u04db\1\67\1"+
		"\uffff\1\67\1\uffff\1\67\1\uffff\1\67\2\uffff\1\67\1\uffff\2\67\1\uffff"+
		"\1\67\1\u04e4\1\67\1\u04e6\1\67\1\u04e8\1\uffff\1\67\1\uffff\1\67\1\uffff"+
		"\1\67\1\u04ed\1\u04ee\1\67\3\uffff\1\67\2\uffff\1\67\1\uffff\1\67\1\u04f3"+
		"\1\67\1\uffff\1\u04f5\5\67\1\uffff\1\u04fb\1\67\1\uffff\1\67\1\u04fe\1"+
		"\u04ff\2\67\1\u0502\7\67\1\u050b\1\67\1\uffff\3\67\1\u0510\1\uffff\4\67"+
		"\1\u0515\7\67\1\u051d\2\67\2\uffff\1\67\1\u0521\1\u0522\1\u0524\1\u0525"+
		"\1\67\1\u0527\2\uffff\1\u0528\1\67\1\uffff\1\u052a\1\67\1\uffff\1\u052c"+
		"\1\u052e\1\67\1\u0530\1\u0531\1\67\1\u0533\1\u0534\1\67\1\u0536\1\67\1"+
		"\u0538\1\uffff\1\u053a\1\67\1\u053c\2\67\1\u0540\1\67\2\uffff\1\67\1\u0543"+
		"\3\67\1\uffff\1\67\1\u0548\10\67\2\uffff\1\67\1\uffff\1\67\1\u0553\2\67"+
		"\1\u0556\1\u0557\1\u0558\1\u0559\1\uffff\5\67\1\u0560\1\67\1\u0562\1\67"+
		"\3\uffff\1\u0565\2\67\1\u0568\6\67\1\u056f\1\uffff\1\u0570\1\uffff\1\67"+
		"\1\uffff\1\u0572\2\67\1\uffff\3\67\1\uffff\2\67\1\uffff\1\u057c\1\u04c3"+
		"\1\uffff\1\67\1\u057e\1\67\1\uffff\2\67\1\uffff\4\67\1\u0586\1\67\1\uffff"+
		"\1\u0588\5\67\1\uffff\2\67\1\uffff\1\u0590\2\67\1\u0593\1\u0594\3\67\1"+
		"\uffff\1\67\1\uffff\1\67\1\uffff\1\u0226\3\67\2\uffff\1\67\1\u059e\1\67"+
		"\1\u05a0\1\uffff\1\u05a1\1\uffff\2\67\1\u020e\2\67\1\uffff\2\67\2\uffff"+
		"\2\67\1\uffff\1\u05aa\3\67\1\u05ae\1\u05b0\1\u05b1\1\u050b\1\uffff\2\67"+
		"\1\u0226\1\67\1\uffff\2\67\1\u05b7\1\u05b8\1\uffff\2\67\1\u05bc\4\67\1"+
		"\uffff\2\67\1\u05c3\2\uffff\1\u05c4\2\uffff\1\u05c5\2\uffff\1\67\1\uffff"+
		"\1\67\1\uffff\1\u052e\1\uffff\1\67\2\uffff\1\67\2\uffff\1\67\1\uffff\1"+
		"\67\1\uffff\1\u05cc\1\uffff\1\67\1\uffff\1\67\1\u05d0\1\67\1\uffff\2\67"+
		"\1\uffff\4\67\1\uffff\5\67\1\u05dd\1\67\1\u05df\1\67\1\u05e1\1\uffff\1"+
		"\67\1\u05e3\4\uffff\4\67\1\u05e8\1\67\1\uffff\1\67\1\uffff\1\67\1\u05ec"+
		"\1\uffff\1\67\1\u05ee\1\uffff\1\u05ef\1\u05f1\3\67\1\u05f7\2\uffff\1\u05f8"+
		"\1\uffff\1\u05fa\1\67\1\u05fc\1\u05fd\3\67\1\u0601\1\u057c\1\uffff\1\u0602"+
		"\1\uffff\3\67\1\u0606\1\u0607\2\67\1\uffff\1\67\1\uffff\4\67\1\u0610\2"+
		"\67\1\uffff\2\67\2\uffff\2\67\1\u0617\5\67\1\u061d\1\uffff\1\u061e\2\uffff"+
		"\2\67\1\u0621\4\67\1\u0626\1\uffff\1\67\1\u0628\1\u0629\1\uffff\1\u062a"+
		"\2\uffff\1\u062b\1\u062c\2\67\1\u062f\2\uffff\1\u0630\1\67\1\u05bc\1\uffff"+
		"\1\67\1\u0635\1\u0636\2\67\1\u0639\3\uffff\1\u063a\2\67\1\u063d\2\67\1"+
		"\uffff\2\67\1\u0642\1\uffff\2\67\1\u0645\4\67\1\u064a\4\67\1\uffff\1\67"+
		"\1\uffff\1\u0650\1\uffff\1\67\1\uffff\2\67\1\u0654\1\u0655\1\uffff\2\67"+
		"\1\u0658\1\uffff\1\67\2\uffff\1\67\1\uffff\1\u065b\4\67\2\uffff\1\67\1"+
		"\uffff\1\u0662\2\uffff\3\67\2\uffff\1\u0666\2\67\2\uffff\1\u0669\2\67"+
		"\1\u066d\1\67\1\u066f\1\67\1\u0671\1\uffff\1\67\1\u0673\1\u0674\3\67\1"+
		"\uffff\2\67\1\u067a\2\67\2\uffff\2\67\1\uffff\1\u067f\1\u0680\1\67\1\u0682"+
		"\1\uffff\1\67\5\uffff\1\u0684\1\67\2\uffff\1\67\1\u0687\1\67\1\u0689\2"+
		"\uffff\1\u068a\1\67\2\uffff\2\67\1\uffff\3\67\1\u0691\1\uffff\1\67\1\u0693"+
		"\1\uffff\1\u0694\1\u0695\1\u0696\1\67\1\uffff\1\u0698\1\u0699\1\u069a"+
		"\1\67\1\u069e\1\uffff\3\67\2\uffff\2\67\1\uffff\2\67\1\uffff\2\67\1\u06a8"+
		"\3\67\1\uffff\3\67\1\uffff\2\67\1\uffff\3\67\1\uffff\1\u06b4\1\uffff\1"+
		"\67\1\uffff\1\u06b6\2\uffff\2\67\1\u06b9\1\67\1\u06bb\1\uffff\4\67\2\uffff"+
		"\1\67\1\uffff\1\u06c1\1\uffff\1\u06c2\1\u06c4\1\uffff\1\67\2\uffff\4\67"+
		"\1\u06ca\1\67\1\uffff\1\u06cc\4\uffff\1\67\3\uffff\1\u06ce\1\u06cf\1\67"+
		"\1\uffff\4\67\1\u06d5\1\u06d6\2\67\1\u06d9\1\uffff\4\67\1\u06de\3\67\1"+
		"\u06e4\1\u06e5\1\67\1\uffff\1\67\1\uffff\2\67\1\uffff\1\u06ea\1\uffff"+
		"\2\67\1\u06ed\1\u06ee\1\67\2\uffff\1\u06f0\1\uffff\1\u06f1\3\67\1\u06f5"+
		"\1\uffff\1\67\1\uffff\1\67\2\uffff\1\u06f8\1\u06f9\3\67\2\uffff\1\u06fd"+
		"\1\u06fe\1\uffff\4\67\1\uffff\3\67\1\u0706\1\67\2\uffff\4\67\1\uffff\1"+
		"\u070c\1\u070d\2\uffff\1\67\2\uffff\1\u070f\2\67\1\uffff\1\67\1\u0713"+
		"\2\uffff\1\u0714\1\u0715\1\67\2\uffff\1\67\1\u0718\2\67\1\u071b\2\67\1"+
		"\uffff\1\u071e\1\67\1\u0720\1\67\1\u0722\2\uffff\1\u0723\1\uffff\1\67"+
		"\1\u0725\1\67\3\uffff\1\67\1\u0728\1\uffff\2\67\1\uffff\1\u072b\1\67\1"+
		"\uffff\1\67\1\uffff\1\u072e\2\uffff\1\67\1\uffff\1\67\1\u0731\1\uffff"+
		"\2\67\1\uffff\2\67\1\uffff\1\u0736\1\67\1\uffff\1\67\1\u0739\1\67\1\u073b"+
		"\1\uffff\2\67\1\uffff\1\67\1\uffff\1\u073f\1\u0740\1\u0741\3\uffff";
	static final String DFA36_eofS =
		"\u0742\uffff";
	static final String DFA36_minS =
		"\1\11\2\101\1\102\1\117\1\106\1\75\1\101\1\104\1\114\1\101\1\122\1\105"+
		"\2\101\1\103\1\116\5\101\1\117\1\101\3\105\1\125\13\uffff\2\75\1\52\1"+
		"\uffff\1\55\4\uffff\1\174\2\uffff\2\0\2\56\3\uffff\1\101\1\102\1\60\2"+
		"\115\1\114\1\105\1\114\1\117\1\114\1\105\1\117\1\114\1\124\1\114\1\101"+
		"\1\60\1\124\1\103\1\104\1\124\1\117\1\124\1\60\1\120\1\116\1\114\1\60"+
		"\1\105\1\124\2\60\1\105\1\116\2\uffff\1\113\1\123\1\106\1\101\2\60\1\120"+
		"\1\60\1\105\1\130\2\103\1\101\1\123\1\105\1\102\1\122\1\124\1\117\1\60"+
		"\1\120\1\115\1\101\1\60\1\117\1\107\1\103\1\106\1\126\1\125\1\105\1\116"+
		"\1\105\1\122\2\111\1\103\1\101\1\122\2\101\1\110\1\114\1\105\1\101\1\115"+
		"\1\116\1\101\1\105\1\103\1\104\1\111\1\105\2\122\1\101\1\122\1\117\1\111"+
		"\1\122\1\107\1\101\1\114\1\111\1\116\1\114\1\125\1\105\1\101\1\103\1\117"+
		"\1\102\1\103\1\122\1\103\3\116\1\114\1\105\1\103\1\131\1\114\4\uffff\2"+
		"\101\1\76\11\uffff\2\0\1\42\2\0\1\42\2\60\1\56\1\60\1\53\1\uffff\3\60"+
		"\1\105\1\116\1\107\1\114\1\103\1\uffff\1\131\1\105\1\115\2\120\1\116\1"+
		"\123\1\115\1\114\1\103\1\123\1\114\1\105\1\101\1\60\1\114\1\103\1\60\1"+
		"\105\2\60\1\114\1\60\1\uffff\1\105\1\101\1\110\1\60\1\111\1\110\1\122"+
		"\1\111\1\uffff\1\114\1\105\1\60\1\103\1\101\1\105\1\114\2\105\1\uffff"+
		"\1\122\1\60\1\131\1\uffff\1\123\1\uffff\1\111\1\122\3\105\1\111\1\124"+
		"\1\105\1\124\1\123\1\105\1\101\1\104\1\111\1\107\1\uffff\2\105\1\101\1"+
		"\60\1\105\1\uffff\1\117\1\114\1\uffff\1\115\1\120\1\123\1\105\1\114\1"+
		"\105\1\103\1\101\1\102\1\60\1\117\1\105\1\122\1\103\1\60\1\105\1\125\1"+
		"\105\3\101\1\105\1\60\1\101\1\60\1\120\1\102\1\uffff\1\122\1\120\1\125"+
		"\1\116\1\uffff\1\114\1\110\1\111\1\101\1\113\1\117\1\127\1\111\1\122\1"+
		"\116\1\114\1\110\1\104\2\113\2\124\1\105\1\104\1\60\1\111\1\117\1\127"+
		"\1\122\1\124\1\114\1\105\2\122\1\105\1\60\1\127\1\120\1\115\1\103\1\117"+
		"\1\105\2\117\1\122\1\117\1\101\1\116\2\60\1\101\1\60\2\103\1\115\1\124"+
		"\1\110\1\103\1\123\1\116\1\107\1\114\1\116\1\60\1\110\1\125\2\101\1\125"+
		"\1\105\1\117\1\104\2\117\1\122\1\120\1\117\1\105\1\60\1\105\1\113\1\107"+
		"\1\114\1\115\1\103\1\124\1\123\1\101\2\116\2\103\1\110\1\60\1\122\1\105"+
		"\1\113\1\101\1\107\1\60\1\101\1\122\1\103\1\125\1\105\1\124\2\105\1\103"+
		"\1\111\1\127\1\124\1\60\1\114\3\122\2\uffff\1\0\1\uffff\1\0\1\60\1\uffff"+
		"\1\60\1\53\1\uffff\3\60\1\uffff\1\60\1\103\1\123\1\107\1\105\1\110\1\111"+
		"\1\60\1\111\1\117\1\122\1\60\1\105\2\60\2\124\1\104\1\60\1\124\1\122\1"+
		"\101\1\111\1\105\1\uffff\1\117\1\110\1\103\1\uffff\1\122\2\uffff\1\131"+
		"\1\uffff\1\122\1\131\1\111\1\uffff\1\116\1\117\1\103\1\124\1\126\1\111"+
		"\1\60\1\101\2\114\1\60\2\122\1\60\1\122\1\125\1\uffff\1\60\1\105\1\117"+
		"\1\101\1\122\1\60\1\123\1\124\1\60\1\122\2\60\2\114\2\60\1\103\1\60\1"+
		"\122\1\130\2\124\1\107\1\60\1\uffff\2\122\1\101\1\123\1\122\1\124\1\120"+
		"\1\125\1\101\1\122\1\101\1\105\1\116\1\101\1\125\1\120\1\114\1\uffff\1"+
		"\122\1\60\1\131\1\60\1\115\1\uffff\1\115\1\124\1\107\1\116\1\122\1\116"+
		"\1\125\2\111\1\102\1\103\1\uffff\3\60\1\106\1\uffff\1\60\1\114\1\117\1"+
		"\60\1\120\1\124\1\105\1\60\1\116\1\122\1\105\1\122\1\105\1\116\1\60\1"+
		"\105\1\60\1\105\1\60\1\117\2\60\1\105\1\60\1\103\2\105\1\60\1\uffff\1"+
		"\60\1\116\1\60\1\105\1\60\1\114\1\116\1\103\1\101\1\105\1\111\1\124\1"+
		"\104\1\uffff\1\105\1\123\1\101\1\60\1\125\1\116\1\124\1\107\1\60\2\103"+
		"\1\125\1\116\1\107\1\60\1\uffff\1\124\1\uffff\1\124\1\uffff\3\105\1\103"+
		"\1\101\1\111\1\60\1\105\2\60\1\105\2\60\1\uffff\1\124\2\111\1\60\1\115"+
		"\1\103\1\130\1\113\1\60\2\122\1\125\1\111\1\124\1\101\1\60\1\122\1\60"+
		"\1\uffff\1\102\1\60\2\105\1\115\2\105\1\101\1\111\1\101\1\60\1\124\1\60"+
		"\2\124\1\123\1\60\1\107\1\60\1\113\2\60\1\101\1\105\1\uffff\1\117\1\105"+
		"\2\60\1\104\1\105\1\117\1\111\1\uffff\1\107\1\117\1\122\1\110\1\123\1"+
		"\60\1\110\2\60\1\110\1\105\1\104\1\60\1\117\1\60\1\uffff\2\60\1\131\1"+
		"\124\1\uffff\3\60\1\104\1\uffff\2\101\1\105\2\60\1\116\1\124\1\uffff\1"+
		"\116\1\122\1\117\1\uffff\1\60\2\uffff\1\111\1\60\1\123\1\117\1\uffff\2"+
		"\60\1\124\1\107\1\60\1\127\1\60\1\137\1\60\1\132\2\60\1\126\1\60\1\122"+
		"\1\117\1\60\1\101\1\103\1\uffff\1\116\1\111\1\131\1\60\1\uffff\1\111\1"+
		"\60\1\122\1\uffff\1\60\1\124\1\uffff\1\124\1\116\1\124\1\60\1\uffff\2"+
		"\60\1\uffff\1\101\2\uffff\2\60\1\111\1\60\2\uffff\1\101\1\uffff\1\124"+
		"\1\60\1\110\1\104\1\105\1\123\1\uffff\1\60\2\124\1\60\1\117\1\123\1\124"+
		"\1\123\1\116\1\124\1\111\1\123\1\116\1\104\1\103\1\124\2\105\1\103\1\uffff"+
		"\1\60\1\111\1\uffff\1\101\1\111\1\105\1\60\1\104\1\122\1\105\2\114\1\116"+
		"\1\111\1\114\1\124\1\101\1\uffff\1\111\1\uffff\1\127\1\uffff\1\105\1\120"+
		"\1\uffff\2\60\1\101\1\uffff\1\124\1\131\1\124\2\105\1\107\1\60\1\uffff"+
		"\1\60\1\uffff\1\60\1\uffff\1\127\1\60\1\uffff\1\117\1\uffff\1\60\1\uffff"+
		"\1\124\1\60\1\122\2\uffff\2\104\1\uffff\2\104\1\uffff\1\111\1\107\1\124"+
		"\1\115\1\104\2\123\1\60\1\101\1\125\1\104\1\110\1\122\1\uffff\1\105\2"+
		"\60\1\116\1\uffff\1\113\1\110\1\116\1\101\1\60\1\uffff\1\115\1\105\1\122"+
		"\1\123\2\104\1\111\1\122\1\124\1\uffff\1\116\1\uffff\1\60\1\uffff\1\60"+
		"\1\uffff\1\117\1\uffff\1\60\1\114\1\122\2\103\1\uffff\2\105\1\120\1\105"+
		"\1\60\1\uffff\1\104\1\111\1\122\1\124\1\111\1\104\1\uffff\1\105\1\uffff"+
		"\1\120\1\101\1\60\1\uffff\2\60\1\116\1\103\1\116\2\124\1\103\1\116\1\124"+
		"\1\uffff\1\122\1\uffff\2\105\1\60\1\uffff\1\105\1\uffff\1\60\2\uffff\1"+
		"\104\1\60\1\122\1\116\2\uffff\1\101\1\60\1\111\1\116\1\105\1\60\1\111"+
		"\1\105\1\60\1\105\1\uffff\1\60\2\uffff\1\101\1\123\1\101\1\60\1\uffff"+
		"\1\122\2\uffff\1\60\1\uffff\1\60\1\105\1\124\1\117\1\103\1\122\1\60\2"+
		"\uffff\1\124\3\101\1\120\1\uffff\1\117\1\uffff\1\60\1\122\2\uffff\1\60"+
		"\1\116\1\uffff\1\111\1\uffff\1\106\1\uffff\1\105\2\uffff\1\105\1\uffff"+
		"\1\111\1\115\1\uffff\1\124\1\60\1\101\1\60\1\104\1\60\1\uffff\1\103\1"+
		"\uffff\1\111\1\uffff\1\104\2\60\1\117\3\uffff\1\114\2\uffff\1\117\1\uffff"+
		"\1\114\1\60\1\123\1\uffff\1\60\1\117\2\122\1\101\1\105\1\uffff\1\60\1"+
		"\111\1\uffff\1\120\2\60\1\111\1\107\1\60\1\116\1\123\1\101\1\105\1\124"+
		"\1\105\1\104\1\60\1\105\1\uffff\1\102\1\114\1\124\1\60\1\uffff\2\105\1"+
		"\104\1\124\1\60\1\103\1\102\1\105\1\117\1\123\1\115\1\105\1\60\1\105\1"+
		"\116\2\uffff\1\116\4\60\1\116\1\60\2\uffff\1\60\1\101\1\uffff\1\60\1\122"+
		"\1\uffff\2\60\1\101\2\60\1\116\2\60\1\124\1\60\1\124\1\60\1\uffff\1\60"+
		"\1\114\1\60\1\117\1\131\1\60\1\131\2\uffff\1\105\1\60\1\111\1\104\1\107"+
		"\1\uffff\1\105\1\60\1\126\2\111\1\125\1\120\1\131\1\111\1\124\2\uffff"+
		"\1\123\1\uffff\1\104\1\60\1\101\1\105\4\60\1\uffff\1\122\2\103\1\105\1"+
		"\115\1\60\1\116\1\60\1\103\3\uffff\1\60\2\124\1\60\1\105\1\124\1\125\1"+
		"\105\1\101\1\122\1\60\1\uffff\1\60\1\uffff\1\105\1\uffff\1\60\2\124\1"+
		"\uffff\1\116\1\107\1\104\1\uffff\1\101\1\104\1\uffff\2\60\1\uffff\1\122"+
		"\1\60\1\124\1\uffff\1\111\1\120\1\uffff\1\122\1\105\1\122\1\124\1\60\1"+
		"\115\1\uffff\1\60\1\115\1\124\1\122\1\105\1\116\1\uffff\1\115\1\105\1"+
		"\uffff\1\60\1\116\1\122\2\60\1\132\1\115\1\105\1\uffff\1\124\1\uffff\1"+
		"\101\1\uffff\1\60\1\124\1\117\1\122\2\uffff\1\122\1\60\1\116\1\60\1\uffff"+
		"\1\60\1\uffff\1\122\1\111\1\60\1\114\1\103\1\uffff\1\117\1\105\2\uffff"+
		"\1\126\1\105\1\uffff\1\60\1\111\1\114\1\104\4\60\1\uffff\1\104\1\105\1"+
		"\60\1\105\1\uffff\1\116\1\104\2\60\1\uffff\1\124\1\125\1\60\1\122\3\105"+
		"\1\uffff\1\122\1\107\1\60\2\uffff\1\60\2\uffff\1\60\2\uffff\1\104\1\uffff"+
		"\1\117\1\uffff\1\60\1\uffff\1\124\2\uffff\1\124\2\uffff\1\101\1\uffff"+
		"\1\111\1\uffff\1\60\1\uffff\1\105\1\uffff\1\124\1\60\1\117\1\uffff\1\120"+
		"\1\104\1\uffff\1\126\2\105\1\123\1\uffff\1\105\1\117\1\116\1\122\1\101"+
		"\1\60\1\117\1\60\1\124\1\60\1\uffff\1\124\1\60\4\uffff\1\105\1\122\1\124"+
		"\1\105\1\60\1\111\1\uffff\1\103\1\uffff\1\113\1\60\1\uffff\1\111\1\60"+
		"\1\uffff\2\60\1\105\1\116\1\111\1\60\2\uffff\1\60\1\uffff\1\60\1\101\2"+
		"\60\1\114\1\105\1\114\2\60\1\uffff\1\60\1\uffff\1\105\1\132\1\101\2\60"+
		"\1\115\1\111\1\uffff\1\120\1\uffff\1\120\1\105\1\131\1\122\1\60\1\101"+
		"\1\104\1\uffff\1\107\1\101\2\uffff\1\101\1\111\1\60\1\111\1\124\1\105"+
		"\1\122\1\111\1\60\1\uffff\1\60\2\uffff\1\115\1\126\1\60\1\124\1\116\1"+
		"\122\1\105\1\60\1\uffff\1\117\2\60\1\uffff\1\60\2\uffff\2\60\1\104\1\103"+
		"\1\60\2\uffff\1\60\1\124\1\60\1\uffff\1\111\2\60\1\113\1\124\1\60\3\uffff"+
		"\1\60\1\120\1\101\1\60\1\102\1\103\1\uffff\1\116\1\104\1\60\1\uffff\1"+
		"\111\1\105\1\60\1\105\2\104\1\124\1\60\1\116\1\107\1\105\1\114\1\uffff"+
		"\1\116\1\uffff\1\60\1\uffff\1\111\1\uffff\1\101\1\111\2\60\1\uffff\1\132"+
		"\1\105\1\60\1\uffff\1\117\2\uffff\1\117\1\uffff\1\60\1\101\1\116\1\104"+
		"\1\124\2\uffff\1\104\1\uffff\1\60\2\uffff\1\117\1\116\1\111\2\uffff\1"+
		"\60\1\101\1\122\2\uffff\1\60\1\117\1\114\1\60\1\104\1\60\1\124\1\60\1"+
		"\uffff\1\124\2\60\1\103\2\124\1\uffff\1\117\1\105\1\60\1\115\1\126\2\uffff"+
		"\1\101\1\105\1\uffff\2\60\1\124\1\60\1\uffff\1\116\5\uffff\1\60\1\131"+
		"\2\uffff\1\105\1\60\1\105\1\60\2\uffff\1\60\1\111\2\uffff\1\105\1\102"+
		"\1\uffff\1\114\1\123\1\107\1\60\1\uffff\1\116\1\60\1\uffff\3\60\1\101"+
		"\1\uffff\3\60\1\123\1\60\1\uffff\1\117\1\104\1\124\2\uffff\1\101\1\123"+
		"\1\uffff\2\116\1\uffff\2\124\1\60\2\101\1\111\1\uffff\1\103\1\124\1\132"+
		"\1\uffff\1\124\1\101\1\uffff\1\116\1\105\1\117\1\uffff\1\60\1\uffff\1"+
		"\111\1\uffff\1\60\2\uffff\1\124\1\111\1\60\1\116\1\60\1\uffff\1\101\1"+
		"\105\1\124\1\122\2\uffff\1\111\1\uffff\1\60\1\uffff\2\60\1\uffff\1\123"+
		"\2\uffff\1\105\1\122\1\101\1\105\1\60\1\137\1\uffff\1\60\4\uffff\1\115"+
		"\3\uffff\2\60\1\104\1\uffff\1\116\2\105\1\124\2\60\1\123\1\105\1\60\1"+
		"\uffff\2\124\1\115\1\101\1\60\1\105\1\111\1\114\2\60\1\103\1\uffff\1\105"+
		"\1\uffff\1\111\1\117\1\uffff\1\60\1\uffff\1\124\1\122\2\60\1\105\2\uffff"+
		"\1\60\1\uffff\1\60\1\123\1\124\1\123\1\60\1\uffff\1\120\1\uffff\1\120"+
		"\2\uffff\2\60\2\122\1\111\2\uffff\2\60\1\uffff\1\125\2\105\1\124\1\uffff"+
		"\1\104\1\117\1\114\1\60\1\114\2\uffff\1\101\1\123\1\117\1\116\1\uffff"+
		"\2\60\2\uffff\1\123\2\uffff\1\60\1\111\1\105\1\uffff\1\117\1\60\2\uffff"+
		"\2\60\1\117\2\uffff\1\123\1\60\1\123\1\111\1\60\1\116\1\105\1\uffff\1"+
		"\60\1\114\1\60\1\116\1\60\2\uffff\1\60\1\uffff\1\105\1\60\1\114\3\uffff"+
		"\1\116\1\60\1\uffff\1\124\1\117\1\uffff\1\60\1\114\1\uffff\1\124\1\uffff"+
		"\1\60\2\uffff\1\123\1\uffff\1\111\1\60\1\uffff\1\101\1\116\1\uffff\1\111"+
		"\1\132\1\uffff\1\60\1\103\1\uffff\1\115\1\60\1\123\1\60\1\uffff\1\131"+
		"\1\120\1\uffff\1\115\1\uffff\3\60\3\uffff";
	static final String DFA36_maxS =
		"\1\176\1\122\3\125\1\127\1\75\1\117\1\124\1\130\1\125\1\122\1\131\1\117"+
		"\1\122\1\131\1\124\1\125\2\117\1\125\1\123\1\117\2\111\1\126\1\105\1\125"+
		"\13\uffff\1\76\1\75\1\52\1\uffff\1\55\4\uffff\1\174\2\uffff\2\uffff\2"+
		"\172\3\uffff\1\125\1\102\1\172\1\116\1\122\1\114\1\105\1\114\1\117\1\116"+
		"\1\122\1\117\1\122\2\124\1\131\1\172\1\124\1\122\1\115\1\124\1\117\1\124"+
		"\1\172\1\120\1\126\1\115\1\172\1\105\1\124\2\172\1\124\1\116\2\uffff\1"+
		"\116\1\124\1\126\1\116\2\172\1\120\1\172\1\105\1\130\1\124\1\103\1\106"+
		"\1\123\1\105\1\124\1\126\1\131\1\117\1\172\1\120\1\115\1\117\1\172\1\124"+
		"\1\116\1\103\1\124\1\126\1\125\1\111\1\124\1\105\1\122\2\111\1\124\1\117"+
		"\1\122\1\101\1\122\1\110\1\114\1\105\1\101\1\115\1\116\1\123\1\111\1\103"+
		"\1\104\1\111\1\117\1\124\1\122\1\125\1\122\1\117\1\111\1\122\1\107\2\127"+
		"\1\111\1\116\1\123\1\125\1\117\1\105\1\123\1\117\1\122\1\103\2\124\1\116"+
		"\1\126\1\116\1\122\1\105\1\103\1\131\1\114\4\uffff\1\101\1\105\1\76\11"+
		"\uffff\2\uffff\1\47\2\uffff\1\47\1\146\2\172\1\145\1\71\1\uffff\3\172"+
		"\2\116\1\107\1\114\1\103\1\uffff\1\131\1\105\1\115\2\120\1\116\1\123\1"+
		"\115\1\114\1\103\1\123\1\114\1\105\1\117\1\172\1\114\1\103\1\172\1\105"+
		"\2\172\1\114\1\172\1\uffff\1\105\1\101\1\110\1\172\1\111\1\117\1\122\1"+
		"\111\1\uffff\1\114\1\105\1\172\1\103\1\101\1\105\1\114\2\105\1\uffff\1"+
		"\122\1\172\1\131\1\uffff\1\123\1\uffff\1\111\1\122\3\105\1\111\1\124\1"+
		"\105\1\124\1\123\1\105\1\113\1\104\1\111\1\107\1\uffff\2\105\1\125\1\172"+
		"\1\105\1\uffff\1\117\1\114\1\uffff\1\115\1\120\1\123\1\114\2\122\1\103"+
		"\1\101\1\102\1\172\1\117\1\105\1\122\1\103\1\172\1\111\1\125\1\105\1\111"+
		"\1\101\1\124\1\105\1\172\1\105\1\172\1\120\1\102\1\uffff\1\122\1\120\1"+
		"\125\1\116\1\uffff\1\114\1\110\1\111\1\101\1\113\1\117\1\127\1\111\2\122"+
		"\1\114\1\110\1\104\2\113\2\124\1\105\1\126\1\172\1\111\1\117\1\127\1\122"+
		"\1\124\1\114\1\125\1\122\1\124\1\105\1\172\1\127\1\120\1\115\1\103\1\121"+
		"\1\111\2\117\1\122\1\117\1\101\1\116\2\172\1\101\1\172\1\123\1\103\1\116"+
		"\1\124\1\110\1\103\1\123\1\116\1\107\1\114\1\116\1\172\1\110\1\125\1\114"+
		"\1\101\1\125\1\105\1\117\1\104\1\117\1\124\1\122\1\120\1\131\1\105\1\172"+
		"\1\114\1\113\1\107\1\125\1\120\2\124\1\123\1\101\1\123\1\122\1\103\1\124"+
		"\1\110\1\172\1\123\1\105\1\113\1\101\1\107\1\172\1\101\1\122\1\105\1\125"+
		"\1\105\1\124\2\105\1\103\1\125\1\127\1\124\1\172\1\114\3\122\2\uffff\1"+
		"\uffff\1\uffff\1\uffff\1\172\1\uffff\1\145\1\71\1\uffff\1\71\2\172\1\uffff"+
		"\1\172\1\103\1\123\1\107\1\105\1\110\1\111\1\172\1\111\1\117\1\122\1\172"+
		"\1\105\2\172\2\124\1\104\1\172\1\124\1\122\1\101\1\111\1\105\1\uffff\1"+
		"\117\1\110\1\103\1\uffff\1\122\2\uffff\1\131\1\uffff\1\122\1\131\1\111"+
		"\1\uffff\1\116\1\117\1\103\1\124\1\126\1\111\1\172\1\101\2\114\1\172\2"+
		"\122\1\172\1\122\1\125\1\uffff\1\172\1\105\1\117\1\101\1\122\1\172\1\123"+
		"\1\124\1\172\1\122\2\172\1\114\1\124\2\172\1\103\1\172\1\122\1\130\2\124"+
		"\1\122\1\172\1\uffff\2\122\1\101\1\123\1\122\1\124\1\120\1\125\1\101\1"+
		"\122\1\101\1\105\1\122\1\101\1\125\1\120\1\114\1\uffff\1\122\1\172\1\131"+
		"\1\172\1\115\1\uffff\1\115\1\124\1\107\1\116\1\122\1\116\1\125\1\111\1"+
		"\122\1\102\1\103\1\uffff\3\172\1\106\1\uffff\1\172\1\114\1\117\1\172\1"+
		"\120\1\124\1\105\1\172\1\116\1\122\1\105\1\122\1\105\1\116\1\172\1\105"+
		"\1\172\1\105\1\172\1\117\2\172\1\105\1\172\1\103\2\105\1\172\1\uffff\1"+
		"\172\1\116\1\172\1\105\1\172\1\114\1\116\1\103\1\101\1\105\1\125\1\124"+
		"\1\115\1\uffff\1\105\1\123\1\101\1\172\1\125\1\116\1\124\1\107\1\172\2"+
		"\103\1\125\1\116\1\107\1\172\1\uffff\1\124\1\uffff\1\124\1\uffff\1\105"+
		"\1\111\1\105\1\103\1\101\1\111\1\172\1\105\2\172\1\105\2\172\1\uffff\1"+
		"\124\2\111\1\172\1\115\1\103\1\130\1\113\1\172\2\122\1\125\1\111\1\124"+
		"\1\101\1\172\1\122\1\172\1\uffff\1\125\1\172\2\105\1\115\1\105\1\111\1"+
		"\125\1\111\1\101\1\172\1\124\1\172\2\124\1\123\1\172\1\107\1\172\1\113"+
		"\2\172\1\101\1\105\1\uffff\1\117\1\105\2\172\1\104\1\105\1\117\1\111\1"+
		"\uffff\1\107\1\117\1\122\1\110\1\124\1\172\1\110\2\172\1\110\1\105\1\104"+
		"\1\172\1\117\1\172\1\uffff\2\172\1\131\1\124\1\uffff\1\71\3\104\1\uffff"+
		"\1\101\1\106\1\105\2\172\1\116\1\124\1\uffff\1\116\1\122\1\117\1\uffff"+
		"\1\172\2\uffff\1\111\1\172\1\123\1\117\1\uffff\2\172\1\124\1\107\1\172"+
		"\1\127\1\172\1\137\1\172\1\132\2\172\1\126\1\172\1\122\1\117\1\172\1\105"+
		"\1\103\1\uffff\1\116\1\111\1\131\1\172\1\uffff\1\111\1\172\1\122\1\uffff"+
		"\1\172\1\124\1\uffff\1\124\1\116\1\124\1\172\1\uffff\2\172\1\uffff\1\101"+
		"\2\uffff\2\172\1\111\1\172\2\uffff\1\101\1\uffff\1\124\1\172\1\110\1\106"+
		"\1\105\1\126\1\uffff\1\172\2\124\1\172\1\117\1\123\1\124\1\123\1\116\1"+
		"\124\1\111\1\123\1\116\1\104\1\103\1\124\2\105\1\103\1\uffff\1\172\1\111"+
		"\1\uffff\1\101\1\111\1\105\1\172\1\104\1\122\1\105\2\114\1\116\1\111\1"+
		"\114\1\124\1\101\1\uffff\1\111\1\uffff\1\127\1\uffff\1\105\1\120\1\uffff"+
		"\2\172\1\101\1\uffff\1\124\1\131\1\124\2\105\1\107\1\172\1\uffff\1\172"+
		"\1\uffff\1\172\1\uffff\1\127\1\172\1\uffff\1\117\1\uffff\1\172\1\uffff"+
		"\1\124\1\172\1\122\2\uffff\2\104\1\uffff\2\104\1\uffff\1\111\1\107\1\124"+
		"\1\115\1\104\2\123\1\172\1\101\1\125\1\104\1\110\1\122\1\uffff\1\105\2"+
		"\172\1\116\1\uffff\1\113\1\110\1\116\1\101\1\172\1\uffff\1\115\1\105\1"+
		"\122\1\123\2\104\1\111\1\122\1\124\1\uffff\1\116\1\uffff\1\172\1\uffff"+
		"\1\172\1\uffff\1\117\1\uffff\1\172\1\114\1\122\2\103\1\uffff\2\105\1\120"+
		"\1\105\1\172\1\uffff\1\104\1\111\1\122\1\124\1\111\1\104\1\uffff\1\105"+
		"\1\uffff\1\120\1\101\1\172\1\uffff\2\172\1\116\1\103\1\116\2\124\1\103"+
		"\1\116\1\124\1\uffff\1\122\1\uffff\2\105\1\172\1\uffff\1\105\1\uffff\1"+
		"\172\2\uffff\1\104\1\172\1\122\1\116\2\uffff\1\101\1\172\1\111\1\116\1"+
		"\105\1\172\1\111\1\105\1\172\1\105\1\uffff\1\172\2\uffff\1\101\1\123\1"+
		"\101\1\172\1\uffff\1\122\2\uffff\1\172\1\uffff\1\172\1\105\1\124\1\117"+
		"\1\103\1\122\1\172\2\uffff\1\124\3\101\1\120\1\uffff\1\117\1\uffff\1\172"+
		"\1\122\2\uffff\1\172\1\116\1\uffff\1\111\1\uffff\1\106\1\uffff\1\105\2"+
		"\uffff\1\105\1\uffff\1\111\1\115\1\uffff\1\124\1\172\1\101\1\172\1\104"+
		"\1\172\1\uffff\1\103\1\uffff\1\111\1\uffff\1\106\2\172\1\117\3\uffff\1"+
		"\114\2\uffff\1\117\1\uffff\1\114\1\172\1\123\1\uffff\1\172\1\117\2\122"+
		"\1\101\1\105\1\uffff\1\172\1\111\1\uffff\1\120\2\172\1\111\1\107\1\172"+
		"\1\116\1\123\1\101\1\105\1\124\1\105\1\104\1\172\1\105\1\uffff\1\102\1"+
		"\114\1\124\1\172\1\uffff\2\105\1\104\1\124\1\172\1\103\1\102\1\105\1\117"+
		"\1\123\1\115\1\105\1\172\1\105\1\116\2\uffff\1\116\4\172\1\116\1\172\2"+
		"\uffff\1\172\1\101\1\uffff\1\172\1\122\1\uffff\2\172\1\101\2\172\1\116"+
		"\2\172\1\124\1\172\1\124\1\172\1\uffff\1\172\1\114\1\172\1\117\1\131\1"+
		"\172\1\131\2\uffff\1\105\1\172\1\111\1\104\1\107\1\uffff\1\105\1\172\1"+
		"\126\2\111\1\125\1\120\1\131\1\111\1\124\2\uffff\1\123\1\uffff\1\104\1"+
		"\172\1\101\1\105\4\172\1\uffff\1\127\2\103\1\105\1\115\1\172\1\116\1\172"+
		"\1\103\3\uffff\1\172\2\124\1\172\1\105\1\124\1\125\1\105\1\101\1\122\1"+
		"\172\1\uffff\1\172\1\uffff\1\105\1\uffff\1\172\2\124\1\uffff\1\116\1\107"+
		"\1\115\1\uffff\1\101\1\104\1\uffff\2\172\1\uffff\1\122\1\172\1\124\1\uffff"+
		"\1\111\1\120\1\uffff\1\122\1\105\1\122\1\124\1\172\1\115\1\uffff\1\172"+
		"\1\115\1\124\1\122\1\105\1\116\1\uffff\1\115\1\105\1\uffff\1\172\1\116"+
		"\1\122\2\172\1\132\1\115\1\105\1\uffff\1\124\1\uffff\1\101\1\uffff\1\172"+
		"\1\124\1\117\1\122\2\uffff\1\122\1\172\1\116\1\172\1\uffff\1\172\1\uffff"+
		"\1\122\1\111\1\172\1\114\1\103\1\uffff\1\117\1\105\2\uffff\1\126\1\105"+
		"\1\uffff\1\172\1\111\1\114\1\104\4\172\1\uffff\1\104\1\105\1\172\1\105"+
		"\1\uffff\1\116\1\104\2\172\1\uffff\1\124\1\125\1\172\1\122\3\105\1\uffff"+
		"\1\122\1\107\1\172\2\uffff\1\172\2\uffff\1\172\2\uffff\1\104\1\uffff\1"+
		"\117\1\uffff\1\172\1\uffff\1\124\2\uffff\1\124\2\uffff\1\101\1\uffff\1"+
		"\111\1\uffff\1\172\1\uffff\1\111\1\uffff\1\124\1\172\1\117\1\uffff\1\120"+
		"\1\104\1\uffff\1\126\2\105\1\123\1\uffff\1\105\1\117\1\116\1\122\1\101"+
		"\1\172\1\117\1\172\1\124\1\172\1\uffff\1\124\1\172\4\uffff\1\105\1\122"+
		"\1\124\1\105\1\172\1\111\1\uffff\1\103\1\uffff\1\113\1\172\1\uffff\1\111"+
		"\1\172\1\uffff\2\172\1\105\1\116\1\111\1\172\2\uffff\1\172\1\uffff\1\172"+
		"\1\101\2\172\1\114\1\105\1\114\2\172\1\uffff\1\172\1\uffff\1\105\1\132"+
		"\1\101\2\172\1\115\1\111\1\uffff\1\120\1\uffff\1\120\1\105\1\131\1\122"+
		"\1\172\1\101\1\104\1\uffff\1\107\1\101\2\uffff\1\101\1\111\1\172\1\111"+
		"\1\124\1\105\1\122\1\111\1\172\1\uffff\1\172\2\uffff\1\115\1\126\1\172"+
		"\1\124\1\116\1\122\1\105\1\172\1\uffff\1\117\2\172\1\uffff\1\172\2\uffff"+
		"\2\172\1\104\1\103\1\172\2\uffff\1\172\1\124\1\172\1\uffff\1\131\2\172"+
		"\1\113\1\124\1\172\3\uffff\1\172\1\120\1\101\1\172\1\102\1\103\1\uffff"+
		"\1\116\1\104\1\172\1\uffff\1\111\1\105\1\172\1\105\2\104\1\124\1\172\1"+
		"\116\1\107\1\105\1\114\1\uffff\1\116\1\uffff\1\172\1\uffff\1\111\1\uffff"+
		"\1\101\1\111\2\172\1\uffff\1\132\1\105\1\172\1\uffff\1\117\2\uffff\1\117"+
		"\1\uffff\1\172\1\101\1\116\1\104\1\124\2\uffff\1\124\1\uffff\1\172\2\uffff"+
		"\1\117\1\116\1\111\2\uffff\1\172\1\101\1\122\2\uffff\1\172\1\117\1\114"+
		"\1\172\1\104\1\172\1\124\1\172\1\uffff\1\124\2\172\1\103\2\124\1\uffff"+
		"\1\117\1\105\1\172\1\115\1\126\2\uffff\1\101\1\105\1\uffff\2\172\1\124"+
		"\1\172\1\uffff\1\116\5\uffff\1\172\1\131\2\uffff\1\105\1\172\1\105\1\172"+
		"\2\uffff\1\172\1\111\2\uffff\1\105\1\102\1\uffff\1\114\1\123\1\107\1\172"+
		"\1\uffff\1\116\1\172\1\uffff\3\172\1\101\1\uffff\3\172\1\123\1\172\1\uffff"+
		"\1\117\1\104\1\124\2\uffff\1\101\1\123\1\uffff\2\116\1\uffff\2\124\1\172"+
		"\2\101\1\111\1\uffff\1\103\1\124\1\132\1\uffff\1\124\1\101\1\uffff\1\116"+
		"\1\105\1\117\1\uffff\1\172\1\uffff\1\111\1\uffff\1\172\2\uffff\1\124\1"+
		"\111\1\172\1\116\1\172\1\uffff\1\101\1\105\1\124\1\122\2\uffff\1\111\1"+
		"\uffff\1\172\1\uffff\2\172\1\uffff\1\123\2\uffff\1\105\1\122\1\101\1\105"+
		"\1\172\1\137\1\uffff\1\172\4\uffff\1\115\3\uffff\2\172\1\104\1\uffff\1"+
		"\116\2\105\1\124\2\172\1\123\1\105\1\172\1\uffff\2\124\1\115\1\101\1\172"+
		"\1\105\1\111\1\114\2\172\1\103\1\uffff\1\105\1\uffff\1\111\1\117\1\uffff"+
		"\1\172\1\uffff\1\124\1\122\2\172\1\105\2\uffff\1\172\1\uffff\1\172\1\123"+
		"\1\124\1\123\1\172\1\uffff\1\120\1\uffff\1\120\2\uffff\2\172\2\122\1\111"+
		"\2\uffff\2\172\1\uffff\1\125\2\105\1\124\1\uffff\1\104\1\117\1\114\1\172"+
		"\1\114\2\uffff\1\101\1\123\1\117\1\116\1\uffff\2\172\2\uffff\1\123\2\uffff"+
		"\1\172\1\111\1\105\1\uffff\1\117\1\172\2\uffff\2\172\1\117\2\uffff\1\123"+
		"\1\172\1\123\1\111\1\172\1\116\1\105\1\uffff\1\172\1\114\1\172\1\116\1"+
		"\172\2\uffff\1\172\1\uffff\1\105\1\172\1\114\3\uffff\1\116\1\172\1\uffff"+
		"\1\124\1\117\1\uffff\1\172\1\114\1\uffff\1\124\1\uffff\1\172\2\uffff\1"+
		"\123\1\uffff\1\111\1\172\1\uffff\1\101\1\116\1\uffff\1\111\1\132\1\uffff"+
		"\1\172\1\103\1\uffff\1\115\1\172\1\123\1\172\1\uffff\1\131\1\120\1\uffff"+
		"\1\115\1\uffff\3\172\3\uffff";
	static final String DFA36_acceptS =
		"\34\uffff\1\u015a\1\u015b\1\u015c\1\u015d\1\u015e\1\u015f\1\u0160\1\u0161"+
		"\1\u0162\1\u0163\1\u0164\3\uffff\1\u016c\1\uffff\1\u016e\1\u016f\1\u0171"+
		"\1\u0172\1\uffff\1\u0175\1\u0176\4\uffff\1\u017e\1\u017f\1\u0180\42\uffff"+
		"\1\u0166\1\7\123\uffff\1\165\1\u00a5\1\u00a6\1\u0177\3\uffff\1\u0168\1"+
		"\u0169\1\u016a\1\u0182\1\u016b\1\u0181\1\u016d\1\u0174\1\u0173\13\uffff"+
		"\1\u017d\10\uffff\1\113\27\uffff\1\26\10\uffff\1\u014e\11\uffff\1\6\3"+
		"\uffff\1\42\1\uffff\1\u0087\17\uffff\1\12\5\uffff\1\u00ba\2\uffff\1\77"+
		"\33\uffff\1\u0149\4\uffff\1\22\160\uffff\1\u0165\1\u0167\1\uffff\1\u0178"+
		"\2\uffff\1\u017a\2\uffff\1\u017b\3\uffff\1\u017c\30\uffff\1\u00ed\3\uffff"+
		"\1\3\1\uffff\1\5\1\11\1\uffff\1\14\3\uffff\1\u008a\20\uffff\1\u0086\30"+
		"\uffff\1\120\21\uffff\1\u00ac\5\uffff\1\134\13\uffff\1\u0170\4\uffff\1"+
		"\u0115\34\uffff\1\u00a1\15\uffff\1\u00c2\17\uffff\1\u00e2\1\uffff\1\u00b0"+
		"\1\uffff\1\u0101\15\uffff\1\u0092\22\uffff\1\153\30\uffff\1\u0099\10\uffff"+
		"\1\142\17\uffff\1\u0131\4\uffff\1\u0179\4\uffff\1\1\7\uffff\1\131\3\uffff"+
		"\1\u00aa\1\uffff\1\25\1\41\4\uffff\1\u0091\23\uffff\1\4\4\uffff\1\100"+
		"\3\uffff\1\u00f7\2\uffff\1\u011f\4\uffff\1\10\2\uffff\1\17\1\uffff\1\37"+
		"\1\u00f5\4\uffff\1\u00c4\1\70\1\uffff\1\u00b2\6\uffff\1\151\23\uffff\1"+
		"\u00ab\2\uffff\1\15\16\uffff\1\75\1\uffff\1\125\1\uffff\1\111\2\uffff"+
		"\1\u0138\3\uffff\1\u00d3\7\uffff\1\u0117\1\uffff\1\u00a9\1\uffff\1\u009b"+
		"\2\uffff\1\u0114\1\uffff\1\u011e\1\uffff\1\u013f\3\uffff\1\u00f9\1\u00db"+
		"\2\uffff\1\54\2\uffff\1\65\15\uffff\1\u0157\4\uffff\1\u00c3\5\uffff\1"+
		"\u00fc\11\uffff\1\u0150\1\uffff\1\u00b4\1\uffff\1\u0141\1\uffff\1\u0147"+
		"\1\uffff\1\36\5\uffff\1\u0137\5\uffff\1\u00cc\6\uffff\1\u012e\1\uffff"+
		"\1\154\3\uffff\1\u00fd\12\uffff\1\u010d\1\uffff\1\u0158\3\uffff\1\u014f"+
		"\1\uffff\1\136\1\uffff\1\u0089\1\u00a8\4\uffff\1\u00eb\1\55\12\uffff\1"+
		"\u00f6\1\uffff\1\u0148\1\132\4\uffff\1\u00b8\1\uffff\1\164\1\166\1\uffff"+
		"\1\u0110\7\uffff\1\45\1\u00dd\5\uffff\1\2\1\uffff\1\106\2\uffff\1\122"+
		"\1\u0134\2\uffff\1\u012a\1\uffff\1\u00b6\1\uffff\1\103\1\uffff\1\107\1"+
		"\140\1\uffff\1\u0103\2\uffff\1\u0132\6\uffff\1\16\1\uffff\1\20\1\uffff"+
		"\1\33\4\uffff\1\u0104\1\167\1\u009f\1\uffff\1\u0122\1\60\1\uffff\1\u00c5"+
		"\3\uffff\1\50\6\uffff\1\u00ff\2\uffff\1\163\17\uffff\1\u014d\4\uffff\1"+
		"\u0095\17\uffff\1\21\1\u00c0\7\uffff\1\24\1\u00cb\2\uffff\1\u0120\2\uffff"+
		"\1\u009a\14\uffff\1\u011a\7\uffff\1\66\1\u00a2\5\uffff\1\62\12\uffff\1"+
		"\u0143\1\u00ce\1\uffff\1\40\10\uffff\1\u00cd\11\uffff\1\u00fe\1\u008c"+
		"\1\u00cf\13\uffff\1\u00d5\1\uffff\1\u0146\1\uffff\1\u0125\3\uffff\1\u0135"+
		"\3\uffff\1\u0090\2\uffff\1\u00b5\2\uffff\1\u0113\3\uffff\1\u00b9\2\uffff"+
		"\1\u0111\6\uffff\1\46\6\uffff\1\157\2\uffff\1\155\10\uffff\1\u0154\1\uffff"+
		"\1\u00fb\1\uffff\1\u012f\4\uffff\1\u00a0\1\u00e3\4\uffff\1\31\1\uffff"+
		"\1\76\5\uffff\1\72\2\uffff\1\13\1\67\2\uffff\1\71\10\uffff\1\176\4\uffff"+
		"\1\u00b3\4\uffff\1\u013e\7\uffff\1\123\3\uffff\1\121\1\u00d4\1\uffff\1"+
		"\u0085\1\u00d1\1\uffff\1\23\1\u00ee\1\uffff\1\27\1\uffff\1\u0102\1\uffff"+
		"\1\u0119\1\uffff\1\u00c7\1\150\1\uffff\1\135\1\141\1\uffff\1\170\1\uffff"+
		"\1\u0139\1\uffff\1\u00be\1\uffff\1\u00e9\3\uffff\1\u0130\2\uffff\1\u00c6"+
		"\4\uffff\1\u00e6\12\uffff\1\56\2\uffff\1\112\1\144\1\u008d\1\u00c1\6\uffff"+
		"\1\u010f\1\uffff\1\u00ea\2\uffff\1\105\2\uffff\1\u011c\6\uffff\1\101\1"+
		"\104\1\uffff\1\u00d7\11\uffff\1\u0118\1\uffff\1\u010e\7\uffff\1\u00d8"+
		"\1\uffff\1\116\7\uffff\1\u0127\2\uffff\1\u00d0\1\u00de\11\uffff\1\u00dc"+
		"\1\uffff\1\u0098\1\51\10\uffff\1\u0093\3\uffff\1\u0133\1\uffff\1\u0081"+
		"\1\161\5\uffff\1\u00a7\1\u0145\3\uffff\1\177\6\uffff\1\115\1\152\1\u00d2"+
		"\6\uffff\1\u00bf\3\uffff\1\u013b\14\uffff\1\u0126\1\uffff\1\u0088\1\uffff"+
		"\1\52\1\uffff\1\u008b\4\uffff\1\u010a\3\uffff\1\47\1\uffff\1\114\1\u00e0"+
		"\1\uffff\1\u0106\5\uffff\1\63\1\u00e8\1\uffff\1\u00f2\1\uffff\1\u00ad"+
		"\1\u0151\3\uffff\1\u0136\1\137\3\uffff\1\u0112\1\u00fa\10\uffff\1\u008f"+
		"\6\uffff\1\u0144\5\uffff\1\u013c\1\u0082\2\uffff\1\133\4\uffff\1\u0100"+
		"\1\uffff\1\102\1\u0094\1\u0080\1\u012b\1\110\2\uffff\1\u009c\1\30\4\uffff"+
		"\1\u00bb\1\126\2\uffff\1\u00f8\1\u0152\2\uffff\1\117\4\uffff\1\u0123\2"+
		"\uffff\1\u00ca\4\uffff\1\35\5\uffff\1\u0159\3\uffff\1\u00e7\1\u0140\2"+
		"\uffff\1\u011d\2\uffff\1\u00d6\6\uffff\1\74\3\uffff\1\u012c\2\uffff\1"+
		"\61\3\uffff\1\127\1\uffff\1\u008e\1\uffff\1\53\1\uffff\1\u0096\1\u00f1"+
		"\5\uffff\1\32\4\uffff\1\u00b7\1\u0121\1\uffff\1\u00c8\1\uffff\1\156\2"+
		"\uffff\1\57\1\uffff\1\u00bc\1\u0116\6\uffff\1\u014c\1\uffff\1\143\1\u00df"+
		"\1\u00ef\1\u0155\1\uffff\1\124\1\u00f0\1\u00c9\3\uffff\1\43\11\uffff\1"+
		"\146\13\uffff\1\160\1\uffff\1\171\2\uffff\1\u0124\1\uffff\1\u012d\5\uffff"+
		"\1\u013d\1\u0097\1\uffff\1\64\5\uffff\1\u00e1\1\uffff\1\34\1\uffff\1\u0105"+
		"\1\44\5\uffff\1\u0128\1\162\2\uffff\1\u0129\4\uffff\1\u0153\5\uffff\1"+
		"\u011b\1\u0084\4\uffff\1\u0156\2\uffff\1\172\1\174\1\uffff\1\147\1\u00ec"+
		"\3\uffff\1\u00ae\2\uffff\1\145\1\73\3\uffff\1\u0107\1\u00e4\7\uffff\1"+
		"\u0108\5\uffff\1\173\1\175\1\uffff\1\u009e\3\uffff\1\u00b1\1\u00d9\1\u00da"+
		"\2\uffff\1\u00f3\2\uffff\1\u00bd\2\uffff\1\u0109\1\uffff\1\u00a3\1\uffff"+
		"\1\u010b\1\u00a4\1\uffff\1\u00e5\2\uffff\1\u00af\2\uffff\1\u013a\2\uffff"+
		"\1\u014a\2\uffff\1\u010c\4\uffff\1\u009d\2\uffff\1\u0083\1\uffff\1\130"+
		"\3\uffff\1\u014b\1\u00f4\1\u0142";
	static final String DFA36_specialS =
		"\63\uffff\1\0\1\1\u008c\uffff\1\4\1\2\1\uffff\1\6\1\3\u00ed\uffff\1\5"+
		"\1\uffff\1\7\u058c\uffff}>";
	static final String[] DFA36_transitionS = {
			"\2\71\2\uffff\1\71\22\uffff\1\71\1\6\1\64\1\uffff\1\31\1\55\1\56\1\63"+
			"\1\40\1\41\1\54\1\52\1\36\1\53\1\34\1\51\1\65\11\66\1\35\1\37\1\47\1"+
			"\46\1\50\1\62\1\uffff\1\3\1\14\1\24\1\12\1\11\1\2\1\13\1\15\1\10\1\22"+
			"\1\30\1\7\1\25\1\4\1\5\1\21\1\33\1\23\1\17\1\1\1\20\1\27\1\16\1\67\1"+
			"\32\1\26\1\42\1\uffff\1\43\1\61\1\70\33\67\1\44\1\60\1\45\1\57",
			"\1\73\1\77\2\uffff\1\76\2\uffff\1\100\1\75\5\uffff\1\74\2\uffff\1\72",
			"\1\101\3\uffff\1\107\3\uffff\1\104\2\uffff\1\105\2\uffff\1\106\2\uffff"+
			"\1\102\2\uffff\1\103",
			"\1\117\1\120\1\115\1\uffff\1\113\5\uffff\1\110\1\uffff\1\111\1\uffff"+
			"\1\122\1\uffff\1\114\1\112\1\121\1\116",
			"\1\123\5\uffff\1\124",
			"\1\131\7\uffff\1\130\1\uffff\1\132\1\uffff\1\125\2\uffff\1\127\1\126"+
			"\1\133",
			"\1\134",
			"\1\137\3\uffff\1\140\3\uffff\1\136\5\uffff\1\141",
			"\1\147\1\uffff\1\142\6\uffff\1\144\1\143\4\uffff\1\145\1\146",
			"\1\153\1\uffff\1\152\4\uffff\1\151\2\uffff\1\154\1\uffff\1\150",
			"\1\157\1\162\2\uffff\1\155\3\uffff\1\156\5\uffff\1\161\2\uffff\1\160"+
			"\2\uffff\1\163",
			"\1\164",
			"\1\171\3\uffff\1\167\5\uffff\1\166\5\uffff\1\170\3\uffff\1\165",
			"\1\172\15\uffff\1\173",
			"\1\u0081\3\uffff\1\176\2\uffff\1\174\1\175\5\uffff\1\177\2\uffff\1\u0080",
			"\1\u0087\1\uffff\1\u0082\2\uffff\1\u0083\2\uffff\1\u0089\1\uffff\1\u0085"+
			"\1\u008a\1\u0084\3\uffff\1\u0088\1\u0086\1\u008b\3\uffff\1\u008c",
			"\1\u008d\1\uffff\1\u0090\1\uffff\1\u0091\1\u008e\1\u008f",
			"\1\u0093\3\uffff\1\u0094\6\uffff\1\u0095\2\uffff\1\u0097\2\uffff\1\u0092"+
			"\2\uffff\1\u0096",
			"\1\u0099\15\uffff\1\u0098",
			"\1\u009e\3\uffff\1\u009b\3\uffff\1\u009a\2\uffff\1\u009d\2\uffff\1\u009c",
			"\1\u00a3\1\u00a4\5\uffff\1\u00a2\3\uffff\1\u00a0\2\uffff\1\u009f\2\uffff"+
			"\1\u00a1\2\uffff\1\u00a5",
			"\1\u00a8\3\uffff\1\u00a7\3\uffff\1\u00a9\5\uffff\1\u00aa\3\uffff\1\u00a6",
			"\1\u00ab",
			"\1\u00ac\3\uffff\1\u00ae\3\uffff\1\u00ad",
			"\1\u00af\3\uffff\1\u00b0",
			"\1\u00b3\5\uffff\1\u00b1\12\uffff\1\u00b2",
			"\1\u00b5",
			"\1\u00b6",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\u00b7\1\134",
			"\1\u00b9",
			"\1\u00bb",
			"",
			"\1\u00bd",
			"",
			"",
			"",
			"",
			"\1\u00bf",
			"",
			"",
			"\47\u00c1\1\u00c3\64\u00c1\1\u00c2\uffa3\u00c1",
			"\42\u00c4\1\u00c6\71\u00c4\1\u00c5\uffa3\u00c4",
			"\1\u00ca\1\uffff\12\u00c9\7\uffff\1\67\1\u00ce\1\67\1\u00cd\1\u00cb"+
			"\1\67\1\u00cf\3\67\1\u00cf\1\u00c8\1\u00cf\5\67\1\u00c8\4\67\1\u00c7"+
			"\1\u00c8\1\67\4\uffff\1\67\1\uffff\1\67\1\u00cf\2\67\1\u00cb\1\67\1\u00cf"+
			"\3\67\1\u00cf\1\67\1\u00cf\15\67",
			"\1\u00ca\1\uffff\12\u00c9\7\uffff\1\67\1\u00ce\1\67\1\u00cd\1\u00cb"+
			"\1\67\1\u00cf\3\67\1\u00cf\1\u00c8\1\u00cf\5\67\1\u00c8\5\67\1\u00c8"+
			"\1\67\4\uffff\1\67\1\uffff\1\67\1\u00cf\2\67\1\u00cb\1\67\1\u00cf\3\67"+
			"\1\u00cf\1\67\1\u00cf\15\67",
			"",
			"",
			"",
			"\1\u00d1\7\uffff\1\u00d2\13\uffff\1\u00d0",
			"\1\u00d3",
			"\12\67\7\uffff\24\67\1\u00d4\5\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u00d7\1\u00d6",
			"\1\u00d9\4\uffff\1\u00d8",
			"\1\u00da",
			"\1\u00db",
			"\1\u00dc",
			"\1\u00dd",
			"\1\u00de\1\uffff\1\u00df",
			"\1\u00e1\6\uffff\1\u00e2\5\uffff\1\u00e0",
			"\1\u00e3",
			"\1\u00e5\5\uffff\1\u00e4",
			"\1\u00e6",
			"\1\u00e7\7\uffff\1\u00e8",
			"\1\u00eb\2\uffff\1\u00e9\24\uffff\1\u00ea",
			"\12\67\7\uffff\2\67\1\u00ec\27\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u00ee",
			"\1\u00f0\16\uffff\1\u00ef",
			"\1\u00f1\10\uffff\1\u00f2",
			"\1\u00f3",
			"\1\u00f4",
			"\1\u00f5",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u00f7",
			"\1\u00f8\3\uffff\1\u00fc\1\u00fa\1\u00f9\1\uffff\1\u00fb",
			"\1\u00fd\1\u00fe",
			"\12\67\7\uffff\3\67\1\u00ff\26\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0101",
			"\1\u0102",
			"\12\67\7\uffff\13\67\1\u0103\16\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\5\67\1\u0105\24\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0108\16\uffff\1\u0107",
			"\1\u0109",
			"",
			"",
			"\1\u010a\1\uffff\1\u010c\1\u010b",
			"\1\u010d\1\u010e",
			"\1\u010f\14\uffff\1\u0110\2\uffff\1\u0111",
			"\1\u0113\1\uffff\1\u0112\3\uffff\1\u0114\6\uffff\1\u0115",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\3\67\1\u0118\11\67\1\u011b\1\67\1\u0119\2\67\1\u0117"+
			"\1\u011a\6\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u011d",
			"\12\67\7\uffff\16\67\1\u011e\13\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0120",
			"\1\u0121",
			"\1\u0123\1\uffff\1\u0126\3\uffff\1\u0122\6\uffff\1\u0124\3\uffff\1\u0125",
			"\1\u0127",
			"\1\u0128\2\uffff\1\u0129\1\uffff\1\u012a",
			"\1\u012b",
			"\1\u012c",
			"\1\u0130\1\u012e\2\uffff\1\u0132\5\uffff\1\u012f\3\uffff\1\u0131\2\uffff"+
			"\1\u012d\1\u0133",
			"\1\u0135\1\u0134\2\uffff\1\u0136",
			"\1\u0137\4\uffff\1\u0138",
			"\1\u0139",
			"\12\67\7\uffff\24\67\1\u013a\5\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u013c",
			"\1\u013d",
			"\1\u013f\15\uffff\1\u013e",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0141\4\uffff\1\u0142",
			"\1\u0143\6\uffff\1\u0144",
			"\1\u0145",
			"\1\u0146\15\uffff\1\u0147",
			"\1\u0148",
			"\1\u0149",
			"\1\u014a\3\uffff\1\u014b",
			"\1\u014d\5\uffff\1\u014c",
			"\1\u014e",
			"\1\u014f",
			"\1\u0150",
			"\1\u0151",
			"\1\u0156\10\uffff\1\u0152\1\u0155\4\uffff\1\u0153\1\uffff\1\u0154",
			"\1\u0158\15\uffff\1\u0157",
			"\1\u0159",
			"\1\u015a",
			"\1\u015d\15\uffff\1\u015c\2\uffff\1\u015b",
			"\1\u015e",
			"\1\u015f",
			"\1\u0160",
			"\1\u0161",
			"\1\u0162",
			"\1\u0163",
			"\1\u0168\1\u0169\1\uffff\1\u0166\4\uffff\1\u0164\2\uffff\1\u0167\1\u016a"+
			"\5\uffff\1\u0165",
			"\1\u016c\3\uffff\1\u016b",
			"\1\u016d",
			"\1\u016e",
			"\1\u016f",
			"\1\u0170\3\uffff\1\u0172\5\uffff\1\u0171",
			"\1\u0173\1\uffff\1\u0174",
			"\1\u0175",
			"\1\u0177\23\uffff\1\u0176",
			"\1\u0178",
			"\1\u0179",
			"\1\u017a",
			"\1\u017b",
			"\1\u017c",
			"\1\u0183\1\u017d\1\u0184\1\u0180\1\uffff\1\u0189\1\u0181\4\uffff\1\u0188"+
			"\1\uffff\1\u017f\1\u0187\1\u017e\2\uffff\1\u0185\2\uffff\1\u0182\1\u0186",
			"\1\u018b\12\uffff\1\u018a",
			"\1\u018c",
			"\1\u018d",
			"\1\u018e\1\u018f\1\u0190\4\uffff\1\u0191",
			"\1\u0192",
			"\1\u0193\11\uffff\1\u0194",
			"\1\u0195\3\uffff\1\u0196",
			"\1\u0198\17\uffff\1\u0197",
			"\1\u0199",
			"\1\u019b\17\uffff\1\u019a",
			"\1\u019c",
			"\1\u019e\1\uffff\1\u019d",
			"\1\u01a1\12\uffff\1\u01a0\1\uffff\1\u019f\3\uffff\1\u01a2",
			"\1\u01a3",
			"\1\u01a5\3\uffff\1\u01a4\3\uffff\1\u01a6",
			"\1\u01a7",
			"\1\u01a9\5\uffff\1\u01a8",
			"\1\u01aa",
			"\1\u01ab",
			"\1\u01ac",
			"\1\u01ad",
			"",
			"",
			"",
			"",
			"\1\u01ae",
			"\1\u01b0\3\uffff\1\u01af",
			"\1\u01b1",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\47\u00c1\1\u00c3\64\u00c1\1\u00c2\uffa3\u00c1",
			"\0\u01b3",
			"\1\64\4\uffff\1\63",
			"\42\u00c4\1\u00c6\71\u00c4\1\u00c5\uffa3\u00c4",
			"\0\u01b5",
			"\1\64\4\uffff\1\63",
			"\12\u01b6\7\uffff\6\u01b6\32\uffff\6\u01b6",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u00ca\1\uffff\12\u00c9\7\uffff\1\67\1\u00ce\1\67\1\u00cd\1\u00cb"+
			"\1\67\1\u00cf\3\67\1\u00cf\1\u00c8\1\u00cf\5\67\1\u00c8\5\67\1\u00c8"+
			"\1\67\4\uffff\1\67\1\uffff\1\67\1\u00cf\2\67\1\u00cb\1\67\1\u00cf\3\67"+
			"\1\u00cf\1\67\1\u00cf\15\67",
			"\12\u01b8\10\uffff\1\u01ba\1\uffff\1\u01ba\1\u01b9\37\uffff\1\u01b9",
			"\1\u01bb\1\uffff\1\u01bb\2\uffff\12\u01bc",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\3\67\1\u01bd\26\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u01bf\10\uffff\1\u01c0",
			"\1\u01c1",
			"\1\u01c2",
			"\1\u01c3",
			"\1\u01c4",
			"",
			"\1\u01c5",
			"\1\u01c6",
			"\1\u01c7",
			"\1\u01c8",
			"\1\u01c9",
			"\1\u01ca",
			"\1\u01cb",
			"\1\u01cc",
			"\1\u01cd",
			"\1\u01ce",
			"\1\u01cf",
			"\1\u01d0",
			"\1\u01d1",
			"\1\u01d2\15\uffff\1\u01d3",
			"\12\67\7\uffff\2\67\1\u01d6\1\67\1\u01d5\7\67\1\u01d4\15\67\4\uffff"+
			"\1\67\1\uffff\32\67",
			"\1\u01d8",
			"\1\u01d9",
			"\12\67\7\uffff\16\67\1\u01da\13\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u01dc",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u01df",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u01e1",
			"\1\u01e2",
			"\1\u01e3",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u01e5",
			"\1\u01e6\6\uffff\1\u01e7",
			"\1\u01e8",
			"\1\u01e9",
			"",
			"\1\u01ea",
			"\1\u01eb",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u01ec",
			"\1\u01ed",
			"\1\u01ee",
			"\1\u01ef",
			"\1\u01f0",
			"\1\u01f1",
			"",
			"\1\u01f2",
			"\12\67\7\uffff\4\67\1\u01f3\12\67\1\u01f4\12\67\4\uffff\1\67\1\uffff"+
			"\32\67",
			"\1\u01f6",
			"",
			"\1\u01f7",
			"",
			"\1\u01f8",
			"\1\u01f9",
			"\1\u01fa",
			"\1\u01fb",
			"\1\u01fc",
			"\1\u01fd",
			"\1\u01fe",
			"\1\u01ff",
			"\1\u0200",
			"\1\u0201",
			"\1\u0202",
			"\1\u0203\11\uffff\1\u0204",
			"\1\u0205",
			"\1\u0206",
			"\1\u0207",
			"",
			"\1\u0208",
			"\1\u0209",
			"\1\u020a\23\uffff\1\u020b",
			"\12\67\7\uffff\4\67\1\u020c\11\67\1\u020d\13\67\4\uffff\1\67\1\uffff"+
			"\32\67",
			"\1\u020f",
			"",
			"\1\u0210",
			"\1\u0211",
			"",
			"\1\u0212",
			"\1\u0213",
			"\1\u0214",
			"\1\u0215\2\uffff\1\u0217\3\uffff\1\u0216",
			"\1\u0219\2\uffff\1\u0218\2\uffff\1\u021a",
			"\1\u021b\14\uffff\1\u021c",
			"\1\u021d",
			"\1\u021e",
			"\1\u021f",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0221",
			"\1\u0222",
			"\1\u0223",
			"\1\u0224",
			"\12\67\7\uffff\10\67\1\u0225\21\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0228\3\uffff\1\u0227",
			"\1\u0229",
			"\1\u022a",
			"\1\u022d\3\uffff\1\u022b\3\uffff\1\u022c",
			"\1\u022e",
			"\1\u0230\22\uffff\1\u022f",
			"\1\u0231",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0233\3\uffff\1\u0234",
			"\12\67\7\uffff\16\67\1\u0236\3\67\1\u0235\7\67\4\uffff\1\67\1\uffff"+
			"\32\67",
			"\1\u0238",
			"\1\u0239",
			"",
			"\1\u023a",
			"\1\u023b",
			"\1\u023c",
			"\1\u023d",
			"",
			"\1\u023e",
			"\1\u023f",
			"\1\u0240",
			"\1\u0241",
			"\1\u0242",
			"\1\u0243",
			"\1\u0244",
			"\1\u0245",
			"\1\u0246",
			"\1\u0248\3\uffff\1\u0247",
			"\1\u0249",
			"\1\u024a",
			"\1\u024b",
			"\1\u024c",
			"\1\u024d",
			"\1\u024e",
			"\1\u024f",
			"\1\u0250",
			"\1\u0251\21\uffff\1\u0252",
			"\12\67\7\uffff\22\67\1\u0253\7\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0255",
			"\1\u0256",
			"\1\u0257",
			"\1\u0258",
			"\1\u0259",
			"\1\u025a",
			"\1\u025d\3\uffff\1\u025b\13\uffff\1\u025c",
			"\1\u025e",
			"\1\u0260\1\uffff\1\u025f",
			"\1\u0261",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0263",
			"\1\u0264",
			"\1\u0265",
			"\1\u0266",
			"\1\u0268\1\uffff\1\u0267",
			"\1\u0269\3\uffff\1\u026a",
			"\1\u026b",
			"\1\u026c",
			"\1\u026d",
			"\1\u026e",
			"\1\u026f",
			"\1\u0270",
			"\12\67\7\uffff\21\67\1\u0271\10\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\u0273\1\uffff\32\67",
			"\1\u0275",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0278\17\uffff\1\u0277",
			"\1\u0279",
			"\1\u027b\1\u027a",
			"\1\u027c",
			"\1\u027d",
			"\1\u027e",
			"\1\u027f",
			"\1\u0280",
			"\1\u0281",
			"\1\u0282",
			"\1\u0283",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0285",
			"\1\u0286",
			"\1\u0287\12\uffff\1\u0288",
			"\1\u0289",
			"\1\u028a",
			"\1\u028b",
			"\1\u028c",
			"\1\u028d",
			"\1\u028e",
			"\1\u0290\4\uffff\1\u028f",
			"\1\u0291",
			"\1\u0292",
			"\1\u0293\11\uffff\1\u0294",
			"\1\u0295",
			"\12\67\7\uffff\22\67\1\u0296\7\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0299\6\uffff\1\u0298",
			"\1\u029a",
			"\1\u029b",
			"\1\u029d\10\uffff\1\u029c",
			"\1\u029e\2\uffff\1\u029f",
			"\1\u02a1\2\uffff\1\u02a2\14\uffff\1\u02a3\1\u02a0",
			"\1\u02a4",
			"\1\u02a5",
			"\1\u02a6",
			"\1\u02a8\4\uffff\1\u02a7",
			"\1\u02a9\3\uffff\1\u02aa",
			"\1\u02ab",
			"\1\u02ae\1\uffff\1\u02ad\16\uffff\1\u02ac",
			"\1\u02af",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u02b2\1\u02b1",
			"\1\u02b3",
			"\1\u02b4",
			"\1\u02b5",
			"\1\u02b6",
			"\12\67\7\uffff\11\67\1\u02b7\5\67\1\u02b8\12\67\4\uffff\1\67\1\uffff"+
			"\32\67",
			"\1\u02ba",
			"\1\u02bb",
			"\1\u02bd\1\uffff\1\u02bc",
			"\1\u02be",
			"\1\u02bf",
			"\1\u02c0",
			"\1\u02c1",
			"\1\u02c2",
			"\1\u02c3",
			"\1\u02c5\13\uffff\1\u02c4",
			"\1\u02c6",
			"\1\u02c7",
			"\12\67\7\uffff\22\67\1\u02c8\7\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u02ca",
			"\1\u02cb",
			"\1\u02cc",
			"\1\u02cd",
			"",
			"",
			"\47\u00c1\1\u00c3\64\u00c1\1\u00c2\uffa3\u00c1",
			"",
			"\42\u00c4\1\u00c6\71\u00c4\1\u00c5\uffa3\u00c4",
			"\12\u01b6\7\uffff\6\u01b6\24\67\4\uffff\1\67\1\uffff\6\u01b6\24\67",
			"",
			"\12\u01b8\10\uffff\1\u01ba\1\uffff\1\u01ba\1\u01b9\37\uffff\1\u01b9",
			"\1\u02cf\1\uffff\1\u02cf\2\uffff\12\u02d0",
			"",
			"\12\u02d1",
			"\12\u01bc\7\uffff\1\67\1\u02d2\1\67\1\u00cd\26\67\4\uffff\1\67\1\uffff"+
			"\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u02d4",
			"\1\u02d5",
			"\1\u02d6",
			"\1\u02d7",
			"\1\u02d8",
			"\1\u02d9",
			"\12\67\7\uffff\22\67\1\u02da\7\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u02dc",
			"\1\u02dd",
			"\1\u02de",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u02e0",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u02e3",
			"\1\u02e4",
			"\1\u02e5",
			"\12\67\7\uffff\5\67\1\u02e6\24\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u02e8",
			"\1\u02e9",
			"\1\u02ea",
			"\1\u02eb",
			"\1\u02ec",
			"",
			"\1\u02ed",
			"\1\u02ee",
			"\1\u02ef",
			"",
			"\1\u02f0",
			"",
			"",
			"\1\u02f1",
			"",
			"\1\u02f2",
			"\1\u02f3",
			"\1\u02f4",
			"",
			"\1\u02f5",
			"\1\u02f6",
			"\1\u02f7",
			"\1\u02f8",
			"\1\u02f9",
			"\1\u02fa",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u02fc",
			"\1\u02fd",
			"\1\u02fe",
			"\12\67\7\uffff\22\67\1\u02ff\7\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0301",
			"\1\u0302",
			"\12\67\7\uffff\26\67\1\u0303\3\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0305",
			"\1\u0306",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0308",
			"\1\u0309",
			"\1\u030a",
			"\1\u030b",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u030d",
			"\1\u030e",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0310",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0313",
			"\1\u0314\7\uffff\1\u0315",
			"\12\67\7\uffff\22\67\1\u0316\7\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0319",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u031b",
			"\1\u031c",
			"\1\u031d",
			"\1\u031e",
			"\1\u031f\12\uffff\1\u0320",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u0322",
			"\1\u0323",
			"\1\u0324",
			"\1\u0325",
			"\1\u0326",
			"\1\u0327",
			"\1\u0328",
			"\1\u0329",
			"\1\u032a",
			"\1\u032b",
			"\1\u032c",
			"\1\u032d",
			"\1\u032f\3\uffff\1\u032e",
			"\1\u0330",
			"\1\u0331",
			"\1\u0332",
			"\1\u0333",
			"",
			"\1\u0334",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0336",
			"\12\67\7\uffff\21\67\1\u0337\10\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0339",
			"",
			"\1\u033a",
			"\1\u033b",
			"\1\u033c",
			"\1\u033d",
			"\1\u033e",
			"\1\u033f",
			"\1\u0340",
			"\1\u0341",
			"\1\u0342\10\uffff\1\u0343",
			"\1\u0344",
			"\1\u0345",
			"",
			"\12\67\7\uffff\1\67\1\u0346\30\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\23\67\1\u0348\6\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u034a",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u034c",
			"\1\u034d",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u034f",
			"\1\u0350",
			"\1\u0351",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0353",
			"\1\u0354",
			"\1\u0355",
			"\1\u0356",
			"\1\u0357",
			"\1\u0358",
			"\12\67\7\uffff\22\67\1\u0359\7\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u035b",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u035d",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u035f",
			"\12\67\7\uffff\22\67\1\u0360\7\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\13\67\1\u0362\16\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0364",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0366",
			"\1\u0367",
			"\1\u0368",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u036b",
			"\12\67\7\uffff\32\67\4\uffff\1\u036c\1\uffff\32\67",
			"\1\u036e",
			"\12\67\7\uffff\4\67\1\u036f\25\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0371",
			"\1\u0372",
			"\1\u0373",
			"\1\u0374",
			"\1\u0375",
			"\1\u0376\13\uffff\1\u0377",
			"\1\u0378",
			"\1\u037a\10\uffff\1\u0379",
			"",
			"\1\u037b",
			"\1\u037c",
			"\1\u037d",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u037f",
			"\1\u0380",
			"\1\u0381",
			"\1\u0382",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0384",
			"\1\u0385",
			"\1\u0386",
			"\1\u0387",
			"\1\u0388",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u038a",
			"",
			"\1\u038b",
			"",
			"\1\u038c",
			"\1\u038e\3\uffff\1\u038d",
			"\1\u038f",
			"\1\u0390",
			"\1\u0391",
			"\1\u0392",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0394",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\22\67\1\u0396\7\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0398",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\2\67\1\u039a\27\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u039c",
			"\1\u039d",
			"\1\u039e",
			"\12\67\7\uffff\1\u03a0\7\67\1\u039f\21\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03a2",
			"\1\u03a3",
			"\1\u03a4",
			"\1\u03a5",
			"\12\67\7\uffff\22\67\1\u03a6\7\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03a8",
			"\1\u03a9",
			"\1\u03aa",
			"\1\u03ab",
			"\1\u03ac",
			"\1\u03ad",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03af",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u03b2\22\uffff\1\u03b1",
			"\12\67\7\uffff\22\67\1\u03b3\7\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03b5",
			"\1\u03b6",
			"\1\u03b7",
			"\1\u03b8",
			"\1\u03b9\3\uffff\1\u03ba",
			"\1\u03bc\23\uffff\1\u03bb",
			"\1\u03bd",
			"\1\u03be",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03c0",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03c2",
			"\1\u03c3",
			"\1\u03c4",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03c6",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03c8",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03cb",
			"\1\u03cc",
			"",
			"\1\u03cd",
			"\1\u03ce",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03d1",
			"\1\u03d2",
			"\1\u03d3",
			"\1\u03d4",
			"",
			"\1\u03d5",
			"\1\u03d6",
			"\1\u03d7",
			"\1\u03d8",
			"\1\u03d9\1\u03da",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03dc",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03df",
			"\1\u03e0",
			"\1\u03e1",
			"\12\67\7\uffff\22\67\1\u03e2\7\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03e4",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\22\67\1\u03e7\7\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03e9",
			"\1\u03ea",
			"",
			"\12\u02d0",
			"\12\u02d0\10\uffff\1\u01ba\1\uffff\1\u01ba",
			"\12\u02d1\10\uffff\1\u01ba\1\uffff\1\u01ba",
			"\1\u01bd",
			"",
			"\1\u03eb",
			"\1\u03ed\4\uffff\1\u03ec",
			"\1\u03ee",
			"\12\67\7\uffff\22\67\1\u03ef\7\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03f2",
			"\1\u03f3",
			"",
			"\1\u03f4",
			"\1\u03f5",
			"\1\u03f6",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\1\u03f8",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03fa",
			"\1\u03fb",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u03fe",
			"\1\u03ff",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0401",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0403",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0405",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0408",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u040a",
			"\1\u040b",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u040d\3\uffff\1\u040e",
			"\1\u040f",
			"",
			"\1\u0410",
			"\1\u0411",
			"\1\u0412",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u0414",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0416",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0418",
			"",
			"\1\u0419",
			"\1\u041a",
			"\1\u041b",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u041f",
			"",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0422",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\1\u0424",
			"",
			"\1\u0425",
			"\12\67\7\uffff\4\67\1\u0426\25\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0428",
			"\1\u042a\1\uffff\1\u0429",
			"\1\u042b",
			"\1\u042d\2\uffff\1\u042c",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u042f",
			"\1\u0430",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0432",
			"\1\u0433",
			"\1\u0434",
			"\1\u0435",
			"\1\u0436",
			"\1\u0437",
			"\1\u0438",
			"\1\u0439",
			"\1\u043a",
			"\1\u043b",
			"\1\u043c",
			"\1\u043d",
			"\1\u043e",
			"\1\u043f",
			"\1\u0440",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0442",
			"",
			"\1\u0443",
			"\1\u0444",
			"\1\u0445",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0447",
			"\1\u0448",
			"\1\u0449",
			"\1\u044a",
			"\1\u044b",
			"\1\u044c",
			"\1\u044d",
			"\1\u044e",
			"\1\u044f",
			"\1\u0450",
			"",
			"\1\u0451",
			"",
			"\1\u0452",
			"",
			"\1\u0453",
			"\1\u0454",
			"",
			"\12\67\7\uffff\10\67\1\u0455\21\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0458",
			"",
			"\1\u0459",
			"\1\u045a",
			"\1\u045b",
			"\1\u045c",
			"\1\u045d",
			"\1\u045e",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u0461",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u0462",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u0464",
			"\12\67\7\uffff\17\67\1\u0465\12\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0467",
			"",
			"",
			"\1\u0468",
			"\1\u0469",
			"",
			"\1\u046a",
			"\1\u046b",
			"",
			"\1\u046c",
			"\1\u046d",
			"\1\u046e",
			"\1\u046f",
			"\1\u0470",
			"\1\u0471",
			"\1\u0472",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0474",
			"\1\u0475",
			"\1\u0476",
			"\1\u0477",
			"\1\u0478",
			"",
			"\1\u0479",
			"\12\67\7\uffff\23\67\1\u047a\6\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u047d",
			"",
			"\1\u047e",
			"\1\u047f",
			"\1\u0480",
			"\1\u0481",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u0483",
			"\1\u0484",
			"\1\u0485",
			"\1\u0486",
			"\1\u0487",
			"\1\u0488",
			"\1\u0489",
			"\1\u048a",
			"\1\u048b",
			"",
			"\1\u048c",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u048f",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0491",
			"\1\u0492",
			"\1\u0493",
			"\1\u0494",
			"",
			"\1\u0495",
			"\1\u0496",
			"\1\u0497",
			"\1\u0498",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u049a",
			"\1\u049b",
			"\1\u049c",
			"\1\u049d",
			"\1\u049e",
			"\1\u049f",
			"",
			"\1\u04a0",
			"",
			"\1\u04a1",
			"\1\u04a2",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u04a6",
			"\1\u04a7",
			"\1\u04a8",
			"\1\u04a9",
			"\1\u04aa",
			"\1\u04ab",
			"\1\u04ac",
			"\1\u04ad",
			"",
			"\1\u04ae",
			"",
			"\1\u04af",
			"\1\u04b0",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u04b2",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\1\u04b4",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u04b6",
			"\1\u04b7",
			"",
			"",
			"\1\u04b8",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u04ba",
			"\1\u04bb",
			"\1\u04bc",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u04be",
			"\1\u04bf",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u04c1",
			"",
			"\12\67\7\uffff\22\67\1\u04c2\7\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\1\u04c4",
			"\1\u04c5",
			"\1\u04c6",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u04c8",
			"",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\u04c9\1\uffff\32\67",
			"\1\u04cb",
			"\1\u04cc",
			"\1\u04cd",
			"\1\u04ce",
			"\1\u04cf",
			"\12\67\7\uffff\1\u04d0\31\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\1\u04d2",
			"\1\u04d3",
			"\1\u04d4",
			"\1\u04d5",
			"\1\u04d6",
			"",
			"\1\u04d7",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u04d9",
			"",
			"",
			"\12\67\7\uffff\23\67\1\u04da\6\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u04dc",
			"",
			"\1\u04dd",
			"",
			"\1\u04de",
			"",
			"\1\u04df",
			"",
			"",
			"\1\u04e0",
			"",
			"\1\u04e1",
			"\1\u04e2",
			"",
			"\1\u04e3",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u04e5",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u04e7",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u04e9",
			"",
			"\1\u04ea",
			"",
			"\1\u04ec\1\uffff\1\u04eb",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u04ef",
			"",
			"",
			"",
			"\1\u04f0",
			"",
			"",
			"\1\u04f1",
			"",
			"\1\u04f2",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u04f4",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u04f6",
			"\1\u04f7",
			"\1\u04f8",
			"\1\u04f9",
			"\1\u04fa",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u04fc",
			"",
			"\1\u04fd",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0500",
			"\1\u0501",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0503",
			"\1\u0504",
			"\1\u0505",
			"\1\u0506",
			"\1\u0507",
			"\1\u0508",
			"\1\u0509",
			"\12\67\7\uffff\3\67\1\u050a\26\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u050c",
			"",
			"\1\u050d",
			"\1\u050e",
			"\1\u050f",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u0511",
			"\1\u0512",
			"\1\u0513",
			"\1\u0514",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0516",
			"\1\u0517",
			"\1\u0518",
			"\1\u0519",
			"\1\u051a",
			"\1\u051b",
			"\1\u051c",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u051e",
			"\1\u051f",
			"",
			"",
			"\1\u0520",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\22\67\1\u0523\7\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0526",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0529",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u052b",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\22\67\1\u052d\7\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u052f",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0532",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0535",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0537",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\12\67\7\uffff\22\67\1\u0539\7\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u053b",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u053d",
			"\1\u053e",
			"\12\67\7\uffff\11\67\1\u053f\20\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0541",
			"",
			"",
			"\1\u0542",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0544",
			"\1\u0545",
			"\1\u0546",
			"",
			"\1\u0547",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0549",
			"\1\u054a",
			"\1\u054b",
			"\1\u054c",
			"\1\u054d",
			"\1\u054e",
			"\1\u054f",
			"\1\u0550",
			"",
			"",
			"\1\u0551",
			"",
			"\1\u0552",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0554",
			"\1\u0555",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u055a\4\uffff\1\u055b",
			"\1\u055c",
			"\1\u055d",
			"\1\u055e",
			"\1\u055f",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0561",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0563",
			"",
			"",
			"",
			"\12\67\7\uffff\22\67\1\u0564\7\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0566",
			"\1\u0567",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0569",
			"\1\u056a",
			"\1\u056b",
			"\1\u056c",
			"\1\u056d",
			"\1\u056e",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u0571",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0573",
			"\1\u0574",
			"",
			"\1\u0575",
			"\1\u0576",
			"\1\u0577\10\uffff\1\u0578",
			"",
			"\1\u0579",
			"\1\u057a",
			"",
			"\12\67\7\uffff\22\67\1\u057b\7\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u057d",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u057f",
			"",
			"\1\u0580",
			"\1\u0581",
			"",
			"\1\u0582",
			"\1\u0583",
			"\1\u0584",
			"\1\u0585",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0587",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0589",
			"\1\u058a",
			"\1\u058b",
			"\1\u058c",
			"\1\u058d",
			"",
			"\1\u058e",
			"\1\u058f",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0591",
			"\1\u0592",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0595",
			"\1\u0596",
			"\1\u0597",
			"",
			"\1\u0598",
			"",
			"\1\u0599",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u059a",
			"\1\u059b",
			"\1\u059c",
			"",
			"",
			"\1\u059d",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u059f",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u05a2",
			"\1\u05a3",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u05a4",
			"\1\u05a5",
			"",
			"\1\u05a6",
			"\1\u05a7",
			"",
			"",
			"\1\u05a8",
			"\1\u05a9",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u05ab",
			"\1\u05ac",
			"\1\u05ad",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\3\67\1\u05af\26\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u05b2",
			"\1\u05b3",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u05b4",
			"",
			"\1\u05b5",
			"\1\u05b6",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u05b9",
			"\1\u05ba",
			"\12\67\7\uffff\3\67\1\u05bb\26\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u05bd",
			"\1\u05be",
			"\1\u05bf",
			"\1\u05c0",
			"",
			"\1\u05c1",
			"\1\u05c2",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\1\u05c6",
			"",
			"\1\u05c7",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u05c8",
			"",
			"",
			"\1\u05c9",
			"",
			"",
			"\1\u05ca",
			"",
			"\1\u05cb",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u05ce\3\uffff\1\u05cd",
			"",
			"\1\u05cf",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u05d1",
			"",
			"\1\u05d2",
			"\1\u05d3",
			"",
			"\1\u05d4",
			"\1\u05d5",
			"\1\u05d6",
			"\1\u05d7",
			"",
			"\1\u05d8",
			"\1\u05d9",
			"\1\u05da",
			"\1\u05db",
			"\1\u05dc",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u05de",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u05e0",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u05e2",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"",
			"",
			"\1\u05e4",
			"\1\u05e5",
			"\1\u05e6",
			"\1\u05e7",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u05e9",
			"",
			"\1\u05ea",
			"",
			"\1\u05eb",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u05ed",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\10\67\1\u05f0\21\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u05f2",
			"\1\u05f3",
			"\1\u05f4",
			"\12\67\7\uffff\4\67\1\u05f5\15\67\1\u05f6\7\67\4\uffff\1\67\1\uffff"+
			"\32\67",
			"",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\u05f9\1\uffff\32\67",
			"\1\u05fb",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u05fe",
			"\1\u05ff",
			"\1\u0600",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u0603",
			"\1\u0604",
			"\1\u0605",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0608",
			"\1\u0609",
			"",
			"\1\u060a",
			"",
			"\1\u060b",
			"\1\u060c",
			"\1\u060d",
			"\1\u060e",
			"\12\67\7\uffff\22\67\1\u060f\7\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0611",
			"\1\u0612",
			"",
			"\1\u0613",
			"\1\u0614",
			"",
			"",
			"\1\u0615",
			"\1\u0616",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0618",
			"\1\u0619",
			"\1\u061a",
			"\1\u061b",
			"\1\u061c",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\1\u061f",
			"\1\u0620",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0622",
			"\1\u0623",
			"\1\u0624",
			"\1\u0625",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u0627",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u062d",
			"\1\u062e",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0631",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u0633\17\uffff\1\u0632",
			"\12\67\7\uffff\22\67\1\u0634\7\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0637",
			"\1\u0638",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u063b",
			"\1\u063c",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u063e",
			"\1\u063f",
			"",
			"\1\u0640",
			"\1\u0641",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u0643",
			"\1\u0644",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0646",
			"\1\u0647",
			"\1\u0648",
			"\1\u0649",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u064b",
			"\1\u064c",
			"\1\u064d",
			"\1\u064e",
			"",
			"\1\u064f",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u0651",
			"",
			"\1\u0652",
			"\1\u0653",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u0656",
			"\1\u0657",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u0659",
			"",
			"",
			"\1\u065a",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u065c",
			"\1\u065d",
			"\1\u065e",
			"\1\u065f",
			"",
			"",
			"\1\u0660\17\uffff\1\u0661",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\1\u0663",
			"\1\u0664",
			"\1\u0665",
			"",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0667",
			"\1\u0668",
			"",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u066a",
			"\1\u066b",
			"\12\67\7\uffff\13\67\1\u066c\16\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u066e",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0670",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u0672",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0675",
			"\1\u0676",
			"\1\u0677",
			"",
			"\1\u0678",
			"\1\u0679",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u067b",
			"\1\u067c",
			"",
			"",
			"\1\u067d",
			"\1\u067e",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0681",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u0683",
			"",
			"",
			"",
			"",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0685",
			"",
			"",
			"\1\u0686",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0688",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u068b",
			"",
			"",
			"\1\u068c",
			"\1\u068d",
			"",
			"\1\u068e",
			"\1\u068f",
			"\1\u0690",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u0692",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0697",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u069b",
			"\12\67\7\uffff\4\67\1\u069d\15\67\1\u069c\7\67\4\uffff\1\67\1\uffff"+
			"\32\67",
			"",
			"\1\u069f",
			"\1\u06a0",
			"\1\u06a1",
			"",
			"",
			"\1\u06a2",
			"\1\u06a3",
			"",
			"\1\u06a4",
			"\1\u06a5",
			"",
			"\1\u06a6",
			"\1\u06a7",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u06a9",
			"\1\u06aa",
			"\1\u06ab",
			"",
			"\1\u06ac",
			"\1\u06ad",
			"\1\u06ae",
			"",
			"\1\u06af",
			"\1\u06b0",
			"",
			"\1\u06b1",
			"\1\u06b2",
			"\1\u06b3",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u06b5",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\1\u06b7",
			"\1\u06b8",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u06ba",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u06bc",
			"\1\u06bd",
			"\1\u06be",
			"\1\u06bf",
			"",
			"",
			"\1\u06c0",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\3\67\1\u06c3\26\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u06c5",
			"",
			"",
			"\1\u06c6",
			"\1\u06c7",
			"\1\u06c8",
			"\1\u06c9",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u06cb",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"",
			"",
			"\1\u06cd",
			"",
			"",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u06d0",
			"",
			"\1\u06d1",
			"\1\u06d2",
			"\1\u06d3",
			"\1\u06d4",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u06d7",
			"\1\u06d8",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u06da",
			"\1\u06db",
			"\1\u06dc",
			"\1\u06dd",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u06df",
			"\1\u06e0",
			"\1\u06e1",
			"\12\67\7\uffff\1\u06e3\21\67\1\u06e2\7\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u06e6",
			"",
			"\1\u06e7",
			"",
			"\1\u06e8",
			"\1\u06e9",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u06eb",
			"\1\u06ec",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u06ef",
			"",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u06f2",
			"\1\u06f3",
			"\1\u06f4",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u06f6",
			"",
			"\1\u06f7",
			"",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u06fa",
			"\1\u06fb",
			"\1\u06fc",
			"",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u06ff",
			"\1\u0700",
			"\1\u0701",
			"\1\u0702",
			"",
			"\1\u0703",
			"\1\u0704",
			"\1\u0705",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0707",
			"",
			"",
			"\1\u0708",
			"\1\u0709",
			"\1\u070a",
			"\1\u070b",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\1\u070e",
			"",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0710",
			"\1\u0711",
			"",
			"\1\u0712",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0716",
			"",
			"",
			"\1\u0717",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0719",
			"\1\u071a",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u071c",
			"\1\u071d",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u071f",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0721",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u0724",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0726",
			"",
			"",
			"",
			"\1\u0727",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u0729",
			"\1\u072a",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u072c",
			"",
			"\1\u072d",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			"\1\u072f",
			"",
			"\1\u0730",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u0732",
			"\1\u0733",
			"",
			"\1\u0734",
			"\1\u0735",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u0737",
			"",
			"\1\u0738",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\1\u073a",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"\1\u073c",
			"\1\u073d",
			"",
			"\1\u073e",
			"",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"\12\67\7\uffff\32\67\4\uffff\1\67\1\uffff\32\67",
			"",
			"",
			""
	};

	static final short[] DFA36_eot = DFA.unpackEncodedString(DFA36_eotS);
	static final short[] DFA36_eof = DFA.unpackEncodedString(DFA36_eofS);
	static final char[] DFA36_min = DFA.unpackEncodedStringToUnsignedChars(DFA36_minS);
	static final char[] DFA36_max = DFA.unpackEncodedStringToUnsignedChars(DFA36_maxS);
	static final short[] DFA36_accept = DFA.unpackEncodedString(DFA36_acceptS);
	static final short[] DFA36_special = DFA.unpackEncodedString(DFA36_specialS);
	static final short[][] DFA36_transition;

	static {
		int numStates = DFA36_transitionS.length;
		DFA36_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA36_transition[i] = DFA.unpackEncodedString(DFA36_transitionS[i]);
		}
	}

	protected class DFA36 extends DFA {

		public DFA36(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 36;
			this.eot = DFA36_eot;
			this.eof = DFA36_eof;
			this.min = DFA36_min;
			this.max = DFA36_max;
			this.accept = DFA36_accept;
			this.special = DFA36_special;
			this.transition = DFA36_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( KW_TRUE | KW_FALSE | KW_ALL | KW_NONE | KW_AND | KW_OR | KW_NOT | KW_LIKE | KW_ANY | KW_IF | KW_EXISTS | KW_ASC | KW_DESC | KW_NULLS | KW_LAST | KW_ORDER | KW_GROUP | KW_BY | KW_HAVING | KW_WHERE | KW_FROM | KW_AS | KW_SELECT | KW_DISTINCT | KW_INSERT | KW_OVERWRITE | KW_OUTER | KW_UNIQUEJOIN | KW_PRESERVE | KW_JOIN | KW_LEFT | KW_RIGHT | KW_FULL | KW_ON | KW_PARTITION | KW_PARTITIONS | KW_TABLE | KW_TABLES | KW_COLUMNS | KW_INDEX | KW_INDEXES | KW_REBUILD | KW_FUNCTIONS | KW_SHOW | KW_MSCK | KW_REPAIR | KW_DIRECTORY | KW_LOCAL | KW_TRANSFORM | KW_USING | KW_CLUSTER | KW_DISTRIBUTE | KW_SORT | KW_UNION | KW_EXCEPT | KW_LOAD | KW_EXPORT | KW_IMPORT | KW_REPLICATION | KW_METADATA | KW_DATA | KW_INPATH | KW_IS | KW_NULL | KW_CREATE | KW_EXTERNAL | KW_ALTER | KW_CHANGE | KW_COLUMN | KW_FIRST | KW_AFTER | KW_DESCRIBE | KW_DROP | KW_RENAME | KW_TO | KW_COMMENT | KW_BOOLEAN | KW_TINYINT | KW_SMALLINT | KW_INT | KW_BIGINT | KW_FLOAT | KW_DOUBLE | KW_PRECISION | KW_DATE | KW_DATETIME | KW_TIMESTAMP | KW_TIMESTAMPLOCALTZ | KW_TIME | KW_ZONE | KW_INTERVAL | KW_DECIMAL | KW_STRING | KW_CHAR | KW_VARCHAR | KW_ARRAY | KW_STRUCT | KW_MAP | KW_UNIONTYPE | KW_REDUCE | KW_PARTITIONED | KW_CLUSTERED | KW_DISTRIBUTED | KW_SORTED | KW_INTO | KW_BUCKETS | KW_ROW | KW_ROWS | KW_FORMAT | KW_DELIMITED | KW_FIELDS | KW_TERMINATED | KW_ESCAPED | KW_COLLECTION | KW_ITEMS | KW_KEYS | KW_KEY_TYPE | KW_KILL | KW_LINES | KW_STORED | KW_FILEFORMAT | KW_INPUTFORMAT | KW_OUTPUTFORMAT | KW_INPUTDRIVER | KW_OUTPUTDRIVER | KW_ENABLE | KW_DISABLE | KW_EXECUTED | KW_EXECUTE | KW_LOCATION | KW_MANAGEDLOCATION | KW_TABLESAMPLE | KW_BUCKET | KW_OUT | KW_OF | KW_PERCENT | KW_CAST | KW_ADD | KW_REPLACE | KW_RLIKE | KW_REGEXP | KW_TEMPORARY | KW_FUNCTION | KW_MACRO | KW_FILE | KW_JAR | KW_EXPLAIN | KW_EXTENDED | KW_DEBUG | KW_FORMATTED | KW_DEPENDENCY | KW_LOGICAL | KW_CBO | KW_SERDE | KW_WITH | KW_DEFERRED | KW_SERDEPROPERTIES | KW_DBPROPERTIES | KW_LIMIT | KW_OFFSET | KW_SET | KW_UNSET | KW_TBLPROPERTIES | KW_IDXPROPERTIES | KW_VALUE_TYPE | KW_ELEM_TYPE | KW_DEFINED | KW_CASE | KW_WHEN | KW_THEN | KW_ELSE | KW_END | KW_MAPJOIN | KW_STREAMTABLE | KW_CLUSTERSTATUS | KW_UTC | KW_UTCTIMESTAMP | KW_LONG | KW_DELETE | KW_PLUS | KW_MINUS | KW_FETCH | KW_INTERSECT | KW_VIEW | KW_VIEWS | KW_IN | KW_DATABASE | KW_DATABASES | KW_MATERIALIZED | KW_SCHEMA | KW_SCHEMAS | KW_GRANT | KW_REVOKE | KW_SSL | KW_UNDO | KW_LOCK | KW_LOCKS | KW_UNLOCK | KW_SHARED | KW_EXCLUSIVE | KW_PROCEDURE | KW_UNSIGNED | KW_WHILE | KW_READ | KW_READS | KW_PURGE | KW_RANGE | KW_ANALYZE | KW_BEFORE | KW_BETWEEN | KW_BOTH | KW_BINARY | KW_CROSS | KW_CONTINUE | KW_CURSOR | KW_TRIGGER | KW_RECORDREADER | KW_RECORDWRITER | KW_SEMI | KW_LATERAL | KW_TOUCH | KW_ARCHIVE | KW_UNARCHIVE | KW_COMPUTE | KW_STATISTICS | KW_USE | KW_OPTION | KW_CONCATENATE | KW_SHOW_DATABASE | KW_UPDATE | KW_RESTRICT | KW_CASCADE | KW_SKEWED | KW_ROLLUP | KW_CUBE | KW_DIRECTORIES | KW_FOR | KW_WINDOW | KW_UNBOUNDED | KW_PRECEDING | KW_FOLLOWING | KW_CURRENT | KW_CURRENT_DATE | KW_CURRENT_TIMESTAMP | KW_LESS | KW_MORE | KW_OVER | KW_GROUPING | KW_SETS | KW_TRUNCATE | KW_NOSCAN | KW_USER | KW_ROLE | KW_ROLES | KW_INNER | KW_EXCHANGE | KW_URI | KW_SERVER | KW_ADMIN | KW_OWNER | KW_PRINCIPALS | KW_COMPACT | KW_COMPACTIONS | KW_TRANSACTIONS | KW_TRANSACTIONAL | KW_REWRITE | KW_AUTHORIZATION | KW_REOPTIMIZATION | KW_CONF | KW_VALUES | KW_RELOAD | KW_YEAR | KW_QUERY | KW_QUARTER | KW_MONTH | KW_WEEK | KW_DAY | KW_DOW | KW_HOUR | KW_MINUTE | KW_SECOND | KW_START | KW_TRANSACTION | KW_COMMIT | KW_ROLLBACK | KW_WORK | KW_ONLY | KW_WRITE | KW_ISOLATION | KW_LEVEL | KW_SNAPSHOT | KW_AUTOCOMMIT | KW_CACHE | KW_PRIMARY | KW_FOREIGN | KW_REFERENCES | KW_CONSTRAINT | KW_FORCE | KW_ENFORCED | KW_VALIDATE | KW_NOVALIDATE | KW_RELY | KW_NORELY | KW_UNIQUE | KW_KEY | KW_ABORT | KW_EXTRACT | KW_FLOOR | KW_MERGE | KW_MATCHED | KW_REPL | KW_DUMP | KW_STATUS | KW_VECTORIZATION | KW_SUMMARY | KW_OPERATOR | KW_EXPRESSION | KW_DETAIL | KW_WAIT | KW_RESOURCE | KW_PLAN | KW_QUERY_PARALLELISM | KW_PLANS | KW_ACTIVATE | KW_DEFAULT | KW_CHECK | KW_POOL | KW_MOVE | KW_DO | KW_ALLOC_FRACTION | KW_SCHEDULING_POLICY | KW_SCHEDULED | KW_EVERY | KW_AT | KW_CRON | KW_PATH | KW_MAPPING | KW_WORKLOAD | KW_MANAGEMENT | KW_ACTIVE | KW_UNMANAGED | KW_APPLICATION | KW_SYNC | KW_COST | KW_JOINCOST | DOT | COLON | COMMA | SEMICOLON | LPAREN | RPAREN | LSQUARE | RSQUARE | LCURLY | RCURLY | EQUAL | EQUAL_NS | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN | DIVIDE | PLUS | MINUS | STAR | MOD | DIV | AMPERSAND | TILDE | BITWISEOR | CONCATENATE | BITWISEXOR | QUESTION | DOLLAR | StringLiteral | CharSetLiteral | IntegralLiteral | NumberLiteral | ByteLengthLiteral | Number | Identifier | CharSetName | WS | LINE_COMMENT | QUERY_HINT );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA36_51 = input.LA(1);
						s = -1;
						if ( ((LA36_51 >= '\u0000' && LA36_51 <= '&')||(LA36_51 >= '(' && LA36_51 <= '[')||(LA36_51 >= ']' && LA36_51 <= '\uFFFF')) ) {s = 193;}
						else if ( (LA36_51=='\\') ) {s = 194;}
						else if ( (LA36_51=='\'') ) {s = 195;}
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA36_52 = input.LA(1);
						s = -1;
						if ( ((LA36_52 >= '\u0000' && LA36_52 <= '!')||(LA36_52 >= '#' && LA36_52 <= '[')||(LA36_52 >= ']' && LA36_52 <= '\uFFFF')) ) {s = 196;}
						else if ( (LA36_52=='\\') ) {s = 197;}
						else if ( (LA36_52=='\"') ) {s = 198;}
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA36_194 = input.LA(1);
						s = -1;
						if ( ((LA36_194 >= '\u0000' && LA36_194 <= '\uFFFF')) ) {s = 435;}
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA36_197 = input.LA(1);
						s = -1;
						if ( ((LA36_197 >= '\u0000' && LA36_197 <= '\uFFFF')) ) {s = 437;}
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA36_193 = input.LA(1);
						s = -1;
						if ( (LA36_193=='\'') ) {s = 195;}
						else if ( ((LA36_193 >= '\u0000' && LA36_193 <= '&')||(LA36_193 >= '(' && LA36_193 <= '[')||(LA36_193 >= ']' && LA36_193 <= '\uFFFF')) ) {s = 193;}
						else if ( (LA36_193=='\\') ) {s = 194;}
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA36_435 = input.LA(1);
						s = -1;
						if ( (LA36_435=='\'') ) {s = 195;}
						else if ( ((LA36_435 >= '\u0000' && LA36_435 <= '&')||(LA36_435 >= '(' && LA36_435 <= '[')||(LA36_435 >= ']' && LA36_435 <= '\uFFFF')) ) {s = 193;}
						else if ( (LA36_435=='\\') ) {s = 194;}
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA36_196 = input.LA(1);
						s = -1;
						if ( (LA36_196=='\"') ) {s = 198;}
						else if ( ((LA36_196 >= '\u0000' && LA36_196 <= '!')||(LA36_196 >= '#' && LA36_196 <= '[')||(LA36_196 >= ']' && LA36_196 <= '\uFFFF')) ) {s = 196;}
						else if ( (LA36_196=='\\') ) {s = 197;}
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA36_437 = input.LA(1);
						s = -1;
						if ( (LA36_437=='\"') ) {s = 198;}
						else if ( ((LA36_437 >= '\u0000' && LA36_437 <= '!')||(LA36_437 >= '#' && LA36_437 <= '[')||(LA36_437 >= ']' && LA36_437 <= '\uFFFF')) ) {s = 196;}
						else if ( (LA36_437=='\\') ) {s = 197;}
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 36, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
