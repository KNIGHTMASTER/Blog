<%@ page import="simplegrailscrud.Bank" %>



<div class="fieldcontain ${hasErrors(bean: bankInstance, field: 'bankCode', 'error')} ">
	<label for="bankCode">
		<g:message code="bank.bankCode.label" default="Bank Code" />
		
	</label>
	<g:textField name="bankCode" value="${bankInstance?.bankCode}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: bankInstance, field: 'bankName', 'error')} ">
	<label for="bankName">
		<g:message code="bank.bankName.label" default="Bank Name" />
		
	</label>
	<g:textField name="bankName" value="${bankInstance?.bankName}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: bankInstance, field: 'location', 'error')} ">
	<label for="location">
		<g:message code="bank.location.label" default="Location" />
		
	</label>
	<g:textArea name="location" cols="40" rows="5" maxlength="2000" value="${bankInstance?.location}"/>
</div>

