package persons.tasks3.merger.mdsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import persons.tasks3.merger.mdsl.services.MergerDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMergerDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Planning'", "'Person:'", "'Task:'", "'persons:'", "'priority:'", "'duration:'", "'Lunch'", "'Meeting'", "'Report'", "'Pay'", "'euro'", "'min'", "'hour'", "'day'", "'week'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMergerDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMergerDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMergerDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMergerDsl.g"; }



     	private MergerDslGrammarAccess grammarAccess;

        public InternalMergerDslParser(TokenStream input, MergerDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Planning";
       	}

       	@Override
       	protected MergerDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePlanning"
    // InternalMergerDsl.g:65:1: entryRulePlanning returns [EObject current=null] : iv_rulePlanning= rulePlanning EOF ;
    public final EObject entryRulePlanning() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePlanning = null;


        try {
            // InternalMergerDsl.g:65:49: (iv_rulePlanning= rulePlanning EOF )
            // InternalMergerDsl.g:66:2: iv_rulePlanning= rulePlanning EOF
            {
             newCompositeNode(grammarAccess.getPlanningRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePlanning=rulePlanning();

            state._fsp--;

             current =iv_rulePlanning; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePlanning"


    // $ANTLR start "rulePlanning"
    // InternalMergerDsl.g:72:1: rulePlanning returns [EObject current=null] : (otherlv_0= 'Planning' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_persons_2_0= rulePerson ) ) | ( (lv_tasks_3_0= ruleTask ) ) )* ) ;
    public final EObject rulePlanning() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_persons_2_0 = null;

        EObject lv_tasks_3_0 = null;



        	enterRule();

        try {
            // InternalMergerDsl.g:78:2: ( (otherlv_0= 'Planning' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_persons_2_0= rulePerson ) ) | ( (lv_tasks_3_0= ruleTask ) ) )* ) )
            // InternalMergerDsl.g:79:2: (otherlv_0= 'Planning' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_persons_2_0= rulePerson ) ) | ( (lv_tasks_3_0= ruleTask ) ) )* )
            {
            // InternalMergerDsl.g:79:2: (otherlv_0= 'Planning' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_persons_2_0= rulePerson ) ) | ( (lv_tasks_3_0= ruleTask ) ) )* )
            // InternalMergerDsl.g:80:3: otherlv_0= 'Planning' ( (lv_name_1_0= RULE_ID ) ) ( ( (lv_persons_2_0= rulePerson ) ) | ( (lv_tasks_3_0= ruleTask ) ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPlanningAccess().getPlanningKeyword_0());
            		
            // InternalMergerDsl.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMergerDsl.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMergerDsl.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalMergerDsl.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPlanningAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPlanningRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMergerDsl.g:102:3: ( ( (lv_persons_2_0= rulePerson ) ) | ( (lv_tasks_3_0= ruleTask ) ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }
                else if ( (LA1_0==13) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMergerDsl.g:103:4: ( (lv_persons_2_0= rulePerson ) )
            	    {
            	    // InternalMergerDsl.g:103:4: ( (lv_persons_2_0= rulePerson ) )
            	    // InternalMergerDsl.g:104:5: (lv_persons_2_0= rulePerson )
            	    {
            	    // InternalMergerDsl.g:104:5: (lv_persons_2_0= rulePerson )
            	    // InternalMergerDsl.g:105:6: lv_persons_2_0= rulePerson
            	    {

            	    						newCompositeNode(grammarAccess.getPlanningAccess().getPersonsPersonParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_persons_2_0=rulePerson();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPlanningRule());
            	    						}
            	    						add(
            	    							current,
            	    							"persons",
            	    							lv_persons_2_0,
            	    							"persons.tasks3.merger.mdsl.MergerDsl.Person");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMergerDsl.g:123:4: ( (lv_tasks_3_0= ruleTask ) )
            	    {
            	    // InternalMergerDsl.g:123:4: ( (lv_tasks_3_0= ruleTask ) )
            	    // InternalMergerDsl.g:124:5: (lv_tasks_3_0= ruleTask )
            	    {
            	    // InternalMergerDsl.g:124:5: (lv_tasks_3_0= ruleTask )
            	    // InternalMergerDsl.g:125:6: lv_tasks_3_0= ruleTask
            	    {

            	    						newCompositeNode(grammarAccess.getPlanningAccess().getTasksTaskParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_4);
            	    lv_tasks_3_0=ruleTask();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPlanningRule());
            	    						}
            	    						add(
            	    							current,
            	    							"tasks",
            	    							lv_tasks_3_0,
            	    							"persons.tasks3.merger.mdsl.MergerDsl.Task");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePlanning"


    // $ANTLR start "entryRulePerson"
    // InternalMergerDsl.g:147:1: entryRulePerson returns [EObject current=null] : iv_rulePerson= rulePerson EOF ;
    public final EObject entryRulePerson() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePerson = null;


        try {
            // InternalMergerDsl.g:147:47: (iv_rulePerson= rulePerson EOF )
            // InternalMergerDsl.g:148:2: iv_rulePerson= rulePerson EOF
            {
             newCompositeNode(grammarAccess.getPersonRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePerson=rulePerson();

            state._fsp--;

             current =iv_rulePerson; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePerson"


    // $ANTLR start "rulePerson"
    // InternalMergerDsl.g:154:1: rulePerson returns [EObject current=null] : (otherlv_0= 'Person:' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject rulePerson() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMergerDsl.g:160:2: ( (otherlv_0= 'Person:' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMergerDsl.g:161:2: (otherlv_0= 'Person:' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMergerDsl.g:161:2: (otherlv_0= 'Person:' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMergerDsl.g:162:3: otherlv_0= 'Person:' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPersonAccess().getPersonKeyword_0());
            		
            // InternalMergerDsl.g:166:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMergerDsl.g:167:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMergerDsl.g:167:4: (lv_name_1_0= RULE_ID )
            // InternalMergerDsl.g:168:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPersonAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPersonRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRuleTask"
    // InternalMergerDsl.g:188:1: entryRuleTask returns [EObject current=null] : iv_ruleTask= ruleTask EOF ;
    public final EObject entryRuleTask() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTask = null;


        try {
            // InternalMergerDsl.g:188:45: (iv_ruleTask= ruleTask EOF )
            // InternalMergerDsl.g:189:2: iv_ruleTask= ruleTask EOF
            {
             newCompositeNode(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTask=ruleTask();

            state._fsp--;

             current =iv_ruleTask; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalMergerDsl.g:195:1: ruleTask returns [EObject current=null] : (otherlv_0= 'Task:' ( (lv_action_1_0= ruleAction ) ) otherlv_2= 'persons:' ( (otherlv_3= RULE_ID ) )+ otherlv_4= 'priority:' ( (lv_prio_5_0= RULE_INT ) ) (otherlv_6= 'duration:' ( (lv_dl_7_0= RULE_INT ) ) ( (lv_unit_8_0= ruleTimeUnit ) ) )? ) ;
    public final EObject ruleTask() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_prio_5_0=null;
        Token otherlv_6=null;
        Token lv_dl_7_0=null;
        EObject lv_action_1_0 = null;

        Enumerator lv_unit_8_0 = null;



        	enterRule();

        try {
            // InternalMergerDsl.g:201:2: ( (otherlv_0= 'Task:' ( (lv_action_1_0= ruleAction ) ) otherlv_2= 'persons:' ( (otherlv_3= RULE_ID ) )+ otherlv_4= 'priority:' ( (lv_prio_5_0= RULE_INT ) ) (otherlv_6= 'duration:' ( (lv_dl_7_0= RULE_INT ) ) ( (lv_unit_8_0= ruleTimeUnit ) ) )? ) )
            // InternalMergerDsl.g:202:2: (otherlv_0= 'Task:' ( (lv_action_1_0= ruleAction ) ) otherlv_2= 'persons:' ( (otherlv_3= RULE_ID ) )+ otherlv_4= 'priority:' ( (lv_prio_5_0= RULE_INT ) ) (otherlv_6= 'duration:' ( (lv_dl_7_0= RULE_INT ) ) ( (lv_unit_8_0= ruleTimeUnit ) ) )? )
            {
            // InternalMergerDsl.g:202:2: (otherlv_0= 'Task:' ( (lv_action_1_0= ruleAction ) ) otherlv_2= 'persons:' ( (otherlv_3= RULE_ID ) )+ otherlv_4= 'priority:' ( (lv_prio_5_0= RULE_INT ) ) (otherlv_6= 'duration:' ( (lv_dl_7_0= RULE_INT ) ) ( (lv_unit_8_0= ruleTimeUnit ) ) )? )
            // InternalMergerDsl.g:203:3: otherlv_0= 'Task:' ( (lv_action_1_0= ruleAction ) ) otherlv_2= 'persons:' ( (otherlv_3= RULE_ID ) )+ otherlv_4= 'priority:' ( (lv_prio_5_0= RULE_INT ) ) (otherlv_6= 'duration:' ( (lv_dl_7_0= RULE_INT ) ) ( (lv_unit_8_0= ruleTimeUnit ) ) )?
            {
            otherlv_0=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getTaskAccess().getTaskKeyword_0());
            		
            // InternalMergerDsl.g:207:3: ( (lv_action_1_0= ruleAction ) )
            // InternalMergerDsl.g:208:4: (lv_action_1_0= ruleAction )
            {
            // InternalMergerDsl.g:208:4: (lv_action_1_0= ruleAction )
            // InternalMergerDsl.g:209:5: lv_action_1_0= ruleAction
            {

            					newCompositeNode(grammarAccess.getTaskAccess().getActionActionParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_6);
            lv_action_1_0=ruleAction();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getTaskRule());
            					}
            					set(
            						current,
            						"action",
            						lv_action_1_0,
            						"persons.tasks3.merger.mdsl.MergerDsl.Action");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getTaskAccess().getPersonsKeyword_2());
            		
            // InternalMergerDsl.g:230:3: ( (otherlv_3= RULE_ID ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_ID) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMergerDsl.g:231:4: (otherlv_3= RULE_ID )
            	    {
            	    // InternalMergerDsl.g:231:4: (otherlv_3= RULE_ID )
            	    // InternalMergerDsl.g:232:5: otherlv_3= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getTaskRule());
            	    					}
            	    				
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_7); 

            	    					newLeafNode(otherlv_3, grammarAccess.getTaskAccess().getPersonsPersonCrossReference_3_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getTaskAccess().getPriorityKeyword_4());
            		
            // InternalMergerDsl.g:247:3: ( (lv_prio_5_0= RULE_INT ) )
            // InternalMergerDsl.g:248:4: (lv_prio_5_0= RULE_INT )
            {
            // InternalMergerDsl.g:248:4: (lv_prio_5_0= RULE_INT )
            // InternalMergerDsl.g:249:5: lv_prio_5_0= RULE_INT
            {
            lv_prio_5_0=(Token)match(input,RULE_INT,FOLLOW_9); 

            					newLeafNode(lv_prio_5_0, grammarAccess.getTaskAccess().getPrioINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTaskRule());
            					}
            					setWithLastConsumed(
            						current,
            						"prio",
            						lv_prio_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalMergerDsl.g:265:3: (otherlv_6= 'duration:' ( (lv_dl_7_0= RULE_INT ) ) ( (lv_unit_8_0= ruleTimeUnit ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMergerDsl.g:266:4: otherlv_6= 'duration:' ( (lv_dl_7_0= RULE_INT ) ) ( (lv_unit_8_0= ruleTimeUnit ) )
                    {
                    otherlv_6=(Token)match(input,16,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getTaskAccess().getDurationKeyword_6_0());
                    			
                    // InternalMergerDsl.g:270:4: ( (lv_dl_7_0= RULE_INT ) )
                    // InternalMergerDsl.g:271:5: (lv_dl_7_0= RULE_INT )
                    {
                    // InternalMergerDsl.g:271:5: (lv_dl_7_0= RULE_INT )
                    // InternalMergerDsl.g:272:6: lv_dl_7_0= RULE_INT
                    {
                    lv_dl_7_0=(Token)match(input,RULE_INT,FOLLOW_10); 

                    						newLeafNode(lv_dl_7_0, grammarAccess.getTaskAccess().getDlINTTerminalRuleCall_6_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getTaskRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"dl",
                    							lv_dl_7_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }

                    // InternalMergerDsl.g:288:4: ( (lv_unit_8_0= ruleTimeUnit ) )
                    // InternalMergerDsl.g:289:5: (lv_unit_8_0= ruleTimeUnit )
                    {
                    // InternalMergerDsl.g:289:5: (lv_unit_8_0= ruleTimeUnit )
                    // InternalMergerDsl.g:290:6: lv_unit_8_0= ruleTimeUnit
                    {

                    						newCompositeNode(grammarAccess.getTaskAccess().getUnitTimeUnitEnumRuleCall_6_2_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_unit_8_0=ruleTimeUnit();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTaskRule());
                    						}
                    						set(
                    							current,
                    							"unit",
                    							lv_unit_8_0,
                    							"persons.tasks3.merger.mdsl.MergerDsl.TimeUnit");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleAction"
    // InternalMergerDsl.g:312:1: entryRuleAction returns [EObject current=null] : iv_ruleAction= ruleAction EOF ;
    public final EObject entryRuleAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAction = null;


        try {
            // InternalMergerDsl.g:312:47: (iv_ruleAction= ruleAction EOF )
            // InternalMergerDsl.g:313:2: iv_ruleAction= ruleAction EOF
            {
             newCompositeNode(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAction=ruleAction();

            state._fsp--;

             current =iv_ruleAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalMergerDsl.g:319:1: ruleAction returns [EObject current=null] : (this_LunchAction_0= ruleLunchAction | this_MeetingAction_1= ruleMeetingAction | this_PaperAction_2= rulePaperAction | this_PaymentAction_3= rulePaymentAction ) ;
    public final EObject ruleAction() throws RecognitionException {
        EObject current = null;

        EObject this_LunchAction_0 = null;

        EObject this_MeetingAction_1 = null;

        EObject this_PaperAction_2 = null;

        EObject this_PaymentAction_3 = null;



        	enterRule();

        try {
            // InternalMergerDsl.g:325:2: ( (this_LunchAction_0= ruleLunchAction | this_MeetingAction_1= ruleMeetingAction | this_PaperAction_2= rulePaperAction | this_PaymentAction_3= rulePaymentAction ) )
            // InternalMergerDsl.g:326:2: (this_LunchAction_0= ruleLunchAction | this_MeetingAction_1= ruleMeetingAction | this_PaperAction_2= rulePaperAction | this_PaymentAction_3= rulePaymentAction )
            {
            // InternalMergerDsl.g:326:2: (this_LunchAction_0= ruleLunchAction | this_MeetingAction_1= ruleMeetingAction | this_PaperAction_2= rulePaperAction | this_PaymentAction_3= rulePaymentAction )
            int alt4=4;
            switch ( input.LA(1) ) {
            case 17:
                {
                alt4=1;
                }
                break;
            case 18:
                {
                alt4=2;
                }
                break;
            case 19:
                {
                alt4=3;
                }
                break;
            case 20:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMergerDsl.g:327:3: this_LunchAction_0= ruleLunchAction
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getLunchActionParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_LunchAction_0=ruleLunchAction();

                    state._fsp--;


                    			current = this_LunchAction_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMergerDsl.g:336:3: this_MeetingAction_1= ruleMeetingAction
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getMeetingActionParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MeetingAction_1=ruleMeetingAction();

                    state._fsp--;


                    			current = this_MeetingAction_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMergerDsl.g:345:3: this_PaperAction_2= rulePaperAction
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getPaperActionParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_PaperAction_2=rulePaperAction();

                    state._fsp--;


                    			current = this_PaperAction_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMergerDsl.g:354:3: this_PaymentAction_3= rulePaymentAction
                    {

                    			newCompositeNode(grammarAccess.getActionAccess().getPaymentActionParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_PaymentAction_3=rulePaymentAction();

                    state._fsp--;


                    			current = this_PaymentAction_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleLunchAction"
    // InternalMergerDsl.g:366:1: entryRuleLunchAction returns [EObject current=null] : iv_ruleLunchAction= ruleLunchAction EOF ;
    public final EObject entryRuleLunchAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLunchAction = null;


        try {
            // InternalMergerDsl.g:366:52: (iv_ruleLunchAction= ruleLunchAction EOF )
            // InternalMergerDsl.g:367:2: iv_ruleLunchAction= ruleLunchAction EOF
            {
             newCompositeNode(grammarAccess.getLunchActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLunchAction=ruleLunchAction();

            state._fsp--;

             current =iv_ruleLunchAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLunchAction"


    // $ANTLR start "ruleLunchAction"
    // InternalMergerDsl.g:373:1: ruleLunchAction returns [EObject current=null] : (otherlv_0= 'Lunch' ( (lv_location_1_0= RULE_ID ) ) ) ;
    public final EObject ruleLunchAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_location_1_0=null;


        	enterRule();

        try {
            // InternalMergerDsl.g:379:2: ( (otherlv_0= 'Lunch' ( (lv_location_1_0= RULE_ID ) ) ) )
            // InternalMergerDsl.g:380:2: (otherlv_0= 'Lunch' ( (lv_location_1_0= RULE_ID ) ) )
            {
            // InternalMergerDsl.g:380:2: (otherlv_0= 'Lunch' ( (lv_location_1_0= RULE_ID ) ) )
            // InternalMergerDsl.g:381:3: otherlv_0= 'Lunch' ( (lv_location_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLunchActionAccess().getLunchKeyword_0());
            		
            // InternalMergerDsl.g:385:3: ( (lv_location_1_0= RULE_ID ) )
            // InternalMergerDsl.g:386:4: (lv_location_1_0= RULE_ID )
            {
            // InternalMergerDsl.g:386:4: (lv_location_1_0= RULE_ID )
            // InternalMergerDsl.g:387:5: lv_location_1_0= RULE_ID
            {
            lv_location_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_location_1_0, grammarAccess.getLunchActionAccess().getLocationIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLunchActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"location",
            						lv_location_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLunchAction"


    // $ANTLR start "entryRuleMeetingAction"
    // InternalMergerDsl.g:407:1: entryRuleMeetingAction returns [EObject current=null] : iv_ruleMeetingAction= ruleMeetingAction EOF ;
    public final EObject entryRuleMeetingAction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMeetingAction = null;


        try {
            // InternalMergerDsl.g:407:54: (iv_ruleMeetingAction= ruleMeetingAction EOF )
            // InternalMergerDsl.g:408:2: iv_ruleMeetingAction= ruleMeetingAction EOF
            {
             newCompositeNode(grammarAccess.getMeetingActionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMeetingAction=ruleMeetingAction();

            state._fsp--;

             current =iv_ruleMeetingAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMeetingAction"


    // $ANTLR start "ruleMeetingAction"
    // InternalMergerDsl.g:414:1: ruleMeetingAction returns [EObject current=null] : (otherlv_0= 'Meeting' ( (lv_topic_1_0= RULE_STRING ) ) ) ;
    public final EObject ruleMeetingAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_topic_1_0=null;


        	enterRule();

        try {
            // InternalMergerDsl.g:420:2: ( (otherlv_0= 'Meeting' ( (lv_topic_1_0= RULE_STRING ) ) ) )
            // InternalMergerDsl.g:421:2: (otherlv_0= 'Meeting' ( (lv_topic_1_0= RULE_STRING ) ) )
            {
            // InternalMergerDsl.g:421:2: (otherlv_0= 'Meeting' ( (lv_topic_1_0= RULE_STRING ) ) )
            // InternalMergerDsl.g:422:3: otherlv_0= 'Meeting' ( (lv_topic_1_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getMeetingActionAccess().getMeetingKeyword_0());
            		
            // InternalMergerDsl.g:426:3: ( (lv_topic_1_0= RULE_STRING ) )
            // InternalMergerDsl.g:427:4: (lv_topic_1_0= RULE_STRING )
            {
            // InternalMergerDsl.g:427:4: (lv_topic_1_0= RULE_STRING )
            // InternalMergerDsl.g:428:5: lv_topic_1_0= RULE_STRING
            {
            lv_topic_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_topic_1_0, grammarAccess.getMeetingActionAccess().getTopicSTRINGTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMeetingActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"topic",
            						lv_topic_1_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMeetingAction"


    // $ANTLR start "entryRulePaperAction"
    // InternalMergerDsl.g:448:1: entryRulePaperAction returns [EObject current=null] : iv_rulePaperAction= rulePaperAction EOF ;
    public final EObject entryRulePaperAction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePaperAction = null;


        try {
            // InternalMergerDsl.g:448:52: (iv_rulePaperAction= rulePaperAction EOF )
            // InternalMergerDsl.g:449:2: iv_rulePaperAction= rulePaperAction EOF
            {
             newCompositeNode(grammarAccess.getPaperActionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePaperAction=rulePaperAction();

            state._fsp--;

             current =iv_rulePaperAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePaperAction"


    // $ANTLR start "rulePaperAction"
    // InternalMergerDsl.g:455:1: rulePaperAction returns [EObject current=null] : (otherlv_0= 'Report' ( (lv_report_1_0= RULE_ID ) ) ) ;
    public final EObject rulePaperAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_report_1_0=null;


        	enterRule();

        try {
            // InternalMergerDsl.g:461:2: ( (otherlv_0= 'Report' ( (lv_report_1_0= RULE_ID ) ) ) )
            // InternalMergerDsl.g:462:2: (otherlv_0= 'Report' ( (lv_report_1_0= RULE_ID ) ) )
            {
            // InternalMergerDsl.g:462:2: (otherlv_0= 'Report' ( (lv_report_1_0= RULE_ID ) ) )
            // InternalMergerDsl.g:463:3: otherlv_0= 'Report' ( (lv_report_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPaperActionAccess().getReportKeyword_0());
            		
            // InternalMergerDsl.g:467:3: ( (lv_report_1_0= RULE_ID ) )
            // InternalMergerDsl.g:468:4: (lv_report_1_0= RULE_ID )
            {
            // InternalMergerDsl.g:468:4: (lv_report_1_0= RULE_ID )
            // InternalMergerDsl.g:469:5: lv_report_1_0= RULE_ID
            {
            lv_report_1_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_report_1_0, grammarAccess.getPaperActionAccess().getReportIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPaperActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"report",
            						lv_report_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePaperAction"


    // $ANTLR start "entryRulePaymentAction"
    // InternalMergerDsl.g:489:1: entryRulePaymentAction returns [EObject current=null] : iv_rulePaymentAction= rulePaymentAction EOF ;
    public final EObject entryRulePaymentAction() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePaymentAction = null;


        try {
            // InternalMergerDsl.g:489:54: (iv_rulePaymentAction= rulePaymentAction EOF )
            // InternalMergerDsl.g:490:2: iv_rulePaymentAction= rulePaymentAction EOF
            {
             newCompositeNode(grammarAccess.getPaymentActionRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePaymentAction=rulePaymentAction();

            state._fsp--;

             current =iv_rulePaymentAction; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePaymentAction"


    // $ANTLR start "rulePaymentAction"
    // InternalMergerDsl.g:496:1: rulePaymentAction returns [EObject current=null] : (otherlv_0= 'Pay' ( (lv_amount_1_0= RULE_INT ) ) otherlv_2= 'euro' ) ;
    public final EObject rulePaymentAction() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_amount_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMergerDsl.g:502:2: ( (otherlv_0= 'Pay' ( (lv_amount_1_0= RULE_INT ) ) otherlv_2= 'euro' ) )
            // InternalMergerDsl.g:503:2: (otherlv_0= 'Pay' ( (lv_amount_1_0= RULE_INT ) ) otherlv_2= 'euro' )
            {
            // InternalMergerDsl.g:503:2: (otherlv_0= 'Pay' ( (lv_amount_1_0= RULE_INT ) ) otherlv_2= 'euro' )
            // InternalMergerDsl.g:504:3: otherlv_0= 'Pay' ( (lv_amount_1_0= RULE_INT ) ) otherlv_2= 'euro'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getPaymentActionAccess().getPayKeyword_0());
            		
            // InternalMergerDsl.g:508:3: ( (lv_amount_1_0= RULE_INT ) )
            // InternalMergerDsl.g:509:4: (lv_amount_1_0= RULE_INT )
            {
            // InternalMergerDsl.g:509:4: (lv_amount_1_0= RULE_INT )
            // InternalMergerDsl.g:510:5: lv_amount_1_0= RULE_INT
            {
            lv_amount_1_0=(Token)match(input,RULE_INT,FOLLOW_12); 

            					newLeafNode(lv_amount_1_0, grammarAccess.getPaymentActionAccess().getAmountINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPaymentActionRule());
            					}
            					setWithLastConsumed(
            						current,
            						"amount",
            						lv_amount_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getPaymentActionAccess().getEuroKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePaymentAction"


    // $ANTLR start "ruleTimeUnit"
    // InternalMergerDsl.g:534:1: ruleTimeUnit returns [Enumerator current=null] : ( (enumLiteral_0= 'min' ) | (enumLiteral_1= 'hour' ) | (enumLiteral_2= 'day' ) | (enumLiteral_3= 'week' ) ) ;
    public final Enumerator ruleTimeUnit() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMergerDsl.g:540:2: ( ( (enumLiteral_0= 'min' ) | (enumLiteral_1= 'hour' ) | (enumLiteral_2= 'day' ) | (enumLiteral_3= 'week' ) ) )
            // InternalMergerDsl.g:541:2: ( (enumLiteral_0= 'min' ) | (enumLiteral_1= 'hour' ) | (enumLiteral_2= 'day' ) | (enumLiteral_3= 'week' ) )
            {
            // InternalMergerDsl.g:541:2: ( (enumLiteral_0= 'min' ) | (enumLiteral_1= 'hour' ) | (enumLiteral_2= 'day' ) | (enumLiteral_3= 'week' ) )
            int alt5=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt5=1;
                }
                break;
            case 23:
                {
                alt5=2;
                }
                break;
            case 24:
                {
                alt5=3;
                }
                break;
            case 25:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMergerDsl.g:542:3: (enumLiteral_0= 'min' )
                    {
                    // InternalMergerDsl.g:542:3: (enumLiteral_0= 'min' )
                    // InternalMergerDsl.g:543:4: enumLiteral_0= 'min'
                    {
                    enumLiteral_0=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getMINUTEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTimeUnitAccess().getMINUTEEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMergerDsl.g:550:3: (enumLiteral_1= 'hour' )
                    {
                    // InternalMergerDsl.g:550:3: (enumLiteral_1= 'hour' )
                    // InternalMergerDsl.g:551:4: enumLiteral_1= 'hour'
                    {
                    enumLiteral_1=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getHOUREnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTimeUnitAccess().getHOUREnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMergerDsl.g:558:3: (enumLiteral_2= 'day' )
                    {
                    // InternalMergerDsl.g:558:3: (enumLiteral_2= 'day' )
                    // InternalMergerDsl.g:559:4: enumLiteral_2= 'day'
                    {
                    enumLiteral_2=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getDAYEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTimeUnitAccess().getDAYEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMergerDsl.g:566:3: (enumLiteral_3= 'week' )
                    {
                    // InternalMergerDsl.g:566:3: (enumLiteral_3= 'week' )
                    // InternalMergerDsl.g:567:4: enumLiteral_3= 'week'
                    {
                    enumLiteral_3=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getTimeUnitAccess().getWEEKEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTimeUnitAccess().getWEEKEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTimeUnit"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000003002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00000000001E0000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008010L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000003C00000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});

}