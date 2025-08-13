import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';
import '@vaadin/button/src/vaadin-button.js';

@customElement('vista-verhashtagnoregistrado')
export class VistaVerhashtagnoregistrado extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout1">
 <vaadin-vertical-layout id="hashtag" style="align-self: center; height: 1%; padding-bottom: var(--lumo-space-xl); padding-top: var(--lumo-space-m);">
  #hastag
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" id="tweets" style="width: 100%; height: 80%; padding-right: var(--lumo-space-m); padding-left: var(--lumo-space-m);"></vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout" style="align-self: center; width: 10%; padding-top: var(--lumo-space-m);">
  <vaadin-button id="volver" style="align-self: center; width: 100%;" tabindex="0">
   Volver
  </vaadin-button>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
