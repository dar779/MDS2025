import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vertical-layout/src/vaadin-vertical-layout.js';
import '@vaadin/button/src/vaadin-button.js';

@customElement('vista-verhashtagregistrado')
export class VistaVerhashtagregistrado extends LitElement {
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
 <vaadin-vertical-layout id="hashtag" style="height: 1%; align-self: center; padding-top: var(--lumo-space-m); padding-bottom: var(--lumo-space-xl);">
  #hastag
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" id="tweets" style="padding-right: var(--lumo-space-m); padding-left: var(--lumo-space-m); height: 80%; width: 100%;"></vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout" style="width: 10%; padding-top: var(--lumo-space-m); align-self: center;">
  <vaadin-button id="volver" style="width: 100%; align-self: center;" tabindex="0">
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
