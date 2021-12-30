package persons.tasks3.merger.mdsl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import persons.tasks3.merger.mdsl.services.MergerDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMergerDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'min'", "'hour'", "'day'", "'week'", "'Planning'", "'Person:'", "'Task:'", "'persons:'", "'priority:'", "'duration:'", "'Lunch'", "'Meeting'", "'Report'", "'Pay'", "'euro'"
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

    	public void setGrammarAccess(MergerDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRulePlanning"
    // InternalMergerDsl.g:53:1: entryRulePlanning : rulePlanning EOF ;
    public final void entryRulePlanning() throws RecognitionException {
        try {
            // InternalMergerDsl.g:54:1: ( rulePlanning EOF )
            // InternalMergerDsl.g:55:1: rulePlanning EOF
            {
             before(grammarAccess.getPlanningRule()); 
            pushFollow(FOLLOW_1);
            rulePlanning();

            state._fsp--;

             after(grammarAccess.getPlanningRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePlanning"


    // $ANTLR start "rulePlanning"
    // InternalMergerDsl.g:62:1: rulePlanning : ( ( rule__Planning__Group__0 ) ) ;
    public final void rulePlanning() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:66:2: ( ( ( rule__Planning__Group__0 ) ) )
            // InternalMergerDsl.g:67:2: ( ( rule__Planning__Group__0 ) )
            {
            // InternalMergerDsl.g:67:2: ( ( rule__Planning__Group__0 ) )
            // InternalMergerDsl.g:68:3: ( rule__Planning__Group__0 )
            {
             before(grammarAccess.getPlanningAccess().getGroup()); 
            // InternalMergerDsl.g:69:3: ( rule__Planning__Group__0 )
            // InternalMergerDsl.g:69:4: rule__Planning__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Planning__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlanningAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePlanning"


    // $ANTLR start "entryRulePerson"
    // InternalMergerDsl.g:78:1: entryRulePerson : rulePerson EOF ;
    public final void entryRulePerson() throws RecognitionException {
        try {
            // InternalMergerDsl.g:79:1: ( rulePerson EOF )
            // InternalMergerDsl.g:80:1: rulePerson EOF
            {
             before(grammarAccess.getPersonRule()); 
            pushFollow(FOLLOW_1);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getPersonRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePerson"


    // $ANTLR start "rulePerson"
    // InternalMergerDsl.g:87:1: rulePerson : ( ( rule__Person__Group__0 ) ) ;
    public final void rulePerson() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:91:2: ( ( ( rule__Person__Group__0 ) ) )
            // InternalMergerDsl.g:92:2: ( ( rule__Person__Group__0 ) )
            {
            // InternalMergerDsl.g:92:2: ( ( rule__Person__Group__0 ) )
            // InternalMergerDsl.g:93:3: ( rule__Person__Group__0 )
            {
             before(grammarAccess.getPersonAccess().getGroup()); 
            // InternalMergerDsl.g:94:3: ( rule__Person__Group__0 )
            // InternalMergerDsl.g:94:4: rule__Person__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePerson"


    // $ANTLR start "entryRuleTask"
    // InternalMergerDsl.g:103:1: entryRuleTask : ruleTask EOF ;
    public final void entryRuleTask() throws RecognitionException {
        try {
            // InternalMergerDsl.g:104:1: ( ruleTask EOF )
            // InternalMergerDsl.g:105:1: ruleTask EOF
            {
             before(grammarAccess.getTaskRule()); 
            pushFollow(FOLLOW_1);
            ruleTask();

            state._fsp--;

             after(grammarAccess.getTaskRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleTask"


    // $ANTLR start "ruleTask"
    // InternalMergerDsl.g:112:1: ruleTask : ( ( rule__Task__Group__0 ) ) ;
    public final void ruleTask() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:116:2: ( ( ( rule__Task__Group__0 ) ) )
            // InternalMergerDsl.g:117:2: ( ( rule__Task__Group__0 ) )
            {
            // InternalMergerDsl.g:117:2: ( ( rule__Task__Group__0 ) )
            // InternalMergerDsl.g:118:3: ( rule__Task__Group__0 )
            {
             before(grammarAccess.getTaskAccess().getGroup()); 
            // InternalMergerDsl.g:119:3: ( rule__Task__Group__0 )
            // InternalMergerDsl.g:119:4: rule__Task__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTask"


    // $ANTLR start "entryRuleAction"
    // InternalMergerDsl.g:128:1: entryRuleAction : ruleAction EOF ;
    public final void entryRuleAction() throws RecognitionException {
        try {
            // InternalMergerDsl.g:129:1: ( ruleAction EOF )
            // InternalMergerDsl.g:130:1: ruleAction EOF
            {
             before(grammarAccess.getActionRule()); 
            pushFollow(FOLLOW_1);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getActionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAction"


    // $ANTLR start "ruleAction"
    // InternalMergerDsl.g:137:1: ruleAction : ( ( rule__Action__Alternatives ) ) ;
    public final void ruleAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:141:2: ( ( ( rule__Action__Alternatives ) ) )
            // InternalMergerDsl.g:142:2: ( ( rule__Action__Alternatives ) )
            {
            // InternalMergerDsl.g:142:2: ( ( rule__Action__Alternatives ) )
            // InternalMergerDsl.g:143:3: ( rule__Action__Alternatives )
            {
             before(grammarAccess.getActionAccess().getAlternatives()); 
            // InternalMergerDsl.g:144:3: ( rule__Action__Alternatives )
            // InternalMergerDsl.g:144:4: rule__Action__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Action__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getActionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAction"


    // $ANTLR start "entryRuleLunchAction"
    // InternalMergerDsl.g:153:1: entryRuleLunchAction : ruleLunchAction EOF ;
    public final void entryRuleLunchAction() throws RecognitionException {
        try {
            // InternalMergerDsl.g:154:1: ( ruleLunchAction EOF )
            // InternalMergerDsl.g:155:1: ruleLunchAction EOF
            {
             before(grammarAccess.getLunchActionRule()); 
            pushFollow(FOLLOW_1);
            ruleLunchAction();

            state._fsp--;

             after(grammarAccess.getLunchActionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLunchAction"


    // $ANTLR start "ruleLunchAction"
    // InternalMergerDsl.g:162:1: ruleLunchAction : ( ( rule__LunchAction__Group__0 ) ) ;
    public final void ruleLunchAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:166:2: ( ( ( rule__LunchAction__Group__0 ) ) )
            // InternalMergerDsl.g:167:2: ( ( rule__LunchAction__Group__0 ) )
            {
            // InternalMergerDsl.g:167:2: ( ( rule__LunchAction__Group__0 ) )
            // InternalMergerDsl.g:168:3: ( rule__LunchAction__Group__0 )
            {
             before(grammarAccess.getLunchActionAccess().getGroup()); 
            // InternalMergerDsl.g:169:3: ( rule__LunchAction__Group__0 )
            // InternalMergerDsl.g:169:4: rule__LunchAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LunchAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLunchActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLunchAction"


    // $ANTLR start "entryRuleMeetingAction"
    // InternalMergerDsl.g:178:1: entryRuleMeetingAction : ruleMeetingAction EOF ;
    public final void entryRuleMeetingAction() throws RecognitionException {
        try {
            // InternalMergerDsl.g:179:1: ( ruleMeetingAction EOF )
            // InternalMergerDsl.g:180:1: ruleMeetingAction EOF
            {
             before(grammarAccess.getMeetingActionRule()); 
            pushFollow(FOLLOW_1);
            ruleMeetingAction();

            state._fsp--;

             after(grammarAccess.getMeetingActionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMeetingAction"


    // $ANTLR start "ruleMeetingAction"
    // InternalMergerDsl.g:187:1: ruleMeetingAction : ( ( rule__MeetingAction__Group__0 ) ) ;
    public final void ruleMeetingAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:191:2: ( ( ( rule__MeetingAction__Group__0 ) ) )
            // InternalMergerDsl.g:192:2: ( ( rule__MeetingAction__Group__0 ) )
            {
            // InternalMergerDsl.g:192:2: ( ( rule__MeetingAction__Group__0 ) )
            // InternalMergerDsl.g:193:3: ( rule__MeetingAction__Group__0 )
            {
             before(grammarAccess.getMeetingActionAccess().getGroup()); 
            // InternalMergerDsl.g:194:3: ( rule__MeetingAction__Group__0 )
            // InternalMergerDsl.g:194:4: rule__MeetingAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MeetingAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMeetingActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMeetingAction"


    // $ANTLR start "entryRulePaperAction"
    // InternalMergerDsl.g:203:1: entryRulePaperAction : rulePaperAction EOF ;
    public final void entryRulePaperAction() throws RecognitionException {
        try {
            // InternalMergerDsl.g:204:1: ( rulePaperAction EOF )
            // InternalMergerDsl.g:205:1: rulePaperAction EOF
            {
             before(grammarAccess.getPaperActionRule()); 
            pushFollow(FOLLOW_1);
            rulePaperAction();

            state._fsp--;

             after(grammarAccess.getPaperActionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePaperAction"


    // $ANTLR start "rulePaperAction"
    // InternalMergerDsl.g:212:1: rulePaperAction : ( ( rule__PaperAction__Group__0 ) ) ;
    public final void rulePaperAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:216:2: ( ( ( rule__PaperAction__Group__0 ) ) )
            // InternalMergerDsl.g:217:2: ( ( rule__PaperAction__Group__0 ) )
            {
            // InternalMergerDsl.g:217:2: ( ( rule__PaperAction__Group__0 ) )
            // InternalMergerDsl.g:218:3: ( rule__PaperAction__Group__0 )
            {
             before(grammarAccess.getPaperActionAccess().getGroup()); 
            // InternalMergerDsl.g:219:3: ( rule__PaperAction__Group__0 )
            // InternalMergerDsl.g:219:4: rule__PaperAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PaperAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPaperActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePaperAction"


    // $ANTLR start "entryRulePaymentAction"
    // InternalMergerDsl.g:228:1: entryRulePaymentAction : rulePaymentAction EOF ;
    public final void entryRulePaymentAction() throws RecognitionException {
        try {
            // InternalMergerDsl.g:229:1: ( rulePaymentAction EOF )
            // InternalMergerDsl.g:230:1: rulePaymentAction EOF
            {
             before(grammarAccess.getPaymentActionRule()); 
            pushFollow(FOLLOW_1);
            rulePaymentAction();

            state._fsp--;

             after(grammarAccess.getPaymentActionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePaymentAction"


    // $ANTLR start "rulePaymentAction"
    // InternalMergerDsl.g:237:1: rulePaymentAction : ( ( rule__PaymentAction__Group__0 ) ) ;
    public final void rulePaymentAction() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:241:2: ( ( ( rule__PaymentAction__Group__0 ) ) )
            // InternalMergerDsl.g:242:2: ( ( rule__PaymentAction__Group__0 ) )
            {
            // InternalMergerDsl.g:242:2: ( ( rule__PaymentAction__Group__0 ) )
            // InternalMergerDsl.g:243:3: ( rule__PaymentAction__Group__0 )
            {
             before(grammarAccess.getPaymentActionAccess().getGroup()); 
            // InternalMergerDsl.g:244:3: ( rule__PaymentAction__Group__0 )
            // InternalMergerDsl.g:244:4: rule__PaymentAction__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PaymentAction__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPaymentActionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePaymentAction"


    // $ANTLR start "ruleTimeUnit"
    // InternalMergerDsl.g:253:1: ruleTimeUnit : ( ( rule__TimeUnit__Alternatives ) ) ;
    public final void ruleTimeUnit() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:257:1: ( ( ( rule__TimeUnit__Alternatives ) ) )
            // InternalMergerDsl.g:258:2: ( ( rule__TimeUnit__Alternatives ) )
            {
            // InternalMergerDsl.g:258:2: ( ( rule__TimeUnit__Alternatives ) )
            // InternalMergerDsl.g:259:3: ( rule__TimeUnit__Alternatives )
            {
             before(grammarAccess.getTimeUnitAccess().getAlternatives()); 
            // InternalMergerDsl.g:260:3: ( rule__TimeUnit__Alternatives )
            // InternalMergerDsl.g:260:4: rule__TimeUnit__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TimeUnit__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTimeUnitAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTimeUnit"


    // $ANTLR start "rule__Planning__Alternatives_2"
    // InternalMergerDsl.g:268:1: rule__Planning__Alternatives_2 : ( ( ( rule__Planning__PersonsAssignment_2_0 ) ) | ( ( rule__Planning__TasksAssignment_2_1 ) ) );
    public final void rule__Planning__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:272:1: ( ( ( rule__Planning__PersonsAssignment_2_0 ) ) | ( ( rule__Planning__TasksAssignment_2_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==16) ) {
                alt1=1;
            }
            else if ( (LA1_0==17) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMergerDsl.g:273:2: ( ( rule__Planning__PersonsAssignment_2_0 ) )
                    {
                    // InternalMergerDsl.g:273:2: ( ( rule__Planning__PersonsAssignment_2_0 ) )
                    // InternalMergerDsl.g:274:3: ( rule__Planning__PersonsAssignment_2_0 )
                    {
                     before(grammarAccess.getPlanningAccess().getPersonsAssignment_2_0()); 
                    // InternalMergerDsl.g:275:3: ( rule__Planning__PersonsAssignment_2_0 )
                    // InternalMergerDsl.g:275:4: rule__Planning__PersonsAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Planning__PersonsAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlanningAccess().getPersonsAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMergerDsl.g:279:2: ( ( rule__Planning__TasksAssignment_2_1 ) )
                    {
                    // InternalMergerDsl.g:279:2: ( ( rule__Planning__TasksAssignment_2_1 ) )
                    // InternalMergerDsl.g:280:3: ( rule__Planning__TasksAssignment_2_1 )
                    {
                     before(grammarAccess.getPlanningAccess().getTasksAssignment_2_1()); 
                    // InternalMergerDsl.g:281:3: ( rule__Planning__TasksAssignment_2_1 )
                    // InternalMergerDsl.g:281:4: rule__Planning__TasksAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Planning__TasksAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlanningAccess().getTasksAssignment_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Planning__Alternatives_2"


    // $ANTLR start "rule__Action__Alternatives"
    // InternalMergerDsl.g:289:1: rule__Action__Alternatives : ( ( ruleLunchAction ) | ( ruleMeetingAction ) | ( rulePaperAction ) | ( rulePaymentAction ) );
    public final void rule__Action__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:293:1: ( ( ruleLunchAction ) | ( ruleMeetingAction ) | ( rulePaperAction ) | ( rulePaymentAction ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt2=1;
                }
                break;
            case 22:
                {
                alt2=2;
                }
                break;
            case 23:
                {
                alt2=3;
                }
                break;
            case 24:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMergerDsl.g:294:2: ( ruleLunchAction )
                    {
                    // InternalMergerDsl.g:294:2: ( ruleLunchAction )
                    // InternalMergerDsl.g:295:3: ruleLunchAction
                    {
                     before(grammarAccess.getActionAccess().getLunchActionParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLunchAction();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getLunchActionParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMergerDsl.g:300:2: ( ruleMeetingAction )
                    {
                    // InternalMergerDsl.g:300:2: ( ruleMeetingAction )
                    // InternalMergerDsl.g:301:3: ruleMeetingAction
                    {
                     before(grammarAccess.getActionAccess().getMeetingActionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMeetingAction();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getMeetingActionParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMergerDsl.g:306:2: ( rulePaperAction )
                    {
                    // InternalMergerDsl.g:306:2: ( rulePaperAction )
                    // InternalMergerDsl.g:307:3: rulePaperAction
                    {
                     before(grammarAccess.getActionAccess().getPaperActionParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    rulePaperAction();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getPaperActionParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMergerDsl.g:312:2: ( rulePaymentAction )
                    {
                    // InternalMergerDsl.g:312:2: ( rulePaymentAction )
                    // InternalMergerDsl.g:313:3: rulePaymentAction
                    {
                     before(grammarAccess.getActionAccess().getPaymentActionParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    rulePaymentAction();

                    state._fsp--;

                     after(grammarAccess.getActionAccess().getPaymentActionParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Action__Alternatives"


    // $ANTLR start "rule__TimeUnit__Alternatives"
    // InternalMergerDsl.g:322:1: rule__TimeUnit__Alternatives : ( ( ( 'min' ) ) | ( ( 'hour' ) ) | ( ( 'day' ) ) | ( ( 'week' ) ) );
    public final void rule__TimeUnit__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:326:1: ( ( ( 'min' ) ) | ( ( 'hour' ) ) | ( ( 'day' ) ) | ( ( 'week' ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt3=1;
                }
                break;
            case 12:
                {
                alt3=2;
                }
                break;
            case 13:
                {
                alt3=3;
                }
                break;
            case 14:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMergerDsl.g:327:2: ( ( 'min' ) )
                    {
                    // InternalMergerDsl.g:327:2: ( ( 'min' ) )
                    // InternalMergerDsl.g:328:3: ( 'min' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getMINUTEEnumLiteralDeclaration_0()); 
                    // InternalMergerDsl.g:329:3: ( 'min' )
                    // InternalMergerDsl.g:329:4: 'min'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getMINUTEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMergerDsl.g:333:2: ( ( 'hour' ) )
                    {
                    // InternalMergerDsl.g:333:2: ( ( 'hour' ) )
                    // InternalMergerDsl.g:334:3: ( 'hour' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getHOUREnumLiteralDeclaration_1()); 
                    // InternalMergerDsl.g:335:3: ( 'hour' )
                    // InternalMergerDsl.g:335:4: 'hour'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getHOUREnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMergerDsl.g:339:2: ( ( 'day' ) )
                    {
                    // InternalMergerDsl.g:339:2: ( ( 'day' ) )
                    // InternalMergerDsl.g:340:3: ( 'day' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getDAYEnumLiteralDeclaration_2()); 
                    // InternalMergerDsl.g:341:3: ( 'day' )
                    // InternalMergerDsl.g:341:4: 'day'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getDAYEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMergerDsl.g:345:2: ( ( 'week' ) )
                    {
                    // InternalMergerDsl.g:345:2: ( ( 'week' ) )
                    // InternalMergerDsl.g:346:3: ( 'week' )
                    {
                     before(grammarAccess.getTimeUnitAccess().getWEEKEnumLiteralDeclaration_3()); 
                    // InternalMergerDsl.g:347:3: ( 'week' )
                    // InternalMergerDsl.g:347:4: 'week'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getTimeUnitAccess().getWEEKEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TimeUnit__Alternatives"


    // $ANTLR start "rule__Planning__Group__0"
    // InternalMergerDsl.g:355:1: rule__Planning__Group__0 : rule__Planning__Group__0__Impl rule__Planning__Group__1 ;
    public final void rule__Planning__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:359:1: ( rule__Planning__Group__0__Impl rule__Planning__Group__1 )
            // InternalMergerDsl.g:360:2: rule__Planning__Group__0__Impl rule__Planning__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Planning__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Planning__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Planning__Group__0"


    // $ANTLR start "rule__Planning__Group__0__Impl"
    // InternalMergerDsl.g:367:1: rule__Planning__Group__0__Impl : ( 'Planning' ) ;
    public final void rule__Planning__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:371:1: ( ( 'Planning' ) )
            // InternalMergerDsl.g:372:1: ( 'Planning' )
            {
            // InternalMergerDsl.g:372:1: ( 'Planning' )
            // InternalMergerDsl.g:373:2: 'Planning'
            {
             before(grammarAccess.getPlanningAccess().getPlanningKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPlanningAccess().getPlanningKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Planning__Group__0__Impl"


    // $ANTLR start "rule__Planning__Group__1"
    // InternalMergerDsl.g:382:1: rule__Planning__Group__1 : rule__Planning__Group__1__Impl rule__Planning__Group__2 ;
    public final void rule__Planning__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:386:1: ( rule__Planning__Group__1__Impl rule__Planning__Group__2 )
            // InternalMergerDsl.g:387:2: rule__Planning__Group__1__Impl rule__Planning__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Planning__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Planning__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Planning__Group__1"


    // $ANTLR start "rule__Planning__Group__1__Impl"
    // InternalMergerDsl.g:394:1: rule__Planning__Group__1__Impl : ( ( rule__Planning__NameAssignment_1 ) ) ;
    public final void rule__Planning__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:398:1: ( ( ( rule__Planning__NameAssignment_1 ) ) )
            // InternalMergerDsl.g:399:1: ( ( rule__Planning__NameAssignment_1 ) )
            {
            // InternalMergerDsl.g:399:1: ( ( rule__Planning__NameAssignment_1 ) )
            // InternalMergerDsl.g:400:2: ( rule__Planning__NameAssignment_1 )
            {
             before(grammarAccess.getPlanningAccess().getNameAssignment_1()); 
            // InternalMergerDsl.g:401:2: ( rule__Planning__NameAssignment_1 )
            // InternalMergerDsl.g:401:3: rule__Planning__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Planning__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPlanningAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Planning__Group__1__Impl"


    // $ANTLR start "rule__Planning__Group__2"
    // InternalMergerDsl.g:409:1: rule__Planning__Group__2 : rule__Planning__Group__2__Impl ;
    public final void rule__Planning__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:413:1: ( rule__Planning__Group__2__Impl )
            // InternalMergerDsl.g:414:2: rule__Planning__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Planning__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Planning__Group__2"


    // $ANTLR start "rule__Planning__Group__2__Impl"
    // InternalMergerDsl.g:420:1: rule__Planning__Group__2__Impl : ( ( rule__Planning__Alternatives_2 )* ) ;
    public final void rule__Planning__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:424:1: ( ( ( rule__Planning__Alternatives_2 )* ) )
            // InternalMergerDsl.g:425:1: ( ( rule__Planning__Alternatives_2 )* )
            {
            // InternalMergerDsl.g:425:1: ( ( rule__Planning__Alternatives_2 )* )
            // InternalMergerDsl.g:426:2: ( rule__Planning__Alternatives_2 )*
            {
             before(grammarAccess.getPlanningAccess().getAlternatives_2()); 
            // InternalMergerDsl.g:427:2: ( rule__Planning__Alternatives_2 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=16 && LA4_0<=17)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMergerDsl.g:427:3: rule__Planning__Alternatives_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Planning__Alternatives_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getPlanningAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Planning__Group__2__Impl"


    // $ANTLR start "rule__Person__Group__0"
    // InternalMergerDsl.g:436:1: rule__Person__Group__0 : rule__Person__Group__0__Impl rule__Person__Group__1 ;
    public final void rule__Person__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:440:1: ( rule__Person__Group__0__Impl rule__Person__Group__1 )
            // InternalMergerDsl.g:441:2: rule__Person__Group__0__Impl rule__Person__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Person__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Person__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__0"


    // $ANTLR start "rule__Person__Group__0__Impl"
    // InternalMergerDsl.g:448:1: rule__Person__Group__0__Impl : ( 'Person:' ) ;
    public final void rule__Person__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:452:1: ( ( 'Person:' ) )
            // InternalMergerDsl.g:453:1: ( 'Person:' )
            {
            // InternalMergerDsl.g:453:1: ( 'Person:' )
            // InternalMergerDsl.g:454:2: 'Person:'
            {
             before(grammarAccess.getPersonAccess().getPersonKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getPersonKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__0__Impl"


    // $ANTLR start "rule__Person__Group__1"
    // InternalMergerDsl.g:463:1: rule__Person__Group__1 : rule__Person__Group__1__Impl ;
    public final void rule__Person__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:467:1: ( rule__Person__Group__1__Impl )
            // InternalMergerDsl.g:468:2: rule__Person__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Person__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__1"


    // $ANTLR start "rule__Person__Group__1__Impl"
    // InternalMergerDsl.g:474:1: rule__Person__Group__1__Impl : ( ( rule__Person__NameAssignment_1 ) ) ;
    public final void rule__Person__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:478:1: ( ( ( rule__Person__NameAssignment_1 ) ) )
            // InternalMergerDsl.g:479:1: ( ( rule__Person__NameAssignment_1 ) )
            {
            // InternalMergerDsl.g:479:1: ( ( rule__Person__NameAssignment_1 ) )
            // InternalMergerDsl.g:480:2: ( rule__Person__NameAssignment_1 )
            {
             before(grammarAccess.getPersonAccess().getNameAssignment_1()); 
            // InternalMergerDsl.g:481:2: ( rule__Person__NameAssignment_1 )
            // InternalMergerDsl.g:481:3: rule__Person__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Person__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPersonAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__Group__1__Impl"


    // $ANTLR start "rule__Task__Group__0"
    // InternalMergerDsl.g:490:1: rule__Task__Group__0 : rule__Task__Group__0__Impl rule__Task__Group__1 ;
    public final void rule__Task__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:494:1: ( rule__Task__Group__0__Impl rule__Task__Group__1 )
            // InternalMergerDsl.g:495:2: rule__Task__Group__0__Impl rule__Task__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Task__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__0"


    // $ANTLR start "rule__Task__Group__0__Impl"
    // InternalMergerDsl.g:502:1: rule__Task__Group__0__Impl : ( 'Task:' ) ;
    public final void rule__Task__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:506:1: ( ( 'Task:' ) )
            // InternalMergerDsl.g:507:1: ( 'Task:' )
            {
            // InternalMergerDsl.g:507:1: ( 'Task:' )
            // InternalMergerDsl.g:508:2: 'Task:'
            {
             before(grammarAccess.getTaskAccess().getTaskKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getTaskKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__0__Impl"


    // $ANTLR start "rule__Task__Group__1"
    // InternalMergerDsl.g:517:1: rule__Task__Group__1 : rule__Task__Group__1__Impl rule__Task__Group__2 ;
    public final void rule__Task__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:521:1: ( rule__Task__Group__1__Impl rule__Task__Group__2 )
            // InternalMergerDsl.g:522:2: rule__Task__Group__1__Impl rule__Task__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Task__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__1"


    // $ANTLR start "rule__Task__Group__1__Impl"
    // InternalMergerDsl.g:529:1: rule__Task__Group__1__Impl : ( ( rule__Task__ActionAssignment_1 ) ) ;
    public final void rule__Task__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:533:1: ( ( ( rule__Task__ActionAssignment_1 ) ) )
            // InternalMergerDsl.g:534:1: ( ( rule__Task__ActionAssignment_1 ) )
            {
            // InternalMergerDsl.g:534:1: ( ( rule__Task__ActionAssignment_1 ) )
            // InternalMergerDsl.g:535:2: ( rule__Task__ActionAssignment_1 )
            {
             before(grammarAccess.getTaskAccess().getActionAssignment_1()); 
            // InternalMergerDsl.g:536:2: ( rule__Task__ActionAssignment_1 )
            // InternalMergerDsl.g:536:3: rule__Task__ActionAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Task__ActionAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getActionAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__1__Impl"


    // $ANTLR start "rule__Task__Group__2"
    // InternalMergerDsl.g:544:1: rule__Task__Group__2 : rule__Task__Group__2__Impl rule__Task__Group__3 ;
    public final void rule__Task__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:548:1: ( rule__Task__Group__2__Impl rule__Task__Group__3 )
            // InternalMergerDsl.g:549:2: rule__Task__Group__2__Impl rule__Task__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Task__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__2"


    // $ANTLR start "rule__Task__Group__2__Impl"
    // InternalMergerDsl.g:556:1: rule__Task__Group__2__Impl : ( 'persons:' ) ;
    public final void rule__Task__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:560:1: ( ( 'persons:' ) )
            // InternalMergerDsl.g:561:1: ( 'persons:' )
            {
            // InternalMergerDsl.g:561:1: ( 'persons:' )
            // InternalMergerDsl.g:562:2: 'persons:'
            {
             before(grammarAccess.getTaskAccess().getPersonsKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getPersonsKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__2__Impl"


    // $ANTLR start "rule__Task__Group__3"
    // InternalMergerDsl.g:571:1: rule__Task__Group__3 : rule__Task__Group__3__Impl rule__Task__Group__4 ;
    public final void rule__Task__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:575:1: ( rule__Task__Group__3__Impl rule__Task__Group__4 )
            // InternalMergerDsl.g:576:2: rule__Task__Group__3__Impl rule__Task__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Task__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__3"


    // $ANTLR start "rule__Task__Group__3__Impl"
    // InternalMergerDsl.g:583:1: rule__Task__Group__3__Impl : ( ( ( rule__Task__PersonsAssignment_3 ) ) ( ( rule__Task__PersonsAssignment_3 )* ) ) ;
    public final void rule__Task__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:587:1: ( ( ( ( rule__Task__PersonsAssignment_3 ) ) ( ( rule__Task__PersonsAssignment_3 )* ) ) )
            // InternalMergerDsl.g:588:1: ( ( ( rule__Task__PersonsAssignment_3 ) ) ( ( rule__Task__PersonsAssignment_3 )* ) )
            {
            // InternalMergerDsl.g:588:1: ( ( ( rule__Task__PersonsAssignment_3 ) ) ( ( rule__Task__PersonsAssignment_3 )* ) )
            // InternalMergerDsl.g:589:2: ( ( rule__Task__PersonsAssignment_3 ) ) ( ( rule__Task__PersonsAssignment_3 )* )
            {
            // InternalMergerDsl.g:589:2: ( ( rule__Task__PersonsAssignment_3 ) )
            // InternalMergerDsl.g:590:3: ( rule__Task__PersonsAssignment_3 )
            {
             before(grammarAccess.getTaskAccess().getPersonsAssignment_3()); 
            // InternalMergerDsl.g:591:3: ( rule__Task__PersonsAssignment_3 )
            // InternalMergerDsl.g:591:4: rule__Task__PersonsAssignment_3
            {
            pushFollow(FOLLOW_9);
            rule__Task__PersonsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getPersonsAssignment_3()); 

            }

            // InternalMergerDsl.g:594:2: ( ( rule__Task__PersonsAssignment_3 )* )
            // InternalMergerDsl.g:595:3: ( rule__Task__PersonsAssignment_3 )*
            {
             before(grammarAccess.getTaskAccess().getPersonsAssignment_3()); 
            // InternalMergerDsl.g:596:3: ( rule__Task__PersonsAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_ID) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMergerDsl.g:596:4: rule__Task__PersonsAssignment_3
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Task__PersonsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getTaskAccess().getPersonsAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__3__Impl"


    // $ANTLR start "rule__Task__Group__4"
    // InternalMergerDsl.g:605:1: rule__Task__Group__4 : rule__Task__Group__4__Impl rule__Task__Group__5 ;
    public final void rule__Task__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:609:1: ( rule__Task__Group__4__Impl rule__Task__Group__5 )
            // InternalMergerDsl.g:610:2: rule__Task__Group__4__Impl rule__Task__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Task__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__4"


    // $ANTLR start "rule__Task__Group__4__Impl"
    // InternalMergerDsl.g:617:1: rule__Task__Group__4__Impl : ( 'priority:' ) ;
    public final void rule__Task__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:621:1: ( ( 'priority:' ) )
            // InternalMergerDsl.g:622:1: ( 'priority:' )
            {
            // InternalMergerDsl.g:622:1: ( 'priority:' )
            // InternalMergerDsl.g:623:2: 'priority:'
            {
             before(grammarAccess.getTaskAccess().getPriorityKeyword_4()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getPriorityKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__4__Impl"


    // $ANTLR start "rule__Task__Group__5"
    // InternalMergerDsl.g:632:1: rule__Task__Group__5 : rule__Task__Group__5__Impl rule__Task__Group__6 ;
    public final void rule__Task__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:636:1: ( rule__Task__Group__5__Impl rule__Task__Group__6 )
            // InternalMergerDsl.g:637:2: rule__Task__Group__5__Impl rule__Task__Group__6
            {
            pushFollow(FOLLOW_11);
            rule__Task__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__5"


    // $ANTLR start "rule__Task__Group__5__Impl"
    // InternalMergerDsl.g:644:1: rule__Task__Group__5__Impl : ( ( rule__Task__PrioAssignment_5 ) ) ;
    public final void rule__Task__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:648:1: ( ( ( rule__Task__PrioAssignment_5 ) ) )
            // InternalMergerDsl.g:649:1: ( ( rule__Task__PrioAssignment_5 ) )
            {
            // InternalMergerDsl.g:649:1: ( ( rule__Task__PrioAssignment_5 ) )
            // InternalMergerDsl.g:650:2: ( rule__Task__PrioAssignment_5 )
            {
             before(grammarAccess.getTaskAccess().getPrioAssignment_5()); 
            // InternalMergerDsl.g:651:2: ( rule__Task__PrioAssignment_5 )
            // InternalMergerDsl.g:651:3: rule__Task__PrioAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Task__PrioAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getPrioAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__5__Impl"


    // $ANTLR start "rule__Task__Group__6"
    // InternalMergerDsl.g:659:1: rule__Task__Group__6 : rule__Task__Group__6__Impl ;
    public final void rule__Task__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:663:1: ( rule__Task__Group__6__Impl )
            // InternalMergerDsl.g:664:2: rule__Task__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__6"


    // $ANTLR start "rule__Task__Group__6__Impl"
    // InternalMergerDsl.g:670:1: rule__Task__Group__6__Impl : ( ( rule__Task__Group_6__0 )? ) ;
    public final void rule__Task__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:674:1: ( ( ( rule__Task__Group_6__0 )? ) )
            // InternalMergerDsl.g:675:1: ( ( rule__Task__Group_6__0 )? )
            {
            // InternalMergerDsl.g:675:1: ( ( rule__Task__Group_6__0 )? )
            // InternalMergerDsl.g:676:2: ( rule__Task__Group_6__0 )?
            {
             before(grammarAccess.getTaskAccess().getGroup_6()); 
            // InternalMergerDsl.g:677:2: ( rule__Task__Group_6__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMergerDsl.g:677:3: rule__Task__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Task__Group_6__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTaskAccess().getGroup_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group__6__Impl"


    // $ANTLR start "rule__Task__Group_6__0"
    // InternalMergerDsl.g:686:1: rule__Task__Group_6__0 : rule__Task__Group_6__0__Impl rule__Task__Group_6__1 ;
    public final void rule__Task__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:690:1: ( rule__Task__Group_6__0__Impl rule__Task__Group_6__1 )
            // InternalMergerDsl.g:691:2: rule__Task__Group_6__0__Impl rule__Task__Group_6__1
            {
            pushFollow(FOLLOW_10);
            rule__Task__Group_6__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group_6__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_6__0"


    // $ANTLR start "rule__Task__Group_6__0__Impl"
    // InternalMergerDsl.g:698:1: rule__Task__Group_6__0__Impl : ( 'duration:' ) ;
    public final void rule__Task__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:702:1: ( ( 'duration:' ) )
            // InternalMergerDsl.g:703:1: ( 'duration:' )
            {
            // InternalMergerDsl.g:703:1: ( 'duration:' )
            // InternalMergerDsl.g:704:2: 'duration:'
            {
             before(grammarAccess.getTaskAccess().getDurationKeyword_6_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getDurationKeyword_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_6__0__Impl"


    // $ANTLR start "rule__Task__Group_6__1"
    // InternalMergerDsl.g:713:1: rule__Task__Group_6__1 : rule__Task__Group_6__1__Impl rule__Task__Group_6__2 ;
    public final void rule__Task__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:717:1: ( rule__Task__Group_6__1__Impl rule__Task__Group_6__2 )
            // InternalMergerDsl.g:718:2: rule__Task__Group_6__1__Impl rule__Task__Group_6__2
            {
            pushFollow(FOLLOW_12);
            rule__Task__Group_6__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Task__Group_6__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_6__1"


    // $ANTLR start "rule__Task__Group_6__1__Impl"
    // InternalMergerDsl.g:725:1: rule__Task__Group_6__1__Impl : ( ( rule__Task__DlAssignment_6_1 ) ) ;
    public final void rule__Task__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:729:1: ( ( ( rule__Task__DlAssignment_6_1 ) ) )
            // InternalMergerDsl.g:730:1: ( ( rule__Task__DlAssignment_6_1 ) )
            {
            // InternalMergerDsl.g:730:1: ( ( rule__Task__DlAssignment_6_1 ) )
            // InternalMergerDsl.g:731:2: ( rule__Task__DlAssignment_6_1 )
            {
             before(grammarAccess.getTaskAccess().getDlAssignment_6_1()); 
            // InternalMergerDsl.g:732:2: ( rule__Task__DlAssignment_6_1 )
            // InternalMergerDsl.g:732:3: rule__Task__DlAssignment_6_1
            {
            pushFollow(FOLLOW_2);
            rule__Task__DlAssignment_6_1();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getDlAssignment_6_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_6__1__Impl"


    // $ANTLR start "rule__Task__Group_6__2"
    // InternalMergerDsl.g:740:1: rule__Task__Group_6__2 : rule__Task__Group_6__2__Impl ;
    public final void rule__Task__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:744:1: ( rule__Task__Group_6__2__Impl )
            // InternalMergerDsl.g:745:2: rule__Task__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Task__Group_6__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_6__2"


    // $ANTLR start "rule__Task__Group_6__2__Impl"
    // InternalMergerDsl.g:751:1: rule__Task__Group_6__2__Impl : ( ( rule__Task__UnitAssignment_6_2 ) ) ;
    public final void rule__Task__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:755:1: ( ( ( rule__Task__UnitAssignment_6_2 ) ) )
            // InternalMergerDsl.g:756:1: ( ( rule__Task__UnitAssignment_6_2 ) )
            {
            // InternalMergerDsl.g:756:1: ( ( rule__Task__UnitAssignment_6_2 ) )
            // InternalMergerDsl.g:757:2: ( rule__Task__UnitAssignment_6_2 )
            {
             before(grammarAccess.getTaskAccess().getUnitAssignment_6_2()); 
            // InternalMergerDsl.g:758:2: ( rule__Task__UnitAssignment_6_2 )
            // InternalMergerDsl.g:758:3: rule__Task__UnitAssignment_6_2
            {
            pushFollow(FOLLOW_2);
            rule__Task__UnitAssignment_6_2();

            state._fsp--;


            }

             after(grammarAccess.getTaskAccess().getUnitAssignment_6_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__Group_6__2__Impl"


    // $ANTLR start "rule__LunchAction__Group__0"
    // InternalMergerDsl.g:767:1: rule__LunchAction__Group__0 : rule__LunchAction__Group__0__Impl rule__LunchAction__Group__1 ;
    public final void rule__LunchAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:771:1: ( rule__LunchAction__Group__0__Impl rule__LunchAction__Group__1 )
            // InternalMergerDsl.g:772:2: rule__LunchAction__Group__0__Impl rule__LunchAction__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__LunchAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LunchAction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LunchAction__Group__0"


    // $ANTLR start "rule__LunchAction__Group__0__Impl"
    // InternalMergerDsl.g:779:1: rule__LunchAction__Group__0__Impl : ( 'Lunch' ) ;
    public final void rule__LunchAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:783:1: ( ( 'Lunch' ) )
            // InternalMergerDsl.g:784:1: ( 'Lunch' )
            {
            // InternalMergerDsl.g:784:1: ( 'Lunch' )
            // InternalMergerDsl.g:785:2: 'Lunch'
            {
             before(grammarAccess.getLunchActionAccess().getLunchKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getLunchActionAccess().getLunchKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LunchAction__Group__0__Impl"


    // $ANTLR start "rule__LunchAction__Group__1"
    // InternalMergerDsl.g:794:1: rule__LunchAction__Group__1 : rule__LunchAction__Group__1__Impl ;
    public final void rule__LunchAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:798:1: ( rule__LunchAction__Group__1__Impl )
            // InternalMergerDsl.g:799:2: rule__LunchAction__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LunchAction__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LunchAction__Group__1"


    // $ANTLR start "rule__LunchAction__Group__1__Impl"
    // InternalMergerDsl.g:805:1: rule__LunchAction__Group__1__Impl : ( ( rule__LunchAction__LocationAssignment_1 ) ) ;
    public final void rule__LunchAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:809:1: ( ( ( rule__LunchAction__LocationAssignment_1 ) ) )
            // InternalMergerDsl.g:810:1: ( ( rule__LunchAction__LocationAssignment_1 ) )
            {
            // InternalMergerDsl.g:810:1: ( ( rule__LunchAction__LocationAssignment_1 ) )
            // InternalMergerDsl.g:811:2: ( rule__LunchAction__LocationAssignment_1 )
            {
             before(grammarAccess.getLunchActionAccess().getLocationAssignment_1()); 
            // InternalMergerDsl.g:812:2: ( rule__LunchAction__LocationAssignment_1 )
            // InternalMergerDsl.g:812:3: rule__LunchAction__LocationAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LunchAction__LocationAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLunchActionAccess().getLocationAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LunchAction__Group__1__Impl"


    // $ANTLR start "rule__MeetingAction__Group__0"
    // InternalMergerDsl.g:821:1: rule__MeetingAction__Group__0 : rule__MeetingAction__Group__0__Impl rule__MeetingAction__Group__1 ;
    public final void rule__MeetingAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:825:1: ( rule__MeetingAction__Group__0__Impl rule__MeetingAction__Group__1 )
            // InternalMergerDsl.g:826:2: rule__MeetingAction__Group__0__Impl rule__MeetingAction__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__MeetingAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MeetingAction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeetingAction__Group__0"


    // $ANTLR start "rule__MeetingAction__Group__0__Impl"
    // InternalMergerDsl.g:833:1: rule__MeetingAction__Group__0__Impl : ( 'Meeting' ) ;
    public final void rule__MeetingAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:837:1: ( ( 'Meeting' ) )
            // InternalMergerDsl.g:838:1: ( 'Meeting' )
            {
            // InternalMergerDsl.g:838:1: ( 'Meeting' )
            // InternalMergerDsl.g:839:2: 'Meeting'
            {
             before(grammarAccess.getMeetingActionAccess().getMeetingKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMeetingActionAccess().getMeetingKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeetingAction__Group__0__Impl"


    // $ANTLR start "rule__MeetingAction__Group__1"
    // InternalMergerDsl.g:848:1: rule__MeetingAction__Group__1 : rule__MeetingAction__Group__1__Impl ;
    public final void rule__MeetingAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:852:1: ( rule__MeetingAction__Group__1__Impl )
            // InternalMergerDsl.g:853:2: rule__MeetingAction__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MeetingAction__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeetingAction__Group__1"


    // $ANTLR start "rule__MeetingAction__Group__1__Impl"
    // InternalMergerDsl.g:859:1: rule__MeetingAction__Group__1__Impl : ( ( rule__MeetingAction__TopicAssignment_1 ) ) ;
    public final void rule__MeetingAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:863:1: ( ( ( rule__MeetingAction__TopicAssignment_1 ) ) )
            // InternalMergerDsl.g:864:1: ( ( rule__MeetingAction__TopicAssignment_1 ) )
            {
            // InternalMergerDsl.g:864:1: ( ( rule__MeetingAction__TopicAssignment_1 ) )
            // InternalMergerDsl.g:865:2: ( rule__MeetingAction__TopicAssignment_1 )
            {
             before(grammarAccess.getMeetingActionAccess().getTopicAssignment_1()); 
            // InternalMergerDsl.g:866:2: ( rule__MeetingAction__TopicAssignment_1 )
            // InternalMergerDsl.g:866:3: rule__MeetingAction__TopicAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MeetingAction__TopicAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMeetingActionAccess().getTopicAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeetingAction__Group__1__Impl"


    // $ANTLR start "rule__PaperAction__Group__0"
    // InternalMergerDsl.g:875:1: rule__PaperAction__Group__0 : rule__PaperAction__Group__0__Impl rule__PaperAction__Group__1 ;
    public final void rule__PaperAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:879:1: ( rule__PaperAction__Group__0__Impl rule__PaperAction__Group__1 )
            // InternalMergerDsl.g:880:2: rule__PaperAction__Group__0__Impl rule__PaperAction__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__PaperAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PaperAction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaperAction__Group__0"


    // $ANTLR start "rule__PaperAction__Group__0__Impl"
    // InternalMergerDsl.g:887:1: rule__PaperAction__Group__0__Impl : ( 'Report' ) ;
    public final void rule__PaperAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:891:1: ( ( 'Report' ) )
            // InternalMergerDsl.g:892:1: ( 'Report' )
            {
            // InternalMergerDsl.g:892:1: ( 'Report' )
            // InternalMergerDsl.g:893:2: 'Report'
            {
             before(grammarAccess.getPaperActionAccess().getReportKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getPaperActionAccess().getReportKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaperAction__Group__0__Impl"


    // $ANTLR start "rule__PaperAction__Group__1"
    // InternalMergerDsl.g:902:1: rule__PaperAction__Group__1 : rule__PaperAction__Group__1__Impl ;
    public final void rule__PaperAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:906:1: ( rule__PaperAction__Group__1__Impl )
            // InternalMergerDsl.g:907:2: rule__PaperAction__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PaperAction__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaperAction__Group__1"


    // $ANTLR start "rule__PaperAction__Group__1__Impl"
    // InternalMergerDsl.g:913:1: rule__PaperAction__Group__1__Impl : ( ( rule__PaperAction__ReportAssignment_1 ) ) ;
    public final void rule__PaperAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:917:1: ( ( ( rule__PaperAction__ReportAssignment_1 ) ) )
            // InternalMergerDsl.g:918:1: ( ( rule__PaperAction__ReportAssignment_1 ) )
            {
            // InternalMergerDsl.g:918:1: ( ( rule__PaperAction__ReportAssignment_1 ) )
            // InternalMergerDsl.g:919:2: ( rule__PaperAction__ReportAssignment_1 )
            {
             before(grammarAccess.getPaperActionAccess().getReportAssignment_1()); 
            // InternalMergerDsl.g:920:2: ( rule__PaperAction__ReportAssignment_1 )
            // InternalMergerDsl.g:920:3: rule__PaperAction__ReportAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PaperAction__ReportAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPaperActionAccess().getReportAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaperAction__Group__1__Impl"


    // $ANTLR start "rule__PaymentAction__Group__0"
    // InternalMergerDsl.g:929:1: rule__PaymentAction__Group__0 : rule__PaymentAction__Group__0__Impl rule__PaymentAction__Group__1 ;
    public final void rule__PaymentAction__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:933:1: ( rule__PaymentAction__Group__0__Impl rule__PaymentAction__Group__1 )
            // InternalMergerDsl.g:934:2: rule__PaymentAction__Group__0__Impl rule__PaymentAction__Group__1
            {
            pushFollow(FOLLOW_10);
            rule__PaymentAction__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PaymentAction__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentAction__Group__0"


    // $ANTLR start "rule__PaymentAction__Group__0__Impl"
    // InternalMergerDsl.g:941:1: rule__PaymentAction__Group__0__Impl : ( 'Pay' ) ;
    public final void rule__PaymentAction__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:945:1: ( ( 'Pay' ) )
            // InternalMergerDsl.g:946:1: ( 'Pay' )
            {
            // InternalMergerDsl.g:946:1: ( 'Pay' )
            // InternalMergerDsl.g:947:2: 'Pay'
            {
             before(grammarAccess.getPaymentActionAccess().getPayKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPaymentActionAccess().getPayKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentAction__Group__0__Impl"


    // $ANTLR start "rule__PaymentAction__Group__1"
    // InternalMergerDsl.g:956:1: rule__PaymentAction__Group__1 : rule__PaymentAction__Group__1__Impl rule__PaymentAction__Group__2 ;
    public final void rule__PaymentAction__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:960:1: ( rule__PaymentAction__Group__1__Impl rule__PaymentAction__Group__2 )
            // InternalMergerDsl.g:961:2: rule__PaymentAction__Group__1__Impl rule__PaymentAction__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__PaymentAction__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PaymentAction__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentAction__Group__1"


    // $ANTLR start "rule__PaymentAction__Group__1__Impl"
    // InternalMergerDsl.g:968:1: rule__PaymentAction__Group__1__Impl : ( ( rule__PaymentAction__AmountAssignment_1 ) ) ;
    public final void rule__PaymentAction__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:972:1: ( ( ( rule__PaymentAction__AmountAssignment_1 ) ) )
            // InternalMergerDsl.g:973:1: ( ( rule__PaymentAction__AmountAssignment_1 ) )
            {
            // InternalMergerDsl.g:973:1: ( ( rule__PaymentAction__AmountAssignment_1 ) )
            // InternalMergerDsl.g:974:2: ( rule__PaymentAction__AmountAssignment_1 )
            {
             before(grammarAccess.getPaymentActionAccess().getAmountAssignment_1()); 
            // InternalMergerDsl.g:975:2: ( rule__PaymentAction__AmountAssignment_1 )
            // InternalMergerDsl.g:975:3: rule__PaymentAction__AmountAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PaymentAction__AmountAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPaymentActionAccess().getAmountAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentAction__Group__1__Impl"


    // $ANTLR start "rule__PaymentAction__Group__2"
    // InternalMergerDsl.g:983:1: rule__PaymentAction__Group__2 : rule__PaymentAction__Group__2__Impl ;
    public final void rule__PaymentAction__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:987:1: ( rule__PaymentAction__Group__2__Impl )
            // InternalMergerDsl.g:988:2: rule__PaymentAction__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PaymentAction__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentAction__Group__2"


    // $ANTLR start "rule__PaymentAction__Group__2__Impl"
    // InternalMergerDsl.g:994:1: rule__PaymentAction__Group__2__Impl : ( 'euro' ) ;
    public final void rule__PaymentAction__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:998:1: ( ( 'euro' ) )
            // InternalMergerDsl.g:999:1: ( 'euro' )
            {
            // InternalMergerDsl.g:999:1: ( 'euro' )
            // InternalMergerDsl.g:1000:2: 'euro'
            {
             before(grammarAccess.getPaymentActionAccess().getEuroKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getPaymentActionAccess().getEuroKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentAction__Group__2__Impl"


    // $ANTLR start "rule__Planning__NameAssignment_1"
    // InternalMergerDsl.g:1010:1: rule__Planning__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Planning__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:1014:1: ( ( RULE_ID ) )
            // InternalMergerDsl.g:1015:2: ( RULE_ID )
            {
            // InternalMergerDsl.g:1015:2: ( RULE_ID )
            // InternalMergerDsl.g:1016:3: RULE_ID
            {
             before(grammarAccess.getPlanningAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPlanningAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Planning__NameAssignment_1"


    // $ANTLR start "rule__Planning__PersonsAssignment_2_0"
    // InternalMergerDsl.g:1025:1: rule__Planning__PersonsAssignment_2_0 : ( rulePerson ) ;
    public final void rule__Planning__PersonsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:1029:1: ( ( rulePerson ) )
            // InternalMergerDsl.g:1030:2: ( rulePerson )
            {
            // InternalMergerDsl.g:1030:2: ( rulePerson )
            // InternalMergerDsl.g:1031:3: rulePerson
            {
             before(grammarAccess.getPlanningAccess().getPersonsPersonParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_2);
            rulePerson();

            state._fsp--;

             after(grammarAccess.getPlanningAccess().getPersonsPersonParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Planning__PersonsAssignment_2_0"


    // $ANTLR start "rule__Planning__TasksAssignment_2_1"
    // InternalMergerDsl.g:1040:1: rule__Planning__TasksAssignment_2_1 : ( ruleTask ) ;
    public final void rule__Planning__TasksAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:1044:1: ( ( ruleTask ) )
            // InternalMergerDsl.g:1045:2: ( ruleTask )
            {
            // InternalMergerDsl.g:1045:2: ( ruleTask )
            // InternalMergerDsl.g:1046:3: ruleTask
            {
             before(grammarAccess.getPlanningAccess().getTasksTaskParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleTask();

            state._fsp--;

             after(grammarAccess.getPlanningAccess().getTasksTaskParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Planning__TasksAssignment_2_1"


    // $ANTLR start "rule__Person__NameAssignment_1"
    // InternalMergerDsl.g:1055:1: rule__Person__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Person__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:1059:1: ( ( RULE_ID ) )
            // InternalMergerDsl.g:1060:2: ( RULE_ID )
            {
            // InternalMergerDsl.g:1060:2: ( RULE_ID )
            // InternalMergerDsl.g:1061:3: RULE_ID
            {
             before(grammarAccess.getPersonAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPersonAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Person__NameAssignment_1"


    // $ANTLR start "rule__Task__ActionAssignment_1"
    // InternalMergerDsl.g:1070:1: rule__Task__ActionAssignment_1 : ( ruleAction ) ;
    public final void rule__Task__ActionAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:1074:1: ( ( ruleAction ) )
            // InternalMergerDsl.g:1075:2: ( ruleAction )
            {
            // InternalMergerDsl.g:1075:2: ( ruleAction )
            // InternalMergerDsl.g:1076:3: ruleAction
            {
             before(grammarAccess.getTaskAccess().getActionActionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleAction();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getActionActionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__ActionAssignment_1"


    // $ANTLR start "rule__Task__PersonsAssignment_3"
    // InternalMergerDsl.g:1085:1: rule__Task__PersonsAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__Task__PersonsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:1089:1: ( ( ( RULE_ID ) ) )
            // InternalMergerDsl.g:1090:2: ( ( RULE_ID ) )
            {
            // InternalMergerDsl.g:1090:2: ( ( RULE_ID ) )
            // InternalMergerDsl.g:1091:3: ( RULE_ID )
            {
             before(grammarAccess.getTaskAccess().getPersonsPersonCrossReference_3_0()); 
            // InternalMergerDsl.g:1092:3: ( RULE_ID )
            // InternalMergerDsl.g:1093:4: RULE_ID
            {
             before(grammarAccess.getTaskAccess().getPersonsPersonIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getPersonsPersonIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getTaskAccess().getPersonsPersonCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__PersonsAssignment_3"


    // $ANTLR start "rule__Task__PrioAssignment_5"
    // InternalMergerDsl.g:1104:1: rule__Task__PrioAssignment_5 : ( RULE_INT ) ;
    public final void rule__Task__PrioAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:1108:1: ( ( RULE_INT ) )
            // InternalMergerDsl.g:1109:2: ( RULE_INT )
            {
            // InternalMergerDsl.g:1109:2: ( RULE_INT )
            // InternalMergerDsl.g:1110:3: RULE_INT
            {
             before(grammarAccess.getTaskAccess().getPrioINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getPrioINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__PrioAssignment_5"


    // $ANTLR start "rule__Task__DlAssignment_6_1"
    // InternalMergerDsl.g:1119:1: rule__Task__DlAssignment_6_1 : ( RULE_INT ) ;
    public final void rule__Task__DlAssignment_6_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:1123:1: ( ( RULE_INT ) )
            // InternalMergerDsl.g:1124:2: ( RULE_INT )
            {
            // InternalMergerDsl.g:1124:2: ( RULE_INT )
            // InternalMergerDsl.g:1125:3: RULE_INT
            {
             before(grammarAccess.getTaskAccess().getDlINTTerminalRuleCall_6_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getTaskAccess().getDlINTTerminalRuleCall_6_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__DlAssignment_6_1"


    // $ANTLR start "rule__Task__UnitAssignment_6_2"
    // InternalMergerDsl.g:1134:1: rule__Task__UnitAssignment_6_2 : ( ruleTimeUnit ) ;
    public final void rule__Task__UnitAssignment_6_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:1138:1: ( ( ruleTimeUnit ) )
            // InternalMergerDsl.g:1139:2: ( ruleTimeUnit )
            {
            // InternalMergerDsl.g:1139:2: ( ruleTimeUnit )
            // InternalMergerDsl.g:1140:3: ruleTimeUnit
            {
             before(grammarAccess.getTaskAccess().getUnitTimeUnitEnumRuleCall_6_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTimeUnit();

            state._fsp--;

             after(grammarAccess.getTaskAccess().getUnitTimeUnitEnumRuleCall_6_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Task__UnitAssignment_6_2"


    // $ANTLR start "rule__LunchAction__LocationAssignment_1"
    // InternalMergerDsl.g:1149:1: rule__LunchAction__LocationAssignment_1 : ( RULE_ID ) ;
    public final void rule__LunchAction__LocationAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:1153:1: ( ( RULE_ID ) )
            // InternalMergerDsl.g:1154:2: ( RULE_ID )
            {
            // InternalMergerDsl.g:1154:2: ( RULE_ID )
            // InternalMergerDsl.g:1155:3: RULE_ID
            {
             before(grammarAccess.getLunchActionAccess().getLocationIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLunchActionAccess().getLocationIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LunchAction__LocationAssignment_1"


    // $ANTLR start "rule__MeetingAction__TopicAssignment_1"
    // InternalMergerDsl.g:1164:1: rule__MeetingAction__TopicAssignment_1 : ( RULE_STRING ) ;
    public final void rule__MeetingAction__TopicAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:1168:1: ( ( RULE_STRING ) )
            // InternalMergerDsl.g:1169:2: ( RULE_STRING )
            {
            // InternalMergerDsl.g:1169:2: ( RULE_STRING )
            // InternalMergerDsl.g:1170:3: RULE_STRING
            {
             before(grammarAccess.getMeetingActionAccess().getTopicSTRINGTerminalRuleCall_1_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMeetingActionAccess().getTopicSTRINGTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MeetingAction__TopicAssignment_1"


    // $ANTLR start "rule__PaperAction__ReportAssignment_1"
    // InternalMergerDsl.g:1179:1: rule__PaperAction__ReportAssignment_1 : ( RULE_ID ) ;
    public final void rule__PaperAction__ReportAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:1183:1: ( ( RULE_ID ) )
            // InternalMergerDsl.g:1184:2: ( RULE_ID )
            {
            // InternalMergerDsl.g:1184:2: ( RULE_ID )
            // InternalMergerDsl.g:1185:3: RULE_ID
            {
             before(grammarAccess.getPaperActionAccess().getReportIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPaperActionAccess().getReportIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaperAction__ReportAssignment_1"


    // $ANTLR start "rule__PaymentAction__AmountAssignment_1"
    // InternalMergerDsl.g:1194:1: rule__PaymentAction__AmountAssignment_1 : ( RULE_INT ) ;
    public final void rule__PaymentAction__AmountAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMergerDsl.g:1198:1: ( ( RULE_INT ) )
            // InternalMergerDsl.g:1199:2: ( RULE_INT )
            {
            // InternalMergerDsl.g:1199:2: ( RULE_INT )
            // InternalMergerDsl.g:1200:3: RULE_INT
            {
             before(grammarAccess.getPaymentActionAccess().getAmountINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPaymentActionAccess().getAmountINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PaymentAction__AmountAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000030002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000001E00000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000007800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000002000000L});

}